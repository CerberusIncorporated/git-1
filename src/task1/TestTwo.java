package task1;


import java.util.ArrayList;
//замена символов
//р - удаляет, если в слове есть л - удваивает слово, если есть р и л - ничего не делате.
public class TestTwo {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> res = new ArrayList<>();
        for (String s : strings)
        {
            if(s.contains("р") && s.contains("л")){
                res.add(s);
            } else if(s.contains("р")){
                //NOP
            } else if(s.contains("л")){
                res.add(s);
                res.add(s);
            } else {
                res.add(s);
            }
        }
        return res;
    }

}