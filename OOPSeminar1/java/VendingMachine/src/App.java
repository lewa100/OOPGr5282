import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)1.5);
        Product item4 = new HotDrink(250, 4, "Coffee Capuchin", 105, 55);
        Product item5 = new HotDrink(10, 5, "Hot Water", 103);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        String [] list = new String[assort.size()];
        int i = 0;
        for(Product prod: venMachine.getProducts())
        {
            System.out.println(prod);
            list[i] = prod.toString();
            i++;
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize(list);
    }
}
