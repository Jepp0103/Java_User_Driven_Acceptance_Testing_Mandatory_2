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

public class DocumentParser {
	
	public static void main (String args[]) throws SAXException, IOException, ParserConfigurationException
	{
        Document doc = getDocument();
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
	                		System.out.println(CaseParser.parseTestcaseForShipItem(eElement));
	                		System.out.println();
	                		break;
		            	case "2" :
		            		System.out.println("Test case for user story 2");
		            		System.out.println(CaseParser.parseTestcaseForOrderMaterials(eElement));
		            		System.out.println();
		            		break;
		            	case "3" :
		            		System.out.println("Test case for user story 3");
		            		System.out.println(CaseParser.parseTestcaseForQueryItems(eElement));
		            		System.out.println();
		            		break;
	                }

	            }
	                
	                
            }
        }
                      
    }

	private static Document getDocument() throws SAXException, IOException, ParserConfigurationException {
        File inputFile = new File("Testcases.xml");
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    dbFactory.setValidating(true);
	    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		return dBuilder.parse(inputFile);
	}

	
        
}
	


