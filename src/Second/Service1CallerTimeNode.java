public class Service1CallerTimeNode {
    public Service2CallerTimeNode[] service2CallerTimeNodes;
    private int[] space;
    private int[] num;

    public Service1CallerTimeNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.service2CallerTimeNodes = new Service2CallerTimeNode[this.num[7]];
        for (int i = 0; i < this.num[7]; i++) {
            this.service2CallerTimeNodes[i] = new Service2CallerTimeNode(s,n);
        }
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[7]; i++) {
                this.service2CallerTimeNodes[i].select(ref, true);
            }
            return;
        }
        try {
            this.service2CallerTimeNodes[(int) ((Double.valueOf(ref[19])) / this.space[7])].select(ref, false);
        } catch (Exception e) {
            this.service2CallerTimeNodes[this.num[7] - 1].select(ref, false);
        }
    }
}
