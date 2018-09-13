import java.io.*;

public class Maintest {
    public static void main(String[] args) throws IOException {
        TypeTag[] typeTags = new TypeTag[15];
        typeTags[0]=new TypeTag(89016252);
        typeTags[1]=new TypeTag(89016253);
        typeTags[2]=new TypeTag(89016259);
        typeTags[3]=new TypeTag(89950166);
        typeTags[4]=new TypeTag(89950167);
        typeTags[5]=new TypeTag(89950168);
        typeTags[6]=new TypeTag(90063345);
        typeTags[7]=new TypeTag(90109916);
        typeTags[8]=new TypeTag(90155946);
        typeTags[9]=new TypeTag(99104722);
        typeTags[10]=new TypeTag(99999825);
        typeTags[11]=new TypeTag(99999826);
        typeTags[12]=new TypeTag(99999827);
        typeTags[13]=new TypeTag(99999828);
        typeTags[14]=new TypeTag(99999830);


        Calculator calculator = new Calculator(typeTags);
        UserInfo[] userInfo = new UserInfo[100000];

        FileReader file = new FileReader("C:\\Users\\Buaa-Aladdin\\Documents\\train.csv");
        BufferedReader bufferedReader = new BufferedReader(file);
        String line;
        int i = 0;
        while ((line = bufferedReader.readLine()) != null && i++ < 99999) {
            userInfo[i] = new UserInfo(line, calculator);
        }
        for(int j=0;j<15;j++){
            System.out.println(typeTags[j].getTag()+" "+typeTags[j].getGender()[0]+" "+typeTags[j].getGender()[1]);
        }
        //new Output(userInfo);
    }
}

class Output {
    public Output(UserInfo[] userInfos) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Buaa-Aladdin\\Downloads\\test.csv");
        FileWriter fileWriter = new FileWriter("C:\\result.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readline;
        bufferedWriter.write("user_id,predict\n");
        while((readline=bufferedReader.readLine())!=null){
            String[] s = readline.split(",");
            bufferedWriter.write(s[25]);
            bufferedWriter.write(",89016253");
            bufferedWriter.write("\n");
        }
    }

    public String predict(String[] s){
        return "89016253";
    }
}
