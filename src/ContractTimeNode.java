public class ContractTimeNode {
    public LocalTrafficMonthNode[] localTrafficMonthNodes;
    private int[] space;
    private int[] num;

    public ContractTimeNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.localTrafficMonthNodes = new LocalTrafficMonthNode[this.num[4]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[4]; i++) {
                try {
                    this.localTrafficMonthNodes[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }

        try {
            this.localTrafficMonthNodes[(int) ((Double.valueOf(ref[0])) / this.space[4])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.localTrafficMonthNodes[this.num[4] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.localTrafficMonthNodes[this.num[4] - 1] = new LocalTrafficMonthNode(this.space, this.num);
                this.localTrafficMonthNodes[this.num[4] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.localTrafficMonthNodes[(int) ((Double.valueOf(ref[0])) / this.space[4])] = new LocalTrafficMonthNode(this.space, this.num);
            this.localTrafficMonthNodes[(int) ((Double.valueOf(ref[0])) / this.space[4])].select(ref, false);
        }
    }
    public LocalTrafficMonthNode find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0  || target + i >= this.num[4]) {
                if(i<=0){
                    i--;
                }
                i*=-1;
                continue;
            }
            if (this.localTrafficMonthNodes[target + i] != null) {
                return this.localTrafficMonthNodes[target + i];
            }
            if(i<=0){
                i--;
            }
            i*=-1;
        }
    }
}
