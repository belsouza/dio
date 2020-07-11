package Collections;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){

        MeSet sets = new MeSet();

        //Sem ordem
        Set a = sets.getSetPool();
        System.out.println(a);
        a.add(null);
        System.out.println(a);

        //Linked - mantem ordem
        LinkedList b = sets.getSetMediumPool();
        System.out.println(b);

        //Tree - organizado e permite alteracao
        TreeSet c = sets.getSuperPool();
        System.out.println(c);
        System.out.println("First: " + c.first() + "\nHigher: " + c.higher("Florianópolis") + "\nLast: " + c.last() + "\nLower: " + c.lower("Florianópolis"));


        Set d = sets.getSetnum();
        System.out.println(d);
        d.add(null);
        System.out.println(d);








    }
}
