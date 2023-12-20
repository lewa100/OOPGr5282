package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehaviour, iReturnOrder {
    private List<iActorBehaviour> queue;

    /**
     * Конструктор Маркета
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        var str = String.format("%s клиент пришел в магазин ", actor.geActor().getName());
        System.out.println(str);
        Log.writeToFile(str+"\n");
        takeInQueue(actor);
    }


    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
//        System.out.println(actor.geActor().getName() + " клиент добавлен в очередь ");
        var str = String.format("%s клиент добавлен в очередь ", actor.geActor().getName());
        System.out.println(str);
        Log.writeToFile(str+"\n");
    }


    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
//            System.out.println(actor.getName() + " клиент ушел из магазина ");
            var str = String.format("%s клиент ушел из магазина ", actor.geActor().getName());
            System.out.println(str);
            Log.writeToFile(str+"\n");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }


    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
//                System.out.println(actor.geActor().getName() + " клиент получил свой заказ ");
                var str = String.format("%s клиент получил свой заказ ", actor.geActor().getName());
                System.out.println(str);
                Log.writeToFile(str+"\n");
            }
        }
    }


    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
//                System.out.println(actor.geActor().getName() + " клиент ушел из очереди ");
                var str = String.format("%s клиент ушел из очереди ", actor.geActor().getName());
                System.out.println(str);
                Log.writeToFile(str+"\n");
            }
        }
        releseFromMarket(releaseActors);
    }


    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
//                System.out.println(actor.geActor().getName() + " клиент сделал заказ ");
                var str = String.format("%s клиент сделал заказ ", actor.geActor().getName());
                System.out.println(str);
                Log.writeToFile(str+"\n");
            }
        }

    }


    @Override
    public void acceptReturnOrder(iActorBehaviour actor) {
//        System.out.println(actor.geActor().getName() + " клиенту заменили заказ ");
        var str = String.format("%s клиенту заменили заказ ", actor.geActor().getName());
        System.out.println(str);
        Log.writeToFile(str+"\n");
    }

    @Override
    public void changeReturnOrder(iActorBehaviour actor) {
        System.out.println(actor.geActor().getName() + " клиенту поменяли заказ ");
        var str = String.format("%s клиенту поменяли заказ ", actor.geActor().getName());
        System.out.println(str);
        Log.writeToFile(str+"\n");
    }
}


