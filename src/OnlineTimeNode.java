public class OnlineTimeNode {
    public MonthTrafficNode[] monthTrafficNodes;
    private int[] space;
    private int[] num;

    public OnlineTimeNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.monthTrafficNodes = new MonthTrafficNode[this.num[2]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[2]; i++) {
                try {
                    this.monthTrafficNodes[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }

        try {
            this.monthTrafficNodes[(int) ((Double.valueOf(ref[7])) / this.space[2])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.monthTrafficNodes[this.num[2] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.monthTrafficNodes[this.num[2] - 1] = new MonthTrafficNode(this.space, this.num);
                this.monthTrafficNodes[this.num[2] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.monthTrafficNodes[(int) ((Double.valueOf(ref[7])) / this.space[2])] = new MonthTrafficNode(this.space, this.num);
            this.monthTrafficNodes[(int) ((Double.valueOf(ref[7])) / this.space[2])].select(ref,false);
        }
    }
}
