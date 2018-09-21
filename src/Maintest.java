import java.io.*;

public class Maintest {
    public static final int[] SPLIT_SPACE = {20, 10, 100, 1, 1, 1, 50};
    public static final int[] SPLIT_NUM = {80, 1000, 1000, 40, 5, 5, 1000};
    public static final String readPath = "C:\\Users\\WML\\Downloads\\train.csv";
    public static final String testPath = "C:\\Users\\WML\\Downloads\\train.csv";
    public static final String writePath = "C:\\result.csv";
    public static final int[] TRAIN_FIELD = {0, 500000};
    public static final int[] TEST_FIELD = {500001, 620000};

    public static void main(String[] args) throws IOException {
        int[] type = new int[15];
        type[0] = 89016252;
        type[1] = 89016253;
        type[2] = 89016259;
        type[3] = 89950166;
        type[4] = 89950167;
        type[5] = 89950168;
        type[6] = 90063345;
        type[7] = 90109916;
        type[8] = 90155946;
        type[9] = 99104722;
        type[10] = 99999825;
        type[11] = 99999826;
        type[12] = 99999827;
        type[13] = 99999828;
        type[14] = 99999830;

        FileReader file = new FileReader(readPath);
        BufferedReader bufferedReader = new BufferedReader(file);
        String line = bufferedReader.readLine();
        String[] ref;
        start zero = new start(SPLIT_SPACE, SPLIT_NUM);
        int train_flag = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (train_flag >= TRAIN_FIELD[0] && train_flag <= TRAIN_FIELD[1]) {
                ref = line.split(",");
                zero.select(ref, false);
            }
            train_flag++;
        }
        zero.select(null, true);

        try {
            int illegal = 0;
            int right = 0;
            int wrong = 0;
            FileReader fileReader = new FileReader(testPath);
            FileWriter fileWriter = new FileWriter(writePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedReader = new BufferedReader(fileReader);
            String readline;
            bufferedWriter.write("user_id,predict\n");
            readline = bufferedReader.readLine();
            int test_flag = 0;
            while ((readline = bufferedReader.readLine()) != null) {
                if (test_flag < TEST_FIELD[0] || test_flag > TEST_FIELD[1]) {
                    test_flag++;
                    continue;
                }
                String[] s = readline.split(",");
                bufferedWriter.write(s[25]);
                bufferedWriter.write(",");
                try {
                    int[] flag = new int[26];
                    flag[0] = (int) (Double.valueOf(s[17]) / SPLIT_SPACE[0]);
                    if (flag[0] >= SPLIT_NUM[0]) flag[0] = SPLIT_NUM[0] - 1;

                    flag[1] = (int) (Double.valueOf(s[2]) / SPLIT_SPACE[1]);
                    if (flag[1] >= SPLIT_NUM[1]) flag[1] = SPLIT_NUM[1] - 1;

                    flag[2] = (int) (Double.valueOf(s[7]) / SPLIT_SPACE[2]);
                    if (flag[2] >= SPLIT_NUM[2]) flag[2] = SPLIT_NUM[2] - 1;

                    flag[3] = (int) (Double.valueOf(s[10]) / SPLIT_SPACE[3]);
                    if (flag[3] >= SPLIT_NUM[3]) flag[3] = SPLIT_NUM[3] - 1;
                    else if (flag[3] < 0) flag[3] = 0;

                    flag[4] = (int) (Double.valueOf(s[0]) / SPLIT_SPACE[4]);
                    if (flag[4] >= SPLIT_NUM[4]) flag[4] = SPLIT_NUM[4] - 1;

                    flag[5] = (int) (Double.valueOf(s[12]) / SPLIT_SPACE[5]);
                    if (flag[5] >= SPLIT_NUM[5]) flag[5] = SPLIT_NUM[5] - 1;

                    flag[6] = (int) (Double.valueOf(s[14]) / SPLIT_SPACE[6]);
                    if (flag[6] >= SPLIT_NUM[6]) flag[6] = SPLIT_NUM[6] - 1;

                    String mid = String.valueOf(type[zero.find(flag[0]).find(flag[1]).find(flag[2]).find(flag[3]).
                            find(flag[4]).find(flag[5]).find(flag[6]).first]);
                    bufferedWriter.write(mid);
                    if (mid.equals(s[25])) {
                        right++;
                    } else {
                        wrong++;
                    }
                } catch (Exception e) {
                    bufferedWriter.write("89016252");
                    illegal++;
                }
                bufferedWriter.write("\n");
                bufferedWriter.flush();
                test_flag++;
            }

            System.out.println(illegal);
            System.out.println(right);
            System.out.println(wrong);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}