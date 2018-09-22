/**
 * @author wmlbuaa
 * @date 2018-09-21 12:54
 */
public class start {
    private LocalCallerTimeNode[] localCallerTimeNodes;
    private int[] space;
    private int[] num;

    public start(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.localCallerTimeNodes = new LocalCallerTimeNode[this.num[0]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[0]; i++) {
                try {
                    this.localCallerTimeNodes[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }
        try {
            this.localCallerTimeNodes[(int) ((Double.valueOf(ref[8])) / this.space[0])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.localCallerTimeNodes[this.num[0] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.localCallerTimeNodes[this.num[0] - 1] = new LocalCallerTimeNode(space, num);
                this.localCallerTimeNodes[this.num[0] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.localCallerTimeNodes[(int) ((Double.valueOf(ref[8])) / this.space[0])] = new LocalCallerTimeNode(space, num);
            this.localCallerTimeNodes[(int) ((Double.valueOf(ref[8])) / this.space[0])].select(ref, false);
        }catch (NumberFormatException e){

        }
    }

    public LocalCallerTimeNode find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0) {
                if(i<=0){
                    i--;
                }
                i*=-1;
                continue;
            }
            if (this.localCallerTimeNodes[target + i] != null) {
                return this.localCallerTimeNodes[target + i];
            }
            if(i<=0){
                i--;
            }
            i*=-1;
        }
    }
}
