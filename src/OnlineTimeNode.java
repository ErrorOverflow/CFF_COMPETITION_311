public class OnlineTimeNode {
    public MonthTrafficNode[] monthTrafficNodes;
    private int[] space;
    private int[] num;

    public OnlineTimeNode(int[] s,int[] n) {
        this.space=s;
        this.num=n;
        this.monthTrafficNodes = new MonthTrafficNode[this.num[2]];
        for (int i = 0; i < this.num[2]; i++) {
            this.monthTrafficNodes[i] = new MonthTrafficNode(s,n);
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[2]; i++) {
                this.monthTrafficNodes[i].select(ref, true);
            }
            return;
        }
        try {
            this.monthTrafficNodes[(int) ((Double.valueOf(ref[7])) / this.space[2])].select(ref, false);
        } catch (Exception e) {
            this.monthTrafficNodes[this.num[2] - 1].select(ref, false);
        }
    }
}
