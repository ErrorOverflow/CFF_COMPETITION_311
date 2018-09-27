abstract class Divide {
    public static final int[] DIVIDE_NODE0 = {};
    public static final int[] DIVIDE_NODE1 =
            {
                    0, 32, 64, 96, 128,
                    160, 192, 228, 260, 292
            };
    public static final int[] DIVIDE_NODE2 =
            {
                    0, 445, 1000, 2000
            };
    public static final int[] DIVIDE_NODE3 =
            {
                    0, 12, 24, 36
            };
    public static final int[] DIVIDE_NODE4 = {};
    public static final int[] DIVIDE_NODE5 =
            {
                    0, 42, 82, 180, 290
            };
    public static final int[] DIVIDE_NODE6 =
            {
                    0, 51, 102, 153
            };
    public static final int[] DIVIDE_NODE7 = {};
    public static final int[] DIVIDE_NODE8 =
            {
                    0, 51, 102, 153, 204,
                    255, 306, 357, 408, 459,
                    510
            };
    public static final int[] DIVIDE_NODE9 =
            {
                    0, 1, 3, 6, 9, 12
            };
    public static final int[] DIVIDE_NODE10 =
            {

            };

    public static int divide(double ref, int[] divide_node) {
        int[] d = divide_node;
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
