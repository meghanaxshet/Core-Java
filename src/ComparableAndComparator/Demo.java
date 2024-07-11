package ComparableAndComparator;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();{
         list.add(new Laptop("dell",65000));
         list.add(new Laptop("lenovo",45000));
         list.add(new Laptop("hp", 35000));

           Comparator<Laptop> comparator = new Comparator<>() {
               @Override
               public int compare(Laptop o1, Laptop o2) {
                   if (o1.getPrice() > o2.getPrice() ){
                       return 1;
                   }
                   else {
                       return -1;
                   }
               }
           };
          Collections.sort(list,comparator);

              System.out.println(list);

        }
    }
}
