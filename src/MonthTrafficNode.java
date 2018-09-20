public class MonthTrafficNode {
    public ContractTimeNode[] contractTimeNodes;
    private int[] space;
    private int[] num;

    public MonthTrafficNode(int[] s,int[] n) {
        this.space=s;
        this.num=n;
        this.contractTimeNodes = new ContractTimeNode[this.num[3]];
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i < this.num[3]; i++) {
                try{
                    this.contractTimeNodes[i].select(ref,true);
                }catch(NullPointerException e){}
            }
            return;
        }
        try {
            this.contractTimeNodes[(int) ((Double.valueOf(ref[10])) / this.space[3])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.contractTimeNodes[this.num[3] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.contractTimeNodes[this.num[3] - 1] = new ContractTimeNode(this.space, this.num);
                this.contractTimeNodes[this.num[3] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.contractTimeNodes[(int) ((Double.valueOf(ref[10])) / this.space[3])] = new ContractTimeNode(this.space, this.num);
            this.contractTimeNodes[(int) ((Double.valueOf(ref[10])) / this.space[3])].select(ref,false);
        }
    }
}
