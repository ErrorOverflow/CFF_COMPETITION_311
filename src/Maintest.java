import java.io.*;

public class Maintest {
    public static void main(String[] args) throws IOException {
        /*TypeTag[] typeTags = new TypeTag[15];
        typeTags[0] = new TypeTag(89016252);
        typeTags[1] = new TypeTag(89016253);
        typeTags[2] = new TypeTag(89016259);
        typeTags[3] = new TypeTag(89950166);
        typeTags[4] = new TypeTag(89950167);
        typeTags[5] = new TypeTag(89950168);
        typeTags[6] = new TypeTag(90063345);
        typeTags[7] = new TypeTag(90109916);
        typeTags[8] = new TypeTag(90155946);
        typeTags[9] = new TypeTag(99104722);
        typeTags[10] = new TypeTag(99999825);
        typeTags[11] = new TypeTag(99999826);
        typeTags[12] = new TypeTag(99999827);
        typeTags[13] = new TypeTag(99999828);
        typeTags[14] = new TypeTag(99999830);


        Calculator calculator = new Calculator(typeTags);
        UserInfo[] userInfo = new UserInfo[100000];
        */
        FileReader file = new FileReader("C:\\Users\\Buaa-Aladdin\\Documents\\train.csv");
        BufferedReader bufferedReader = new BufferedReader(file);
        String line;
        String[] ref;
        LocalCallerTimeNode[] localCallerTimeNode =new LocalCallerTimeNode[50];
        for(int i=0;i<50;i++){
            localCallerTimeNode[i] = new LocalCallerTimeNode(10*i,10*(i+1));
        }
        int i = 0;
        while ((line = bufferedReader.readLine()) != null && i++ < 99999) {
            ref=line.split(",");
            localCallerTimeNode[(int)((Double.valueOf(ref[17]))/10)].select(ref,false);
            //userInfo[i] = new UserInfo(line, calculator);
        }
        //for (int j = 0; j < 15; j++) {
        //    System.out.println(typeTags[j].getTag() + " " + typeTags[j].getLocal_caller_time());
        //}
        //new Output(userInfo);
    }
}

class Output {
    public Output(UserInfo[] userInfos) {
        try{
            FileReader fileReader = new FileReader("C:\\Users\\Buaa-Aladdin\\Downloads\\test.csv");
            FileWriter fileWriter = new FileWriter("C:\\result.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readline;
            bufferedWriter.write("user_id,predict\n");
            readline = bufferedReader.readLine();
            while ((readline = bufferedReader.readLine()) != null) {
                String[] s = readline.split(",");
                bufferedWriter.write(s[25]);
                bufferedWriter.write(",");
                if (Float.valueOf(s[7]) == 0) {
                    bufferedWriter.write("99104722");
                } else if (Float.valueOf(s[7]) <= 200) {
                    if (Float.valueOf(s[17]) < 42.5 && Integer.valueOf(s[11])!=0) {
                        bufferedWriter.write("90063345");
                    } else {
                        bufferedWriter.write("90155946");
                    }
                } else if (Float.valueOf(s[7]) <= 700) {
                    bufferedWriter.write("89016252");
                } else if (Float.valueOf(s[7]) <= 1400) {
                    if (Float.valueOf(s[17]) > 50) {
                        bufferedWriter.write("99999830");
                    } else {
                        bufferedWriter.write("89950168");//53
                    }
                } else if (Float.valueOf(s[7]) <= 2400) {
                    if (Float.valueOf(s[17]) > 120) {
                        bufferedWriter.write("99999828");
                    } else if (Float.valueOf(s[17]) > 75) {
                        bufferedWriter.write("89950167");
                    } else if (Float.valueOf(s[17]) > 57) {
                        bufferedWriter.write("89950166");
                    } else {
                        bufferedWriter.write("89016259");
                    }
                }else if(Float.valueOf(s[7]) <= 2900){
                    bufferedWriter.write("99999827");
                }else {
                    if (Float.valueOf(s[17]) <70 || Float.valueOf(s[14])<160) {
                        bufferedWriter.write("90109916");
                    } else if (Float.valueOf(s[17]) <170|| Integer.valueOf(s[9])>=6) {
                        bufferedWriter.write("99999826");
                    }
                    else {
                        bufferedWriter.write("99999825");
                    }
                }
                bufferedWriter.write("\n");
                bufferedWriter.flush();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
