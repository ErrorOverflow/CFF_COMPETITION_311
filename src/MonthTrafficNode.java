public class MonthTrafficNode {
    public ContractTimeNode[] contractTimeNodes;

    public MonthTrafficNode() {
        this.contractTimeNodes = new ContractTimeNode[4];
        for (int i = 0; i < 4; i++) {
            this.contractTimeNodes[i] = new ContractTimeNode();
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i < 4; i++) {
                this.contractTimeNodes[i].select(ref,true);
            }
            return;
        }
        try {
            this.contractTimeNodes[(int) (Double.valueOf(ref[10])/10)].select(ref, false);
        } catch (Exception e) {
        }
    }
}
