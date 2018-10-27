import java.io.*;
import java.util.Random;
import java.util.Vector;
import java.math.*;

public class Calculator {
    private Vector<Integer> current_type = new Vector<>(100);

    private TypeTag type_89016252;
    private TypeTag type_89016253;
    private TypeTag type_89016259;
    private TypeTag type_89950166;
    private TypeTag type_89950167;
    private TypeTag type_89950168;
    private TypeTag type_90063345;
    private TypeTag type_90109916;
    private TypeTag type_90155946;
    private TypeTag type_99104722;
    private TypeTag type_99999825;
    private TypeTag type_99999826;
    private TypeTag type_99999827;
    private TypeTag type_99999828;
    private TypeTag type_99999830;

    public static void main(String[] args) throws IOException {
        /*FileReader fileReader = new FileReader("C:\\Users\\Buaa-Aladdin\\Downloads\\train_2_mix.csv");
        int[][] k = new int[20][2];
        int flag = 0;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String getLine = bufferedReader.readLine();
        while ((getLine = bufferedReader.readLine()) != null) {
            String[] s = getLine.split(",");
            int i = 0;
            for (; i < flag; i++) {
                if (Integer.valueOf(s[25]) == k[i][0]) {
                    k[i][1]++;
                    break;
                }
            }
            if (i == flag) {
                k[flag][0] = Integer.valueOf(s[25]);
                flag++;
            }
        }
        for(int j=0;j<flag;j++){
            System.out.println(k[j][0]+" "+k[j][1]);
        }*/
        /*FileReader fileReader = new FileReader("C:\\Users\\Buaa-Aladdin\\Downloads\\train_2_dup_del.csv");
        FileWriter fileWriter = new FileWriter("C:\\Users\\Buaa-Aladdin\\Downloads\\train_2_mix.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String getLine = bufferedReader.readLine();
        bufferedWriter.write(getLine);
        bufferedWriter.write("\n");
        while ((getLine = bufferedReader.readLine()) != null) {
            boolean isFormat=true;
            String[] s = getLine.split(",");
            for (int i = 0; i < s.length; i++) {
                if(s[i].equals("\\N")){
                    System.out.println(getLine);
                    isFormat=false;
                    break;
                }
            }
            if (!isFormat){
                continue;
            }
            if (Double.valueOf(s[3]) % 1 != 0 && (Double.valueOf(s[14]) % 1.0 + Double.valueOf(s[3])) % 1.0 == 0) {
                s[3] = String.valueOf(Double.valueOf(s[14]) % 1.0 + Double.valueOf(s[3]));
                s[14] = String.valueOf(Double.valueOf(s[14]) - (Double.valueOf(s[14]) % 1));
                //System.out.println(getLine + " " + s[3] + " " + s[14]);
            }
            for (int i = 0; i < s.length; i++) {
                bufferedWriter.write(s[i]);
                bufferedWriter.write(",");
            }
            bufferedWriter.write("\n");
            bufferedWriter.flush();
        }
        */
     /* FileReader fileReader = new FileReader("C:\\Users\\Buaa-Aladdin\\Downloads\\republish_test.csv");
        FileWriter fileWriter = new FileWriter("C:\\Users\\Buaa-Aladdin\\Downloads\\test_pre.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String getLine = bufferedReader.readLine();
        String[] set = getLine.split(",");
        for (int i = 0; i <= set.length + 1; i++) {
            if (i == set.length - 1) {
                bufferedWriter.write("fee,");
            } else if (i == set.length) {
                bufferedWriter.write("call,");
            } else if (i == set.length + 1) {
                bufferedWriter.write(set[i - 2]);
            } else {
                bufferedWriter.write(set[i]);
                bufferedWriter.write(",");
            }
        }
        bufferedWriter.write("\n");
        int line = 0;
        while ((getLine = bufferedReader.readLine()) != null) {
            String[] s = getLine.split(",");
            String writeLine = "";
            boolean isFormat = true;
            for (int i = 0; i < s.length; i++) {
                if (s[i].equals("\\N")) {
                    s[i] = "0";
                }
            }
            for (int i = 0; i <= s.length + 1; i++) {
                if (i == s.length - 1) {
                    double ave = 0;
                    double fee = 0;
                    try {
                        ave = ((Double.valueOf(s[3]) + Double.valueOf(s[4]) + Double.valueOf(s[5]) + Double.valueOf(s[6])) / 4);
                        if (ave != 0)
                            fee = (Math.pow(((Double.valueOf(s[3]) - ave)), 2) +
                                    Math.pow(((Double.valueOf(s[4]) - ave)), 2) +
                                    Math.pow(((Double.valueOf(s[5]) - ave)), 2) +
                                    Math.pow(((Double.valueOf(s[6]) - ave)), 2)) / ave;
                        BigDecimal b = new BigDecimal(fee);
                        fee = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        writeLine += String.valueOf(fee);
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(fee);
                    }
                    try {
                        writeLine += Double.valueOf(s[i]);
                    } catch (NumberFormatException e) {
                        System.out.println(line);
                        isFormat = false;
                    }
                } else if (i == s.length) {
                    double ave = 0;
                    double fee = 0;
                    try {
                        ave = ((Double.valueOf(s[18]) + Double.valueOf(s[19])) / 4);
                        if (ave != 0)
                            fee = (Math.pow(((Double.valueOf(s[18]) - ave)), 2) +
                                    Math.pow(((Double.valueOf(s[19]) - ave)), 2)) / ave;
                        BigDecimal b = new BigDecimal(fee);
                        fee = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        writeLine += String.valueOf(fee);
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println(fee);
                    }
                    try {
                        writeLine += Double.valueOf(s[i]);
                    } catch (NumberFormatException e) {
                        System.out.println(line);
                        isFormat = false;
                    }
                } else if (i < s.length - 1) {
                    writeLine += s[i];
                } else if (i == s.length + 1) {
                    writeLine += s[i - 2];
                }
                if (i != s.length + 1) {
                    writeLine += ",";
                } else {
                    writeLine += "\n";
                }
                line++;
            }
            if (isFormat)
                bufferedWriter.write(writeLine);
        }
        bufferedWriter.flush();
        */
    }

    private Calculator(TypeTag[] mid) {
        this.type_89016252 = mid[0];
        this.type_89016253 = mid[1];
        this.type_89016259 = mid[2];
        this.type_89950166 = mid[3];
        this.type_89950167 = mid[4];
        this.type_89950168 = mid[5];
        this.type_90063345 = mid[6];
        this.type_90109916 = mid[7];
        this.type_90155946 = mid[8];
        this.type_99104722 = mid[9];
        this.type_99999825 = mid[10];
        this.type_99999826 = mid[11];
        this.type_99999827 = mid[12];
        this.type_99999828 = mid[13];
        this.type_99999830 = mid[14];
    }

    private void addCureentType(int i) {
        if (this.current_type.contains(new Integer(i))) {
            return;
        }
        this.current_type.add(new Integer(i));
    }

    public void addGenda(int type, float n) {
        switch (type) {
            case 89016252: {
                this.type_89016252.add(n);
                break;
            }
            case 89016253: {
                this.type_89016253.add(n);
                break;
            }
            case 89016259: {
                this.type_89016259.add(n);
                break;
            }
            case 89950166: {
                this.type_89950166.add(n);
                break;
            }
            case 89950167: {
                this.type_89950167.add(n);
                break;
            }
            case 89950168: {
                this.type_89950168.add(n);
                break;
            }
            case 90063345: {
                this.type_90063345.add(n);
                break;
            }
            case 90109916: {
                this.type_90109916.add(n);
                break;
            }
            case 90155946: {
                this.type_90155946.add(n);
                break;
            }
            case 99104722: {
                this.type_99104722.add(n);
                break;
            }
            case 99999825: {
                this.type_99999825.add(n);
                break;
            }
            case 99999826: {
                this.type_99999826.add(n);
                break;
            }
            case 99999827: {
                this.type_99999827.add(n);
                break;
            }
            case 99999828: {
                this.type_99999828.add(n);
                break;
            }
            case 99999830: {
                this.type_99999830.add(n);
                break;
            }
        }
    }
}
