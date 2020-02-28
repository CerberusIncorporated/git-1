package task1;

import java.util.HashSet;
import java.util.Set;

//Цель: создать HashSet, заполнить его, вывести на экран

public class SetPlants {
    public static void main(String[] args) {

        //создание HashSet

        Set<String> strings = new HashSet<>();

        //заполнение

        strings.add("арбуз");
        strings.add("банан");
        strings.add("вишня");
        strings.add("груша");
        strings.add("дыня");
        strings.add("ежевика");
        strings.add("женьшень");
        strings.add("земляника");
        strings.add("ирис");
        strings.add("картофель");

        //вывод на экран

        for(String rezult:strings){
            System.out.println(rezult);
        }
    }
}
