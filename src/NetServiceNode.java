public class NetServiceNode {
    public PayNumNode[] payNumNode;
    private int[] space;
    private int[] num;

    public NetServiceNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.payNumNode = new PayNumNode[this.num[6]];
        for (int i = 0; i < this.num[6]; i++) {
            this.payNumNode[i] = new PayNumNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[6]; i++) {
                this.payNumNode[i].select(ref, true);
            }
            return;
        }
        try {
            this.payNumNode[(int) ((Double.valueOf(ref[14])) / this.space[6])].select(ref, false);
        } catch (Exception e) {
            this.payNumNode[this.num[6] - 1].select(ref, false);
        }
    }
}
