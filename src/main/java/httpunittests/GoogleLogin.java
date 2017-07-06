/**
 * 
 */
package httpunittests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.http.message.HeaderValueFormatter;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.meterware.httpunit.*;
import com.meterware.httpunit.javascript.JavaScript.Document;
import com.sun.jna.StringArray;

import junit.framework.Assert;

/**
 * @author Bindu
 *
 */
public class GoogleLogin {

	/**
	 * @param args
	 * @throws SAXException
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws MalformedURLException, IOException, SAXException {

		WebConversation conversation = new WebConversation();

		WebRequest request = new GetMethodWebRequest("http://www.meterware.com/");

		WebResponse response = conversation.getResponse(request);

		System.out.println("RESPONSE : " + response.getText());

		System.out.println("RESPONSE CODE : "+response.getResponseCode());
		
		String[] headrefields = response.getHeaderFieldNames();
		
		System.out.println("Header fields "+headrefields.length);
		
		for(int i=0; i<headrefields.length;i++)
		{
			System.out.println("header fields : "+headrefields.toString());
		}
	}

}
