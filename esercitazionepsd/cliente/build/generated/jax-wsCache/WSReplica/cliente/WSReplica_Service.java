
package cliente;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSReplica", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/WSReplica/WSReplica?wsdl")
public class WSReplica_Service
    extends Service
{

    private final static URL WSREPLICA_WSDL_LOCATION;
    private final static WebServiceException WSREPLICA_EXCEPTION;
    private final static QName WSREPLICA_QNAME = new QName("http://ws/", "WSReplica");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSReplica/WSReplica?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSREPLICA_WSDL_LOCATION = url;
        WSREPLICA_EXCEPTION = e;
    }

    public WSReplica_Service() {
        super(__getWsdlLocation(), WSREPLICA_QNAME);
    }

    public WSReplica_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSREPLICA_QNAME, features);
    }

    public WSReplica_Service(URL wsdlLocation) {
        super(wsdlLocation, WSREPLICA_QNAME);
    }

    public WSReplica_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSREPLICA_QNAME, features);
    }

    public WSReplica_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSReplica_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSReplica
     */
    @WebEndpoint(name = "WSReplicaPort")
    public WSReplica getWSReplicaPort() {
        return super.getPort(new QName("http://ws/", "WSReplicaPort"), WSReplica.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSReplica
     */
    @WebEndpoint(name = "WSReplicaPort")
    public WSReplica getWSReplicaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "WSReplicaPort"), WSReplica.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSREPLICA_EXCEPTION!= null) {
            throw WSREPLICA_EXCEPTION;
        }
        return WSREPLICA_WSDL_LOCATION;
    }

}
