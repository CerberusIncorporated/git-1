package epam.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
try {
    System.out.println("Write A");
    int a = Integer.parseInt(reader.readLine());
    System.out.println("Write B");
    int b = Integer.parseInt((reader.readLine()));
    System.out.println("Write C");
    int c = Integer.parseInt((reader.readLine()));
    double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    System.out.println(z);
}catch (NumberFormatException e){
    System.out.println("Error! Write the number!");
}
    }
}
