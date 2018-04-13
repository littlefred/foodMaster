
package wsfood;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FoodDBService", targetNamespace = "http://soap.workshop.java.simplon.co/", wsdlLocation = "http://localhost:8081/soap-demo/foodDBService?wsdl")
public class FoodDBService_Service
    extends Service
{

    private final static URL FOODDBSERVICE_WSDL_LOCATION;
    private final static WebServiceException FOODDBSERVICE_EXCEPTION;
    private final static QName FOODDBSERVICE_QNAME = new QName("http://soap.workshop.java.simplon.co/", "FoodDBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/soap-demo/foodDBService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FOODDBSERVICE_WSDL_LOCATION = url;
        FOODDBSERVICE_EXCEPTION = e;
    }

    public FoodDBService_Service() {
        super(__getWsdlLocation(), FOODDBSERVICE_QNAME);
    }

    public FoodDBService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), FOODDBSERVICE_QNAME, features);
    }

    public FoodDBService_Service(URL wsdlLocation) {
        super(wsdlLocation, FOODDBSERVICE_QNAME);
    }

    public FoodDBService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FOODDBSERVICE_QNAME, features);
    }

    public FoodDBService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FoodDBService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FoodDBService
     */
    @WebEndpoint(name = "FoodDBServicePort")
    public FoodDBService getFoodDBServicePort() {
        return super.getPort(new QName("http://soap.workshop.java.simplon.co/", "FoodDBServicePort"), FoodDBService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FoodDBService
     */
    @WebEndpoint(name = "FoodDBServicePort")
    public FoodDBService getFoodDBServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.workshop.java.simplon.co/", "FoodDBServicePort"), FoodDBService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FOODDBSERVICE_EXCEPTION!= null) {
            throw FOODDBSERVICE_EXCEPTION;
        }
        return FOODDBSERVICE_WSDL_LOCATION;
    }

}