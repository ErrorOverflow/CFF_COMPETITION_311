public class LocalCallerTimeNode {
    private double low;
    private double high;
    public OnlineTimeNode[] onlineTimeNode;

    public LocalCallerTimeNode(double low, double high) {
        this.low = low;
        this.high = high;
        this.onlineTimeNode = new OnlineTimeNode[30];
        for (int i = 0; i < 30; i++) {
            this.onlineTimeNode[i] = new OnlineTimeNode(5 * i, 5 * (i + 1));
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i < 30; i++) {
                this.onlineTimeNode[i].select(ref,true);
            }
            return;
        }
        try {
            this.onlineTimeNode[(int) ((Double.valueOf(ref[2])) / 10)].select(ref, false);
        } catch (Exception e) {

        }
    }
}
