import proxy.BanqueService;
import proxy.BanqueSv;
import proxy.Compte;

import java.util.Scanner;

public class ClientWS {
    public static void main(String[] args) {
        //objet middleware
        //stub c'est le proxy coté client
        BanqueService stub=new BanqueSv().getBanqueServicePort();
        //la consommation du Web Service
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez entrer le montant en dirhams (DH) que vous souhaitez convertir en livres sterling (£) :");
        double montant=scanner.nextDouble();
        double resultatConversion=stub.coversionEuroToDH(montant);
        System.out.println(montant + " DH équivalent à : " + resultatConversion + " £");

        System.out.println("Veuillez entrer le code client que vous souhaitez consulter :");
        int code=scanner.nextInt();
        Compte cp=stub.getCompte(code);
        System.out.println("Code :"+cp.getCode());
        System.out.println("Solde :"+cp.getSolde());
        System.out.println("Date: "+cp.getDateCreation());

    }
}
