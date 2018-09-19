public class MonthTrafficNode {
    public PayNumNode[] payNumNode;

    public MonthTrafficNode() {
        this.payNumNode = new PayNumNode[60];
        for (int i = 0; i < 60; i++) {
            this.payNumNode[i] = new PayNumNode();
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
