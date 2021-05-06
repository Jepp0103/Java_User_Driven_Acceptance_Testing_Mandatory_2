import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {
	
	public static void main (String args[]) throws ParserConfigurationException, SAXException, IOException
	{
        File inputFile = new File("kak.xml");
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    dbFactory.setValidating(true);
	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        
        doc.getDocumentElement().normalize();
        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        
        NodeList cases[]= { doc.getElementsByTagName("shipitem"),doc.getElementsByTagName("ordermaterials"), doc.getElementsByTagName("queryitems")};
      
        for (NodeList caseList : cases) { 
	        for (int temp = 0; temp < caseList.getLength(); temp++) {
	            Node nNode = caseList.item(temp);
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	                Element eElement = (Element) caseList.item(temp); 
	                switch (eElement.getAttribute("story")) {
	                	case "1" :
	                		System.out.println("Test case for user story 1");
	                		System.out.println(parseTestcaseForShipItem(eElement));
	                		System.out.println();
	                		break;
		            	case "2" :
		            		System.out.println("Test case for user story 2");
		            		System.out.println(parseTestcaseForOrderMaterials(eElement));
		            		System.out.println();
		            		break;
		            	case "3" :
		            		System.out.println("Test case for user story 3");
		            		System.out.println(parseTestcaseForQueryItems(eElement));
		            		System.out.println();
		            		break;
	                }

	            }
	                
	                
            }
        }
                      
    }

	private static String parseTestcaseForQueryItems(Element eElement) {
        NodeList givenList = eElement.getElementsByTagName("given");
        NodeList whenList = eElement.getElementsByTagName("when");
        NodeList thenList = eElement.getElementsByTagName("then");
        NodeList itemList = eElement.getElementsByTagName("item");
        
        Node node;
        
        String humantext = "If ";
        for (int i = 0; i < whenList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = whenList.item(i);
            humantext+=node.getTextContent();
        }
        humantext+=" ";
        node = itemList.item(0);
        humantext+=node.getTextContent();
        
        
        humantext += ", and ";
        for (int i = 0; i < givenList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = givenList.item(i);
            humantext+=node.getTextContent();
        }
        
        
        humantext+= ", then ";
        for (int i = 0; i < thenList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = thenList.item(i);
            humantext+=node.getTextContent();
	
        }
        return humantext;
	}

	private static String parseTestcaseForOrderMaterials(Element eElement) {
        NodeList givenList = eElement.getElementsByTagName("given");
        NodeList whenList = eElement.getElementsByTagName("when");
        NodeList thenList = eElement.getElementsByTagName("then");
        NodeList materialList = eElement.getElementsByTagName("material");
        
        Node node;
        
        String humantext = "If ";
        for (int i = 0; i < whenList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = whenList.item(i);
            humantext+=node.getTextContent();
        }
        humantext+=" ";
        for (int i = 0; i < materialList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = materialList.item(i);
            humantext+=node.getTextContent();
        }
        
        humantext += ", and ";
        for (int i = 0; i < givenList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = givenList.item(i);
            humantext+=node.getTextContent();
        }
        
        
        humantext+= ", then ";
        for (int i = 0; i < thenList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = thenList.item(i);
            humantext+=node.getTextContent();
        }
		return humantext;
	}

	private static String parseTestcaseForShipItem(Element eElement) {
        NodeList givenList = eElement.getElementsByTagName("given");
        NodeList whenList = eElement.getElementsByTagName("when");
        NodeList thenList = eElement.getElementsByTagName("then");
        NodeList itemList = eElement.getElementsByTagName("item");
        NodeList addressList = eElement.getElementsByTagName("address");
        Node node;
        
        String humantext = "If ";
        for (int i = 0; i < whenList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = whenList.item(i);
            humantext+=node.getTextContent();
        }
        humantext+=" ";
        node = itemList.item(0);
        humantext+=node.getTextContent();
        humantext+= " to ";
        node = addressList.item(0);
        humantext+=node.getTextContent();
        
        
        humantext += ", and ";
        for (int i = 0; i < givenList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = givenList.item(i);
            humantext+=node.getTextContent();
        }
       
        humantext+= ", then ";
        if (itemList.getLength()>1) {
            node = itemList.item(1);
            humantext+=node.getTextContent();
        }
        for (int i = 0; i < thenList.getLength(); i++) {
        	if (i==1) {humantext+=" and ";}
            node = thenList.item(i);
            humantext+=node.getTextContent();
        }
        if (addressList.getLength()>1) {
            node = addressList.item(1);
            humantext+=" ";
            humantext+=node.getTextContent();
        }
	return humantext;	
	}
	
        
}
	


