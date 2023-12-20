package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * Метод для входа в маркет
     * @param actor
     */
    public void acceptToMarket(iActorBehaviour actor);

    /**
     * Метод для выхода из маркета
     * @param actors
     */
    public void releseFromMarket(List<Actor> actors);

    /**
     * Метод для оформления заказа и выхода из очереди
     */
    public void update();
}
