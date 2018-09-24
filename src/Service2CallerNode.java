public class Service2CallerNode {
    public _1Node[] _1Nodes;
    private int[] space;
    private int[] num;

    public Service2CallerNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this._1Nodes = new _1Node[this.num[9]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[9]; i++) {
                try {
                    this._1Nodes[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }

        try {
            this._1Nodes[(int) ((Double.valueOf(ref[16])) / this.space[9])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this._1Nodes[this.num[9] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this._1Nodes[this.num[9] - 1] = new _1Node(space, num);
                this._1Nodes[this.num[9] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this._1Nodes[(int) ((Double.valueOf(ref[16])) / this.space[9])] = new _1Node(space, num);
            this._1Nodes[(int) ((Double.valueOf(ref[16])) / this.space[9])].select(ref, false);
        }
    }

    public _1Node find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0 || target + i >= this.num[9]) {
                if (i <= 0) {
                    i--;
                }
                i *= -1;
                continue;
            }
            if (this._1Nodes[target + i] != null) {
                return this._1Nodes[target + i];
            }
            if (i <= 0) {
                i--;
            }
            i *= -1;
        }
    }
}
