public class OnlineTimeNode {
    public MonthTrafficNode[] monthTrafficNodes;

    public OnlineTimeNode() {
        this.monthTrafficNodes = new MonthTrafficNode[40];
        for (int i = 0; i < 40; i++) {
            this.monthTrafficNodes[i] = new MonthTrafficNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < 40; i++) {
                this.monthTrafficNodes[i].select(ref, true);
            }
            return;
        }
        try {
            this.monthTrafficNodes[(int) ((Double.valueOf(ref[7])) / 125)].select(ref, false);
        } catch (Exception e) {
            this.monthTrafficNodes[40 - 1].select(ref, false);
        }
    }
}
