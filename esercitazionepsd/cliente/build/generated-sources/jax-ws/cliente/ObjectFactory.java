
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GestoreReplicaResponse_QNAME = new QName("http://ws/", "gestore_replicaResponse");
    private final static QName _GestoreReplica_QNAME = new QName("http://ws/", "gestore_replica");
    private final static QName _OperazioneBeanResponse_QNAME = new QName("http://ws/", "operazione_beanResponse");
    private final static QName _OperazioneBean_QNAME = new QName("http://ws/", "operazione_bean");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GestoreReplicaResponse }
     * 
     */
    public GestoreReplicaResponse createGestoreReplicaResponse() {
        return new GestoreReplicaResponse();
    }

    /**
     * Create an instance of {@link GestoreReplica }
     * 
     */
    public GestoreReplica createGestoreReplica() {
        return new GestoreReplica();
    }

    /**
     * Create an instance of {@link OperazioneBeanResponse }
     * 
     */
    public OperazioneBeanResponse createOperazioneBeanResponse() {
        return new OperazioneBeanResponse();
    }

    /**
     * Create an instance of {@link OperazioneBean }
     * 
     */
    public OperazioneBean createOperazioneBean() {
        return new OperazioneBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestoreReplicaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "gestore_replicaResponse")
    public JAXBElement<GestoreReplicaResponse> createGestoreReplicaResponse(GestoreReplicaResponse value) {
        return new JAXBElement<GestoreReplicaResponse>(_GestoreReplicaResponse_QNAME, GestoreReplicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestoreReplica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "gestore_replica")
    public JAXBElement<GestoreReplica> createGestoreReplica(GestoreReplica value) {
        return new JAXBElement<GestoreReplica>(_GestoreReplica_QNAME, GestoreReplica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperazioneBeanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operazione_beanResponse")
    public JAXBElement<OperazioneBeanResponse> createOperazioneBeanResponse(OperazioneBeanResponse value) {
        return new JAXBElement<OperazioneBeanResponse>(_OperazioneBeanResponse_QNAME, OperazioneBeanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperazioneBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operazione_bean")
    public JAXBElement<OperazioneBean> createOperazioneBean(OperazioneBean value) {
        return new JAXBElement<OperazioneBean>(_OperazioneBean_QNAME, OperazioneBean.class, null, value);
    }

}
