package headfirst.designpatterns.templatemethod.abstractlist;

import java.util.List;

public class StringTestDrive {
    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(ducks);
        List<String> ducksSubList = ducksList.subList(2, 3);
        for (String s : ducksSubList) {
            System.out.println(s);
        }
    }
}
