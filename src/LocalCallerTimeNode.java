public class LocalCallerTimeNode {
    public OnlineTimeNode[] onlineTimeNode;

    public LocalCallerTimeNode() {
        this.onlineTimeNode = new OnlineTimeNode[15];
        for (int i = 0; i < 15; i++) {
            this.onlineTimeNode[i] = new OnlineTimeNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i < 15; i++) {
                this.onlineTimeNode[i].select(ref,true);
            }
            return;
        }
        try {
            this.onlineTimeNode[(int) ((Double.valueOf(ref[2])) / 10)].select(ref, false);
        } catch (Exception e) {
            this.onlineTimeNode[14].select(ref, false);
        }
    }
}
