import java.io.*;

public class Maintest {
    public static final int SPLIT_SPACE = 20;
    public static final int SPLIT_NUM = 15;

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
        //
        //
        //
        FileReader file = new FileReader("C:\\Users\\Buaa-Aladdin\\Documents\\train.csv");
        BufferedReader bufferedReader = new BufferedReader(file);
        String line;
        String[] ref;
        LocalCallerTimeNode[] localCallerTimeNode = new LocalCallerTimeNode[SPLIT_NUM];
        for (int i = 0; i < SPLIT_NUM; i++) {
            localCallerTimeNode[i] = new LocalCallerTimeNode();
        }
        int i = 0;
        while ((line = bufferedReader.readLine()) != null && i++ < 99999) {
            ref = line.split(",");
            try {
                localCallerTimeNode[(int) ((Double.valueOf(ref[17])) / SPLIT_SPACE)].select(ref, false);
            } catch (Exception e) {
                localCallerTimeNode[SPLIT_NUM - 1].select(ref, false);
            }
            //userInfo[i] = new UserInfo(line, calculator);
        }
        for (int j = 0; j < SPLIT_NUM; j++) {
            localCallerTimeNode[j].select(null, true);
        }
        //
        //
        //

        try {
            int illegal = 0;
            int right = 0;
            int wrong = 0;
            FileReader fileReader = new FileReader("C:\\Users\\Buaa-Aladdin\\Downloads\\train.csv");
            FileWriter fileWriter = new FileWriter("C:\\result.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedReader = new BufferedReader(fileReader);
            String readline;
            bufferedWriter.write("user_id,predict\n");
            readline = bufferedReader.readLine();
            while ((readline = bufferedReader.readLine()) != null) {
                String[] s = readline.split(",");
                bufferedWriter.write(s[25]);
                bufferedWriter.write(",");
                try {
                    int[] flag = new int[26];
                    flag[0] = (int) (Double.valueOf(s[17]) / SPLIT_SPACE);
                    if (flag[0] >= SPLIT_NUM) flag[0] = SPLIT_NUM - 1;
                    flag[1] = (int) (Double.valueOf(s[2]) / 10);
                    if (flag[1] >= 15) flag[1] = 14;
                    flag[2] = (int) (Double.valueOf(s[7]) / 200);
                    if (flag[2] >= 30) flag[2] = 29;
                    flag[3] = (int) (Double.valueOf(s[10]) / 12);
                    if (flag[3] >= 4) flag[3] = 3;
                    flag[4] = (int) (Double.valueOf(s[16]) / 500);
                    if (flag[4] >= 20) flag[4] = 19;
                    flag[5] = (int) (Double.valueOf(s[14]) / 30);
                    if (flag[5] >= 30) flag[4] = 29;
                    String mid = String.valueOf(type[
                            localCallerTimeNode[flag[0]].onlineTimeNode[
                                    flag[1]].monthTrafficNodes[
                                    flag[2]].contractTimeNodes[
                                    flag[3]].localTrafficMonthNodes[
                                    flag[4]].payNumNode[
                                    flag[5]].first]);
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
            }
            System.out.println(illegal);
            System.out.println(right);
            System.out.println(wrong);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}