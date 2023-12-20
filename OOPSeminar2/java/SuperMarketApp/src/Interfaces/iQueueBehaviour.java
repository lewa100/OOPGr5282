package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    /**
     * Метод что клиент встал в очередь
     * @param actor
     */
    public void takeInQueue(iActorBehaviour actor);

    /**
     * Метод для покидания очереди в маркете
     */
    public void releaseFromQueue();

    /**
     * Метод для оформления заказа
     */
    public void takeOrder ();

    /**
     * Метод для выдачи заказа
     */
    public void giveOrder ();
}
