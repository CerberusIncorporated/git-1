package task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Цель: создание калькулятора

public class Calculator {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNum,secondNum;
        String operator;
//exception
        try {

        System.out.println("Введите первое число: ");
        firstNum = Integer.parseInt(reader.readLine());

        System.out.println("Введите второе число: ");
        secondNum = Integer.parseInt(reader.readLine());

        System.out.println("Введите оператор: ");
        System.out.println("+ - сложение\n- - вычитание\n* - умножение\n/ - деление");
        operator = reader.readLine();

            switch (operator) {
                case "+":
                    System.out.println(firstNum + secondNum);
                    break;
                case "-":
                    System.out.println(firstNum - secondNum);
                    break;
                case "*":
                    System.out.println(firstNum * secondNum);
                    break;
                case "/":
                    System.out.println(firstNum / secondNum);
                    break;
                default:
                    System.out.println("Неправильный оператор!");
            }
        }catch (NumberFormatException e){
            System.out.println("Ошибка! Неправильно введено число!");
        }
        catch (ArithmeticException e){
            System.out.println("Деление на 0 невозможно!");
        }

    }
}
