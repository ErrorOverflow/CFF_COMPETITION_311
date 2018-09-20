public class LocalTrafficMonthNode {
    public NetServiceNode[] netServiceNodes;

    public LocalTrafficMonthNode() {
        this.netServiceNodes = new NetServiceNode[2];
        for (int i = 0; i < 2; i++) {
            this.netServiceNodes[i] = new NetServiceNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < 2; i++) {
                this.netServiceNodes[i].select(ref, true);
            }
            return;
        }
        try {
            this.netServiceNodes[(int) (((Double.valueOf(ref[12]))+1) / 2) - 1].select(ref, false);
        } catch (Exception e) {
            this.netServiceNodes[2 - 1].select(ref, false);
        }
    }
}
