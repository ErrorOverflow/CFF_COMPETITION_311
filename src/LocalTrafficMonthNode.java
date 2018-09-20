public class LocalTrafficMonthNode {
    public NetServiceNode[] netServiceNodes;
    private int[] space;
    private int[] num;

    public LocalTrafficMonthNode(int[] s,int[] n) {
        this.space=s;
        this.num=n;
        this.netServiceNodes = new NetServiceNode[this.num[5]];
        for (int i = 0; i < this.num[5]; i++) {
            this.netServiceNodes[i] = new NetServiceNode(s,n);
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[5]; i++) {
                this.netServiceNodes[i].select(ref, true);
            }
            return;
        }
        try {
            this.netServiceNodes[(int) (((Double.valueOf(ref[12]))+1) / this.space[5]) - 1].select(ref, false);
        } catch (Exception e) {
            this.netServiceNodes[this.num[5] - 1].select(ref, false);
        }
    }
}
