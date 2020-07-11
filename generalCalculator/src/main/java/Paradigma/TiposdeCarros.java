package Paradigma;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class TiposdeCarros {

    private static final String filePath = "src/main/java/Paradigma/source.xml";
    private static String[] modelos;
    private static int[] numeros;

    public TiposdeCarros(){

        try{
            File file = new File(filePath);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("carro");
            int tam = nodeList.getLength();

            modelos = new String[tam];
            numeros = new int[tam];

            for(int itr=0; itr < tam; itr++){
                Node node = nodeList.item(itr);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) node;
                    modelos[itr] = eElement.getElementsByTagName("nome").item(0).getTextContent();
                    numeros[itr] =  Integer.parseInt( eElement.getElementsByTagName("lugares").item(0).getTextContent());
                }
            }

        }catch (Exception e){
            System.err.println("Erro no processamento do XML.\n" + e );
        }
    }

    public String[] getCarName(){
        return modelos;
    }

    public int[] numberOfSeats(){
        return numeros;
    }

}
