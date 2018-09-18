public class MonthTrafficNode {
    private double low;
    private double high;
    public PayNumNode[] payNumNode;

    public MonthTrafficNode(double low, double high) {
        this.low = low;
        this.high = high;
        this.payNumNode = new PayNumNode[60];
        for (int i = 0; i < 60; i++) {
            this.payNumNode[i] = new PayNumNode(10 * i, 10 * (i + 1));
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i < 60; i++) {
                this.payNumNode[i].select(ref,true);
            }
            return;
        }
        try {
            this.payNumNode[(int) ((Double.valueOf(ref[14])) / 10)].select(ref, false);
        } catch (Exception e) {
        }
    }
}
