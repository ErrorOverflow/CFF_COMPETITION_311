public class LocalTrafficMonthNode {
    public NetServiceNode[] netServiceNodes;

    public LocalTrafficMonthNode() {
        this.netServiceNodes = new NetServiceNode[3];
        for (int i = 0; i < 3; i++) {
            this.netServiceNodes[i] = new NetServiceNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < 3; i++) {
                this.netServiceNodes[i].select(ref, true);
            }
            return;
        }
        try {
            this.netServiceNodes[(int) ((Double.valueOf(ref[12])) / 1) - 2].select(ref, false);
        } catch (Exception e) {
            this.netServiceNodes[3 - 1].select(ref, false);
        }
    }
}
