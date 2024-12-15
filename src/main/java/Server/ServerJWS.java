package Server;


import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {

    public static void main(String[] args) {
        String utl="http://localhost:5551/";
        Endpoint.publish(utl,new BanqueService());
        System.out.println("web Service déployé sur "+utl);
    }
}
