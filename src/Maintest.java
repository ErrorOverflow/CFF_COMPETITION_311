import java.io.*;

public class Maintest {
    public static void main(String[] args) throws IOException {
        TypeTag[] typeTags = new TypeTag[15];
        Calculator calculator = new Calculator(typeTags);
        UserInfo[] userInfo = new UserInfo[100000];

        FileReader file = new FileReader("C:\\Users\\Buaa-Aladdin\\Documents\\train.csv");
        BufferedReader bufferedReader = new BufferedReader(file);
        String line;
        int i = 0;
        while ((line = bufferedReader.readLine()) != null && i++ < 99999) {
            userInfo[i] = new UserInfo(line, calculator);
        }
        for (int j = 0; j < calculator.current_type.size(); j++) {
            System.out.println(calculator.current_type.get(j));
        }
        //new Output(userInfo);
    }
}

class Output {
    public Output(UserInfo[] userInfos) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\result.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(",");
    }
}
