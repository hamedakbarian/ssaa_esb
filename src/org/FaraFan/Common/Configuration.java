package org.FaraFan.Common;

/**
 * Created by mohammadi on 10/20/2014.
 */

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.Hashtable;

public class Configuration
{
    Document doc;
    private InputStream inputStream;

    public Configuration(InputStream in) throws Exception
    {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        doc = db.parse(in);
    }

    public Configuration(String name) throws Exception
    {
        inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        doc = db.parse(inputStream);
    }

    public String getRoot()
    {
        return doc.getDocumentElement().getTagName();
    }

    public String getAttribute(String tagName, String attrName)
    {
        return doc.getElementsByTagName(tagName).item(0).getAttributes().getNamedItem(attrName).getNodeValue();
    }

    public Hashtable getAttributes(String tagName)
    {
        NodeList nodes = doc.getElementsByTagName(tagName);
        Hashtable ht = new Hashtable();
        for (int i = 0; i < nodes.getLength(); i++)
        {
            NamedNodeMap nnm = nodes.item(i).getAttributes();
            ht.put(nnm.item(0).getNodeValue(), nnm.item(1).getNodeValue());
        }
        return ht;
    }

    public InputStream getInputStream()
    {
        return inputStream;
    }

    public static String read(String filename, String key, String attr) throws Exception
    {
        Configuration cfg = new Configuration(filename);
        return cfg.getAttribute(key, attr);
    }
}
