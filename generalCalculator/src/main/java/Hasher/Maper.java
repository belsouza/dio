package Hasher;

//HashMap
//TreeMap
//HashTable
//Armazena dos tipos de objetos: chave, que nao pode ser repetido e valor

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maper {

    private Map<String, Integer> champions = new HashMap<>();
    private TreeMap<String, Integer> newchampions = new TreeMap<>();
    private Map<String, String> estados = new HashMap<>();

    public Maper()
    {
        setChampions();
        setNewChampions();
        setEstados();
    }

    private void setEstados(){
       // estados.put("DF"," Distrito Federal");
        estados.put("CE","Ceará");
        estados.put("BA","Bahia");
        estados.put("AM","Amazonas");
        estados.put("AP","Amapá");
        estados.put("AL","Alagoas");
        estados.put("AC","Acre");
        estados.put("RN","Rio Grande do Norte");
        estados.put("RJ","Rio de Janeiro");
        estados.put("PI","Piauí");
        estados.put("PE","Pernambuco");
        estados.put("PR","Paraná");
        estados.put("PB","Paraíba");
        estados.put("PA","Pará");
        estados.put("MG","Minas Gerais");
        estados.put("MS","Mato Grosso do Sul");
        estados.put("MT","Mato Grosso");
        estados.put("MA","Maranhão");
        estados.put("GO","Goiás");
        estados.put("ES","Espírito Santo");
        estados.put("SE","Sergipe");
        estados.put("SP","São Paulo");
        estados.put("SC","Santa Catarina");
        estados.put("RR","Roraima");
        estados.put("RO"," Rondônia");
        estados.put("RS","Rio Grande do Sul");
        estados.put("TO"," Tocantins");

    }

    private void setChampions(){
        champions.put("Brasil", 5);
        champions.put("Alemanha", 4);
        champions.put("Italia", 4);
        champions.put("Uruguai", 2);
        champions.put("Argentina", 2);
        champions.put("Franca", 2);
        champions.put("Inglaterra", 1);
        champions.put("Espanha", 1);
    }

    private void setNewChampions(){
        newchampions.put("Brasil", 5);
        newchampions.put("Alemanha", 4);
        newchampions.put("Italia", 4);
        newchampions.put("Uruguai", 2);
        newchampions.put("Argentina", 2);
        newchampions.put("Franca", 2);
        newchampions.put("Inglaterra", 1);
        newchampions.put("Espanha", 1);
    }

    public Map<String,Integer> getChampions(){
        return champions;
    }

    public TreeMap<String,Integer> getNewchampions(){
        return  newchampions;
    }

    public Map<String,String> getEstados(){
        return estados;
    }
}
