public class MonthTrafficNode {
    private ContractTimeNode[] contractTimeNodes;
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
            this.contractTimeNodes[Divide.divide(Double.valueOf(ref[10]),Divide.DIVIDE_NODE3)].select(ref, false);
        } catch (NullPointerException e) {
            this.contractTimeNodes[Divide.divide(Double.valueOf(ref[10]),Divide.DIVIDE_NODE3)] = new ContractTimeNode(this.space, this.num);
            this.contractTimeNodes[Divide.divide(Double.valueOf(ref[10]),Divide.DIVIDE_NODE3)].select(ref,false);
        }
    }

    public ContractTimeNode find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0  || target + i >= this.num[3]) {
                if(i<=0){
                    i--;
                }
                i*=-1;
                continue;
            }
            if (this.contractTimeNodes[target + i] != null) {
                return this.contractTimeNodes[target + i];
            }
            if(i<=0){
                i--;
            }
            i*=-1;
        }
    }

}
