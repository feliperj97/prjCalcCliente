
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

    private final static QName _MultiplicarResponse_QNAME = new QName("http://control/", "MultiplicarResponse");
    private final static QName _Substrair_QNAME = new QName("http://control/", "Substrair");
    private final static QName _DividirResponse_QNAME = new QName("http://control/", "DividirResponse");
    private final static QName _Somar_QNAME = new QName("http://control/", "Somar");
    private final static QName _SomarResponse_QNAME = new QName("http://control/", "SomarResponse");
    private final static QName _Dividir_QNAME = new QName("http://control/", "Dividir");
    private final static QName _Multiplicar_QNAME = new QName("http://control/", "Multiplicar");
    private final static QName _SubstrairResponse_QNAME = new QName("http://control/", "SubstrairResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubstrairResponse }
     * 
     */
    public SubstrairResponse createSubstrairResponse() {
        return new SubstrairResponse();
    }

    /**
     * Create an instance of {@link Dividir }
     * 
     */
    public Dividir createDividir() {
        return new Dividir();
    }

    /**
     * Create an instance of {@link Multiplicar }
     * 
     */
    public Multiplicar createMultiplicar() {
        return new Multiplicar();
    }

    /**
     * Create an instance of {@link SomarResponse }
     * 
     */
    public SomarResponse createSomarResponse() {
        return new SomarResponse();
    }

    /**
     * Create an instance of {@link DividirResponse }
     * 
     */
    public DividirResponse createDividirResponse() {
        return new DividirResponse();
    }

    /**
     * Create an instance of {@link Somar }
     * 
     */
    public Somar createSomar() {
        return new Somar();
    }

    /**
     * Create an instance of {@link Substrair }
     * 
     */
    public Substrair createSubstrair() {
        return new Substrair();
    }

    /**
     * Create an instance of {@link MultiplicarResponse }
     * 
     */
    public MultiplicarResponse createMultiplicarResponse() {
        return new MultiplicarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "MultiplicarResponse")
    public JAXBElement<MultiplicarResponse> createMultiplicarResponse(MultiplicarResponse value) {
        return new JAXBElement<MultiplicarResponse>(_MultiplicarResponse_QNAME, MultiplicarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Substrair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "Substrair")
    public JAXBElement<Substrair> createSubstrair(Substrair value) {
        return new JAXBElement<Substrair>(_Substrair_QNAME, Substrair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "DividirResponse")
    public JAXBElement<DividirResponse> createDividirResponse(DividirResponse value) {
        return new JAXBElement<DividirResponse>(_DividirResponse_QNAME, DividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "Somar")
    public JAXBElement<Somar> createSomar(Somar value) {
        return new JAXBElement<Somar>(_Somar_QNAME, Somar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "SomarResponse")
    public JAXBElement<SomarResponse> createSomarResponse(SomarResponse value) {
        return new JAXBElement<SomarResponse>(_SomarResponse_QNAME, SomarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "Dividir")
    public JAXBElement<Dividir> createDividir(Dividir value) {
        return new JAXBElement<Dividir>(_Dividir_QNAME, Dividir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "Multiplicar")
    public JAXBElement<Multiplicar> createMultiplicar(Multiplicar value) {
        return new JAXBElement<Multiplicar>(_Multiplicar_QNAME, Multiplicar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstrairResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "SubstrairResponse")
    public JAXBElement<SubstrairResponse> createSubstrairResponse(SubstrairResponse value) {
        return new JAXBElement<SubstrairResponse>(_SubstrairResponse_QNAME, SubstrairResponse.class, null, value);
    }

}
