public class LocalTrafficMonthNode {
    public PayNumNode[] payNumNode;

    public LocalTrafficMonthNode() {
        this.payNumNode = new PayNumNode[30];
        for (int i = 0; i < 30; i++) {
            this.payNumNode[i] = new PayNumNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i < 30; i++) {
                this.payNumNode[i].select(ref,true);
            }
            return;
        }
        try {
            this.payNumNode[(int) ((Double.valueOf(ref[14])) / 30)].select(ref, false);
        } catch (Exception e) {
            this.payNumNode[30-1].select(ref, false);
        }
    }
}
