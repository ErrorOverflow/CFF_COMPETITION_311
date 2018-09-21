/**
 * @author wmlbuaa
 * @date 2018-09-21 14:26
 */
public class LastMonthTrafiicNode {
    public PayNumNode[] payNumNode;
    private int[] space;
    private int[] num;

    public LastMonthTrafiicNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.payNumNode = new PayNumNode[this.num[7]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[7]; i++) {
                try {
                    this.payNumNode[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }

        try {
            this.payNumNode[(int) ((Double.valueOf(ref[14])) / this.space[7])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.payNumNode[this.num[7] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.payNumNode[this.num[7] - 1] = new PayNumNode();
                this.payNumNode[this.num[7] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.payNumNode[(int) ((Double.valueOf(ref[14])) / this.space[7])] = new PayNumNode();
            this.payNumNode[(int) ((Double.valueOf(ref[14])) / this.space[7])].select(ref, false);
        }
    }

    public PayNumNode find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0) {
                if(i<=0){
                    i--;
                }
                i*=-1;
                continue;
            }
            if (this.payNumNode[target + i] != null) {
                return this.payNumNode[target + i];
            }
            if (i <= 0) {
                i--;
            }
            i *= -1;
        }
    }
}
