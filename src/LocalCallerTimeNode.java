public class LocalCallerTimeNode {
    public OnlineTimeNode[] onlineTimeNode;
    private int[] space;
    private int[] num;

    public LocalCallerTimeNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.onlineTimeNode = new OnlineTimeNode[this.num[1]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[1]; i++) {
                try {
                    this.onlineTimeNode[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }
        try {
            this.onlineTimeNode[(int) ((Double.valueOf(ref[2])) / this.space[1])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.onlineTimeNode[this.num[1] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.onlineTimeNode[this.num[1] - 1] = new OnlineTimeNode(space, num);
                this.onlineTimeNode[this.num[1] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.onlineTimeNode[(int) ((Double.valueOf(ref[2])) / this.space[1])] = new OnlineTimeNode(space, num);
            this.onlineTimeNode[(int) ((Double.valueOf(ref[2])) / this.space[1])].select(ref, false);
        }
    }

    public OnlineTimeNode find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0) {
                if(i<=0){
                    i--;
                }
                i*=-1;
                continue;
            }
            if (this.onlineTimeNode[target + i] != null) {
                return this.onlineTimeNode[target + i];
            }
            if(i<=0){
                i--;
            }
            i*=-1;
        }
    }
}
