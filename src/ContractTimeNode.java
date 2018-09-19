public class ContractTimeNode {
    public LocalTrafficMonthNode[] localTrafficMonthNodes;

    public ContractTimeNode() {
        this.localTrafficMonthNodes = new LocalTrafficMonthNode[4];
        for (int i = 0; i < 4; i++) {
            this.localTrafficMonthNodes[i] = new LocalTrafficMonthNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i <4; i++) {
                this.localTrafficMonthNodes[i].select(ref,true);
            }
            return;
        }
        try {
            this.localTrafficMonthNodes[(int) ((Double.valueOf(ref[0]))/1)-1].select(ref, false);
        } catch (Exception e) {
            this.localTrafficMonthNodes[3].select(ref, false);
        }
    }
}
