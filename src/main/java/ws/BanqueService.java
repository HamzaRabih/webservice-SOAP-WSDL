package ws;



import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//POJO: plain Old Java Object:classe java simple
@WebService(serviceName="BanqueSv")
public class BanqueService {

    @WebMethod(operationName = "coversionEuroToDH")
    public double coversion(@WebParam(name = "montant") double mt){
        return mt*11;
    }

    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*1200,new Date());
    }

    @WebMethod(operationName = "getAllComptes")
    public List<Compte> getAllComptes(){

        return List.of(
                new Compte((int) (Math.random()*10),Math.random()*1200,new Date()),
                new Compte((int) (Math.random()*10),Math.random()*100,new Date()),
                new Compte((int) (Math.random()*10),Math.random()*90800,new Date()),
                new Compte((int) (Math.random()*10),Math.random()*3489,new Date()),
                new Compte((int) (Math.random()*10),Math.random()*11200,new Date()),
                new Compte((int) (Math.random()*10),Math.random()*6080,new Date())
        );
    }






}
