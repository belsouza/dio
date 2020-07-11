package Hasher;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TestMain {

    public static void main(String[] args)
    {
        Maper n = new Maper();
        Map a = n.getChampions();
        a.put("Australia", 0);
        System.out.println(a);
        System.out.println(a.get("Alemanha"));
        System.out.println(a.containsKey("Belgica"));

       //  for (  Map.Entry<String, Integer> entry : a.entrySet() ) {  } - Nao funciona

        a.forEach((key, value) -> {
            System.out.println( key + "-->" + value );
        });

        TreeMap b = n.getNewchampions();
        System.out.println(b);
        System.out.println(b.firstEntry());
        System.out.println(b.firstKey());
        System.out.println(b.lastEntry());
        System.out.println(b.lowerEntry("Alemanha")); //null

        System.out.println(b.lastKey());
        System.out.println("-------------------------------------");
        System.out.println(b);
        System.out.println(b.pollFirstEntry());
        System.out.println(b);
        System.out.println(b.pollLastEntry());
        System.out.println(b);
        System.out.println("-------------------------------------");

        //System.out.println(b.lowerKey(5));
        b.put("Belgica", 0);
        System.out.println(b.ceilingEntry("Argentina")); //Mostra o primeiro sem alterar
        System.out.println(b.tailMap( "Belgica")); //Mostra a cauda sem o head - nao altera

        System.out.println("**************************************");
        System.out.println(b);
        System.out.println(b.subMap("Brasil", "Inglaterra"));
        System.out.println(b);
        System.out.println("**************************************");
        System.out.println(b.keySet());

        System.out.println(b.descendingKeySet());
        System.out.println(b.putIfAbsent("Brasil", 0));

        Iterator<String> iterator = b.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + "---->" + b.get(key));
        }



    }
}
