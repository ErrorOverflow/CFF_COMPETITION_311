public class LocalCallerTimeNode {
    public OnlineTimeNode[] onlineTimeNode;
    private int[] space;
    private int[] num;

    public LocalCallerTimeNode(int[] s,int[] n) {
        this.space=s;
        this.num=n;
        this.onlineTimeNode = new OnlineTimeNode[this.num[1]];
        for (int i = 0; i < this.num[1]; i++) {
            this.onlineTimeNode[i] = new OnlineTimeNode(s,n);
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if(isFinal){
            for (int i = 0; i < this.num[1]; i++) {
                this.onlineTimeNode[i].select(ref,true);
            }
            return;
        }
        try {
            this.onlineTimeNode[(int) ((Double.valueOf(ref[2])) / this.space[1])].select(ref, false);
        } catch (Exception e) {
            this.onlineTimeNode[this.num[1]-1].select(ref, false);
        }
    }
}
