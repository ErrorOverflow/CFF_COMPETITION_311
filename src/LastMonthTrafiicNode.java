/**
 * @author wmlbuaa
 * @date 2018-09-21 14:26
 */
public class LastMonthTrafiicNode {
    public gender[] genders;
    private int[] space;
    private int[] num;

    public LastMonthTrafiicNode(int[] s, int[] n) {
        this.space = s;
        this.num = n;
        this.genders = new gender[this.num[7]];
    }

    public void select(String[] ref, boolean isFinal) {
        if (isFinal) {
            for (int i = 0; i < this.num[7]; i++) {
                try {
                    this.genders[i].select(ref, true);
                } catch (NullPointerException e) {
                }
            }
            return;
        }

        try {
            this.genders[(int) ((Double.valueOf(ref[18])) / this.space[7])].select(ref, false);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                this.genders[this.num[7] - 1].select(ref, false);
            } catch (NullPointerException x) {
                this.genders[this.num[7] - 1] = new gender(space, num);
                this.genders[this.num[7] - 1].select(ref, false);
            }
        } catch (NullPointerException e) {
            this.genders[(int) ((Double.valueOf(ref[18])) / this.space[7])] = new gender(space, num);
            this.genders[(int) ((Double.valueOf(ref[18])) / this.space[7])].select(ref, false);
        }
    }

    public gender find(int target) {
        int i = 0;
        while (true) {
            if (target + i < 0) {
                if (i <= 0) {
                    i--;
                }
                i *= -1;
                continue;
            }
            if (this.genders[target + i] != null) {
                return this.genders[target + i];
            }
            if (i <= 0) {
                i--;
            }
            i *= -1;
        }
    }
}
