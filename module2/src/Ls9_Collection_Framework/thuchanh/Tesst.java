package Ls9_Collection_Framework.thuchanh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Tesst {
    public static void main(String[] args) {
        Students students1 = new Students("Kien", 30, "HT");
        Students students2 = new Students("Nam", 26, "HT");
        Students students3 = new Students("Tung", 35, "HT");

        List<Students> list = new ArrayList<Students>();
        list.add(students1);
        list.add(students2);
        list.add(students3);
        Collections.sort(list);
        for (Students st: list)
            System.out.println(st.toString());

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Students st : list){
            System.out.println(st.toString());
        }
    }
}
