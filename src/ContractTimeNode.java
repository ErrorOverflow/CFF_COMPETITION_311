public class ContractTimeNode {
    public LocalTrafficMonthNode[] localTrafficMonthNodes;
    private int[] space;
    private int[] num;

    public ContractTimeNode(int[] s,int[] n) {
        this.space=s;
        this.num=n;
        this.localTrafficMonthNodes = new LocalTrafficMonthNode[this.num[4]];
        for (int i = 0; i < this.num[4]; i++) {
            this.localTrafficMonthNodes[i] = new LocalTrafficMonthNode(s,n);
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i <this.num[4]; i++) {
                this.localTrafficMonthNodes[i].select(ref,true);
            }
            return;
        }
        try {
            this.localTrafficMonthNodes[(int) ((Double.valueOf(ref[0]))/this.space[4])-1].select(ref, false);
        } catch (Exception e) {
            this.localTrafficMonthNodes[this.num[4]-1].select(ref, false);
        }
    }
}
