package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Цель: чётные и нечётные числа заполнить в разные ArrayList

public class TestOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0; i<5;i++){

            int x = Integer.parseInt(reader.readLine());
            if(x % 2 == 0){
                even.add(x);
            }
            else{
                odd.add(x);
            }
        }
        System.out.print("Odd: ");
        for(Integer s:odd){
            System.out.print(s+" ");
        }
        System.out.println(" ");
        System.out.print("Even: ");
        for(Integer s:even){
            System.out.print(s + " ");
        }

    }

}
