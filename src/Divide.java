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
                    0, 50, 110, 160, 270
            };
    public static final int[] DIVIDE_NODE7 = {};
    public static final int[] DIVIDE_NODE8 =
            {
                    0, 35, 100, 190, 300
            };
    public static final int[] DIVIDE_NODE9 =
            {
                    0, 1, 3, 6, 9, 12
            };
    public static final int[] DIVIDE_NODE10 =
            {
                    0, 1, 390, 401, 490,
                    501, 780, 800,
                    805, 1020, 1025, 1500, 1750, 2048,
                    2049, 3072, 3073, 3900, 4100,
                    5500
            };
    /*
                    0, 1, 244, 244, 244, 244, 366, 427, 488, 549,
                    610, 671, 732, 793, 854, 915, 976, 1037, 1098, 1159,
                    1220, 1281, 1342, 1403, 1464, 1525, 1586, 1647, 1708, 1769,
                    1830, 1891, 1952, 2013, 2074, 2135, 2196, 2257, 2318, 2379,
                    2440, 2501, 2562, 2623, 2684, 2745, 2806, 2867, 2928, 3100,
                    3100, 3100, 3300, 3300, 3300, 4000, 4000, 4000, 4000, 4000
     */

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
