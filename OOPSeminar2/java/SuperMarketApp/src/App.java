import Classes.*;
import Interfaces.iActorBehaviour;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        Log.setLogName("log.txt");
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new OrdinaryClient("masha");
        iActorBehaviour client3 = new SpecialClient("prezident", 1);
        iActorBehaviour client4 = new TaxInspector();
        iActorBehaviour client_promo_1 = new PromotionalClient("Vasya",10);
        PromotionalClient.getClientCounter();
        iActorBehaviour client_promo_2 = new PromotionalClient("Kostya",11);
        PromotionalClient.getClientCounter();
        iActorBehaviour client_promo_3 = new PromotionalClient("Masha",12);
        PromotionalClient.getClientCounter();


        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.acceptToMarket(client_promo_1);
        magnit.acceptToMarket(client_promo_2);
        magnit.acceptToMarket(client_promo_3);


        magnit.update();
    }
}
