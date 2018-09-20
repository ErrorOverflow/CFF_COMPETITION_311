public class Service2CallerTimeNode {
    public PayNumNode[] payNumNode;
    private int[] space;
    private int[] num;

    public Service2CallerTimeNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.payNumNode = new PayNumNode[this.num[8]];
        for (int i = 0; i < this.num[8]; i++) {
            this.payNumNode[i] = new PayNumNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[8]; i++) {
                this.payNumNode[i].select(ref, true);
            }
            return;
        }
        try {
            this.payNumNode[(int) ((Double.valueOf(ref[14])) / this.space[8])].select(ref, false);
        } catch (Exception e) {
            this.payNumNode[this.num[8] - 1].select(ref, false);
        }
    }
}
