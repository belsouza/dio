package Collections;

import java.util.*;

public class MeSet {

    private Set<String> setpool;
    private LinkedList<String> setmediumpool;
    private TreeSet<String> setsuperpool;
    private Set<Integer> setnum;

    public MeSet(){

        setPool();
        setSuperPool();
        setMediumPool();
        setNum();
    }

    private void setNum(){

        setnum = new HashSet<>();
        setnum.add(54);
        setnum.add(4);
        setnum.add(16);
        setnum.add(49);
    }

    private void setPool(){

        setpool = new HashSet<>();
        setpool.add("Rufus");
        setpool.add("Carolina");
        setpool.add("Ana");
        setpool.add("Julius");
    }

    private void setMediumPool(){

        setmediumpool = new LinkedList<>();
        setmediumpool.add("Selena");
        setmediumpool.add("Carol");
        setmediumpool.add("Leonardo");
        setmediumpool.add("Haroldo");
        setmediumpool.add("Juvenal");
    }

    private void setSuperPool(){

        setsuperpool = new TreeSet<>();
        setsuperpool.add("Porto Alegre");
        setsuperpool.add("Florianópolis");
        setsuperpool.add("Curitiba");
        setsuperpool.add("São Paulo");
        setsuperpool.add("Rio de Janeiro");
    }

    public Set<String> getSetPool(){
        return setpool;
    }

    public LinkedList<String> getSetMediumPool() {   return setmediumpool;  }

    public  TreeSet<String> getSuperPool(){
        return setsuperpool;
    }

    public Set<Integer> getSetnum(){   return  setnum;    }
}
