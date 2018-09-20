public class MonthTrafficNode {
    public ContractTimeNode[] contractTimeNodes;
    private int[] space;
    private int[] num;

    public MonthTrafficNode(int[] s,int[] n) {
        this.space=s;
        this.num=n;
        this.contractTimeNodes = new ContractTimeNode[this.num[3]];
        for (int i = 0; i < this.num[3]; i++) {
            this.contractTimeNodes[i] = new ContractTimeNode(s,n);
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i < this.num[3]; i++) {
                this.contractTimeNodes[i].select(ref,true);
            }
            return;
        }
        try {
            this.contractTimeNodes[(int) (Double.valueOf(ref[10])/this.space[3])].select(ref, false);
        } catch (Exception e) {
            this.contractTimeNodes[this.num[3]-1].select(ref, false);
        }
    }
}
