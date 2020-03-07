package epam.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write A");
        try {
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Write B");
            int b = Integer.parseInt(reader.readLine());
            System.out.println("Write C");
            int c = Integer.parseInt(reader.readLine());
            double z = ((a - 3) * b / 2) + c;
            System.out.println("Answer: "+z);
        }catch (NumberFormatException e){
            System.out.println("Write the number!");
        }

    }
}
