package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class MeQueue {

    private Queue<String> me;
    private Queue<String> richards;

    public MeQueue(){

        this.me = populateme();
        this.richards = this.populaterichards();

    }
    private Queue<String> populateme() {
        Queue<String> temp  = new LinkedList<>();
        temp.add("Juliana");
        temp.add("Pedro");
        temp.add("Carlos");
        temp.add("Larissa");
        temp.add("Joao");
        return temp;
    }

    private Queue<String> populaterichards(){

        Queue<String> temp  = new LinkedList<>();
        temp.add("Matheus");
        temp.add("Raphael");
        temp.add("Lucas");
        temp.add("Juliana");
        return temp;
    }

    public Queue<String> getRichards(){
        return this.richards;
    }

    public Queue<String> getMe(){
        return this.me;
    }

    public void exercicios(){

        Queue<String>x = this.me;
        System.out.println(x);
        System.out.println(x.peek()); //retorna o head
        x.clear();
        System.out.println(x.element()); //o mesmo que peak, so que lanca uma excecao
        System.out.println(x.poll()); //remove o head
        System.out.println(x);

        x.add("Daniel");
        System.out.println(x);
        x.forEach(item->System.out.println(item));
        x.clear();
        if(x.isEmpty()) { System.out.println("A lista esta vazia"); }
        if(x.contains("Carlos")){  System.out.println("Carlos esta na lista!"); }
        System.out.println(x.remove("Pedro"));
    }


}
