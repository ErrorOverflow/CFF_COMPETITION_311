public class Service2CallerNode {
    public PayNumNode[] payNumNode;
    private int[] space;
    private int[] num;

    public Service2CallerNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.payNumNode = new PayNumNode[this.num[9]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[9]; i++) {
                try {
                    this.payNumNode[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }

        try {
            this.payNumNode[(int) ((Double.valueOf(ref[15])) / this.space[9])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.payNumNode[this.num[9] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.payNumNode[this.num[9] - 1] = new PayNumNode();
                this.payNumNode[this.num[9] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.payNumNode[(int) ((Double.valueOf(ref[15])) / this.space[9])] = new PayNumNode();
            this.payNumNode[(int) ((Double.valueOf(ref[15])) / this.space[9])].select(ref, false);
        }
    }

    public PayNumNode find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0 || target + i >= this.num[9]) {
                if (i <= 0) {
                    i--;
                }
                i *= -1;
                continue;
            }
            if (this.payNumNode[target + i] != null) {
                return this.payNumNode[target + i];
            }
            if (i <= 0) {
                i--;
            }
            i *= -1;
        }
    }
}
