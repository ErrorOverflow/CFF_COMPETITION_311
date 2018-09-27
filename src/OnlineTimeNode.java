public class OnlineTimeNode {
    private MonthTrafficNode[] monthTrafficNodes;
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
            this.monthTrafficNodes[divide(Double.valueOf(ref[7]))].select(ref, false);
        } catch (NullPointerException e) {
            this.monthTrafficNodes[divide(Double.valueOf(ref[7]))] = new MonthTrafficNode(this.space, this.num);
            this.monthTrafficNodes[divide(Double.valueOf(ref[7]))].select(ref, false);
        }
    }

    public MonthTrafficNode find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0 || target + i >= this.num[2]) {
                if (i <= 0) {
                    i--;
                }
                i *= -1;
                continue;
            }
            if (this.monthTrafficNodes[target + i] != null) {
                return this.monthTrafficNodes[target + i];
            }
            if (i <= 0) {
                i--;
            }
            i *= -1;
        }
    }

    public static int divide(double ref) {
        int[] d = Divide.DIVIDE_NODE2;
        for (int i = 0; i < d.length; i++) {
            if (i == d.length - 1) {
                return i;
            } else {
                if (d[i] <= ref && ref < d[i + 1]) {
                    return i;
                }
            }
        }
        return 0;
    }
}
