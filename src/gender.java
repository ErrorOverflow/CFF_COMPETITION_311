public class gender {
    public Service2CallerNode[] service2CallerNodes;
    private int[] space;
    private int[] num;

    public gender(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.service2CallerNodes = new Service2CallerNode[this.num[8]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[8]; i++) {
                try {
                    this.service2CallerNodes[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }

        try {
            this.service2CallerNodes[Divide.divide(Double.valueOf(ref[19]), Divide.DIVIDE_NODE8)].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.service2CallerNodes[this.num[8] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.service2CallerNodes[this.num[8] - 1] = new Service2CallerNode(space, num);
                this.service2CallerNodes[this.num[8] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.service2CallerNodes[Divide.divide(Double.valueOf(ref[19]), Divide.DIVIDE_NODE8)] = new Service2CallerNode(space, num);
            this.service2CallerNodes[Divide.divide(Double.valueOf(ref[19]), Divide.DIVIDE_NODE8)].select(ref, false);
        }
    }

    public Service2CallerNode find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0 || target + i >= this.num[8]) {
                if (i <= 0) {
                    i--;
                }
                i *= -1;
                continue;
            }
            if (this.service2CallerNodes[target + i] != null) {
                return this.service2CallerNodes[target + i];
            }
            if (i <= 0) {
                i--;
            }
            i *= -1;
        }
    }
}
