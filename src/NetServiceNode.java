public class NetServiceNode {
    public LastMonthTrafiicNode[] lastMonthTrafiicNodes;
    private int[] space;
    private int[] num;

    public NetServiceNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.lastMonthTrafiicNodes = new LastMonthTrafiicNode[this.num[6]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[6]; i++) {
                try {
                    this.lastMonthTrafiicNodes[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }

        try {
            this.lastMonthTrafiicNodes[(int) ((Double.valueOf(ref[3])) / this.space[6])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.lastMonthTrafiicNodes[this.num[6] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.lastMonthTrafiicNodes[this.num[6] - 1] = new LastMonthTrafiicNode(space,num);
                this.lastMonthTrafiicNodes[this.num[6] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.lastMonthTrafiicNodes[(int) ((Double.valueOf(ref[3])) / this.space[6])] = new LastMonthTrafiicNode(space,num);
            this.lastMonthTrafiicNodes[(int) ((Double.valueOf(ref[3])) / this.space[6])].select(ref, false);
        }
    }

    public LastMonthTrafiicNode find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0) {
                if(i<=0){
                    i--;
                }
                i*=-1;
                continue;
            }
            if (this.lastMonthTrafiicNodes[target + i] != null) {
                return this.lastMonthTrafiicNodes[target + i];
            }
            if (i <= 0) {
                i--;
            }
            i *= -1;
        }
    }
}
