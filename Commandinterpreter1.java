import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Commandinterpreter1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String s =reader.readLine();
        if (s.equals("hello")){
        System.out.println("Hello World!");
        }



    }
}
