
package ws;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConversionWS", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/ServicioFarmaceutico/ConversionWS?WSDL")
public class ConversionWS_Service
    extends Service
{

    private final static URL CONVERSIONWS_WSDL_LOCATION;
    private final static WebServiceException CONVERSIONWS_EXCEPTION;
    private final static QName CONVERSIONWS_QNAME = new QName("http://ws/", "ConversionWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServicioFarmaceutico/ConversionWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERSIONWS_WSDL_LOCATION = url;
        CONVERSIONWS_EXCEPTION = e;
    }

    public ConversionWS_Service() {
        super(__getWsdlLocation(), CONVERSIONWS_QNAME);
    }

    public ConversionWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERSIONWS_QNAME, features);
    }

    public ConversionWS_Service(URL wsdlLocation) {
        super(wsdlLocation, CONVERSIONWS_QNAME);
    }

    public ConversionWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERSIONWS_QNAME, features);
    }

    public ConversionWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConversionWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConversionWS
     */
    @WebEndpoint(name = "ConversionWSPort")
    public ConversionWS getConversionWSPort() {
        return super.getPort(new QName("http://ws/", "ConversionWSPort"), ConversionWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConversionWS
     */
    @WebEndpoint(name = "ConversionWSPort")
    public ConversionWS getConversionWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "ConversionWSPort"), ConversionWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERSIONWS_EXCEPTION!= null) {
            throw CONVERSIONWS_EXCEPTION;
        }
        return CONVERSIONWS_WSDL_LOCATION;
    }

}
