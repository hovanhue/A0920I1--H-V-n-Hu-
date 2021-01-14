package Ls9_Collection_Framework.thuchanh;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students t1, Students t2) {
       if(t1.getAge() > t2.getAge()) {
           return 1;
       }
       else if(t1.getAge() < t2.getAge()) {
           return -1;
       }
        else {
            return 0;
       }

    }
}
