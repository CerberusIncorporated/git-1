package epam.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestThree {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write x");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Write y");
        int y = Integer.parseInt(reader.readLine());
        double z = ((Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println("Answer: "+z);
    }
}
