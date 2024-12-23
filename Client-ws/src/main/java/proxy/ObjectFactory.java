
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _CoversionEuroToDH_QNAME = new QName("http://ws/", "coversionEuroToDH");
    private static final QName _CoversionEuroToDHResponse_QNAME = new QName("http://ws/", "coversionEuroToDHResponse");
    private static final QName _GetAllComptes_QNAME = new QName("http://ws/", "getAllComptes");
    private static final QName _GetAllComptesResponse_QNAME = new QName("http://ws/", "getAllComptesResponse");
    private static final QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CoversionEuroToDH }
     * 
     * @return
     *     the new instance of {@link CoversionEuroToDH }
     */
    public CoversionEuroToDH createCoversionEuroToDH() {
        return new CoversionEuroToDH();
    }

    /**
     * Create an instance of {@link CoversionEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link CoversionEuroToDHResponse }
     */
    public CoversionEuroToDHResponse createCoversionEuroToDHResponse() {
        return new CoversionEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetAllComptes }
     * 
     * @return
     *     the new instance of {@link GetAllComptes }
     */
    public GetAllComptes createGetAllComptes() {
        return new GetAllComptes();
    }

    /**
     * Create an instance of {@link GetAllComptesResponse }
     * 
     * @return
     *     the new instance of {@link GetAllComptesResponse }
     */
    public GetAllComptesResponse createGetAllComptesResponse() {
        return new GetAllComptesResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoversionEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CoversionEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "coversionEuroToDH")
    public JAXBElement<CoversionEuroToDH> createCoversionEuroToDH(CoversionEuroToDH value) {
        return new JAXBElement<>(_CoversionEuroToDH_QNAME, CoversionEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoversionEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CoversionEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "coversionEuroToDHResponse")
    public JAXBElement<CoversionEuroToDHResponse> createCoversionEuroToDHResponse(CoversionEuroToDHResponse value) {
        return new JAXBElement<>(_CoversionEuroToDHResponse_QNAME, CoversionEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllComptes")
    public JAXBElement<GetAllComptes> createGetAllComptes(GetAllComptes value) {
        return new JAXBElement<>(_GetAllComptes_QNAME, GetAllComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllComptesResponse")
    public JAXBElement<GetAllComptesResponse> createGetAllComptesResponse(GetAllComptesResponse value) {
        return new JAXBElement<>(_GetAllComptesResponse_QNAME, GetAllComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

}
