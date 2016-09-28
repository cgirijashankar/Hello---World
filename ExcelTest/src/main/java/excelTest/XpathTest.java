package excelTest;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class XpathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		/*try {
			DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
			domFactory.setNamespaceAware(true);

			DocumentBuilder builder = domFactory.newDocumentBuilder();
			
			Document document = builder.parse(new InputSource("./target/Create_one device_one prod num_Request.xml"));
			
			XPath xpath = XPathFactory.newInstance().newXPath();
			
			xpath.setNamespaceContext(new XmlNamespaceCache(document,false));
			
			//String Xpath = "/soapenv:Envelope/soapenv:Body/ws:process/EEPEvent/eep:Body/eep:Account/eep:HomePhone";
			String Xpath = "//eep:HomePhone/../eep:AccountHoldStatus";
			int a=0;  
			int failCount=0;

				Object nodes = xpath.evaluate(Xpath, document.getDocumentElement(), XPathConstants.NODESET);

				if (nodes instanceof NodeList) {
					for (int j = 0; j < ((NodeList)nodes).getLength(); j++) {

							if (((NodeList)nodes).getLength() > 0 ) {
								System.out.println("Value++++==" + ((NodeList)nodes).item( j).getTextContent());
								
							}else {
								failCount++;
							}

						}
					}
			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		/*String s1 = "abc";
		String s2 = "abc";
		
		if (s1.equals(s2)){
			System.out.println("true");
		}else {
			System.out.println("false");
		}*/
		
		try {
			/*DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
			domFactory.setNamespaceAware(true);

			DocumentBuilder builder = domFactory.newDocumentBuilder();
			
			Document document = builder.parse(new InputSource("./target/Create_one device_one prod num_Requests.xml"));*/
			
			System.out.println("A");
			
		}	finally { System.out.println("B");}
		
	}

}
