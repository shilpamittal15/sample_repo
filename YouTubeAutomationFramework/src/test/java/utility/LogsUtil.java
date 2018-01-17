package utility;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.DOMConfiguration;

public class LogsUtil 
{
	public void logs(String messages, String ClassName)
	{
		DOMConfigurator.configure(".//Log4j.xml");
		Logger log=Logger.getLogger(ClassName);
		log.info(messages);
	}
}
