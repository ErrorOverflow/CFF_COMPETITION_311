public class NetServiceNode {
    public PayNumNode[] payNumNode;

    public NetServiceNode() {
        this.payNumNode = new PayNumNode[10];
        for (int i = 0; i < 10; i++) {
            this.payNumNode[i] = new PayNumNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < 10; i++) {
                this.payNumNode[i].select(ref, true);
            }
            return;
        }
        try {
            this.payNumNode[(int) ((Double.valueOf(ref[14])) / 50)].select(ref, false);
        } catch (Exception e) {
            this.payNumNode[10 - 1].select(ref, false);
        }
    }
}
