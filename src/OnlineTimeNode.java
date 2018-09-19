public class OnlineTimeNode {
    public MonthTrafficNode[] monthTrafficNodes;

    public OnlineTimeNode() {
        this.monthTrafficNodes = new MonthTrafficNode[35];
        for (int i = 0; i < 35; i++) {
            this.monthTrafficNodes[i] = new MonthTrafficNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < 35; i++) {
                this.monthTrafficNodes[i].select(ref, true);
            }
            return;
        }
        try {
            this.monthTrafficNodes[(int) ((Double.valueOf(ref[7])) / 150)].select(ref, false);
        } catch (Exception e) {
            this.monthTrafficNodes[35 - 1].select(ref, false);
        }
    }
}
