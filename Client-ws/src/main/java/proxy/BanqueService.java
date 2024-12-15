
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "coversionEuroToDH", targetNamespace = "http://ws/", className = "proxy.CoversionEuroToDH")
    @ResponseWrapper(localName = "coversionEuroToDHResponse", targetNamespace = "http://ws/", className = "proxy.CoversionEuroToDHResponse")
    @Action(input = "http://ws/BanqueService/coversionEuroToDHRequest", output = "http://ws/BanqueService/coversionEuroToDHResponse")
    public double coversionEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllComptes", targetNamespace = "http://ws/", className = "proxy.GetAllComptes")
    @ResponseWrapper(localName = "getAllComptesResponse", targetNamespace = "http://ws/", className = "proxy.GetAllComptesResponse")
    @Action(input = "http://ws/BanqueService/getAllComptesRequest", output = "http://ws/BanqueService/getAllComptesResponse")
    public List<Compte> getAllComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws/BanqueService/getCompteRequest", output = "http://ws/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
