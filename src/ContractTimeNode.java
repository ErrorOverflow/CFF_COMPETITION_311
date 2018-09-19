public class ContractTimeNode {
    public LocalTrafficMonthNode[] localTrafficMonthNodes;

    public ContractTimeNode() {
        this.localTrafficMonthNodes = new LocalTrafficMonthNode[5];
        for (int i = 0; i < 5; i++) {
            this.localTrafficMonthNodes[i] = new LocalTrafficMonthNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i <5; i++) {
                this.localTrafficMonthNodes[i].select(ref,true);
            }
            return;
        }
        try {
            this.localTrafficMonthNodes[(int) ((Double.valueOf(ref[0]))/1)].select(ref, false);
        } catch (Exception e) {
            this.localTrafficMonthNodes[5-1].select(ref, false);
        }
    }
}
