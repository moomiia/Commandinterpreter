import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class Commandinterpreter2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String s =reader.readLine();
        if (s.contains("hello")){
            int u=s.length();

            char [] array=new char[u-5];
            s.getChars(5,u,array,0);
            System.out.print("Hello");

            System.out.print(array);
            }
            }

        }





