package Caroneiro;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Source {

    private static final String filePath = "src/main/java/Paradigma/source.xml";
    private String[] data;
    private int[] numeros;

    public Source(){
        readxmlsource(filePath);
    }

    public int[] getNumeros() {
        return numeros;
    }

    public String[] getData() {
        return data;
    }

    private void readxmlsource(String path  ) {

        try{
            File arquivo = new File(path);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(arquivo);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("carro");
            int tam = nodeList.getLength();
            data = new String[tam];
            numeros = new int[tam];

            for(int itr=0; itr < tam; itr++){
                Node node = nodeList.item(itr);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) node;
                    data[itr] = eElement.getElementsByTagName("nome").item(0).getTextContent();
                    numeros[itr] =  Integer.parseInt( eElement.getElementsByTagName("lugares").item(0).getTextContent());
                }
            }
        }
        catch(Exception e){
            System.err.println(e);
        }
    }

}
