import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CaseParser {
	public static String parseTestcaseForQueryItems(Element eElement) {
        NodeList givenList = eElement.getElementsByTagName("given");
        NodeList whenList = eElement.getElementsByTagName("when");
        NodeList thenList = eElement.getElementsByTagName("then");
        NodeList itemList = eElement.getElementsByTagName("item");
        
        Node node;
        
        String humantext = "If ";
        for (int i = 0; i < whenList.getLength(); i++) {
        	if (i>0) {humantext+=" and ";}
            node = whenList.item(i);
            humantext+=node.getTextContent();
        }
        humantext+=" ";
        node = itemList.item(0);
        humantext+=node.getTextContent();
        
        
        humantext += ", and ";
        for (int i = 0; i < givenList.getLength(); i++) {
        	if (i>0) {humantext+=" and ";}
            node = givenList.item(i);
            humantext+=node.getTextContent();
        }
        
        
        humantext+= ", then ";
        for (int i = 0; i < thenList.getLength(); i++) {
        	if (i>0) {humantext+=" and ";}
            node = thenList.item(i);
            humantext+=node.getTextContent();
	
        }
        return humantext;
	}

	public static String parseTestcaseForOrderMaterials(Element eElement) {
        NodeList givenList = eElement.getElementsByTagName("given");
        NodeList whenList = eElement.getElementsByTagName("when");
        NodeList thenList = eElement.getElementsByTagName("then");
        NodeList materialList = eElement.getElementsByTagName("material");
        
        Node node;
        
        String humantext = "If ";
        for (int i = 0; i < whenList.getLength(); i++) {
        	if (i>0) {humantext+=" and ";}
            node = whenList.item(i);
            humantext+=node.getTextContent();
        }
        humantext+=" ";
        for (int i = 0; i < materialList.getLength(); i++) {
        	if (i>0) {humantext+=" and ";}
            node = materialList.item(i);
            humantext+=node.getTextContent();
        }
        
        humantext += ", and ";
        for (int i = 0; i < givenList.getLength(); i++) {
        	if (i>0) {humantext+=" and ";}
            node = givenList.item(i);
            humantext+=node.getTextContent();
        }
        
        
        humantext+= ", then ";
        for (int i = 0; i < thenList.getLength(); i++) {
        	if (i>0) {humantext+=" and ";}
            node = thenList.item(i);
            humantext+=node.getTextContent();
        }
		return humantext;
	}

	public static String parseTestcaseForShipItem(Element eElement) {
        NodeList givenList = eElement.getElementsByTagName("given");
        NodeList whenList = eElement.getElementsByTagName("when");
        NodeList thenList = eElement.getElementsByTagName("then");
        NodeList itemList = eElement.getElementsByTagName("item");
        NodeList addressList = eElement.getElementsByTagName("address");
        Node node;
        
        String humantext = "If ";
        for (int i = 0; i < whenList.getLength(); i++) {
        	if (i>0) {humantext+=" and ";}
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
        	if (i>0) {humantext+=" and ";}
            node = givenList.item(i);
            humantext+=node.getTextContent();
        }
       
        humantext+= ", then ";
        if (itemList.getLength()>1) {
            node = itemList.item(1);
            humantext+=node.getTextContent();
        }
        for (int i = 0; i < thenList.getLength(); i++) {
        	if (i>0) {humantext+=" and ";}
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
