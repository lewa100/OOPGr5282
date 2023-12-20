package Interfaces;

import Classes.Actor;

import java.util.List;

public interface iReturnOrder {
    /**
     * Метод для возврата товара
     * @param actor
     */
    public void acceptReturnOrder(iActorBehaviour actor);

    /**
     * Метод для замены товара
     * @param actor
     */
    public void changeReturnOrder(iActorBehaviour actor);
}
