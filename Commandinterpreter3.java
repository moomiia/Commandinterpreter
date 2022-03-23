import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Commandinterpreter3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1= new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2= new BufferedReader(new InputStreamReader(System.in));
        String s =reader.readLine();
        if (s.contains("repeat")){
            System.out.println("введите количество повторений");
            String y= reader1.readLine();
            System.out.println("введите слово");
            String d = reader2.readLine();
            Integer i1=Integer.valueOf(y);
            for (int i=0; i<i1;  i ++){
                System.out.println(d);
            }

        }
    }

}
