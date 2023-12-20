package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    /**
     * Метод возвращающий состояние получен ли заказ
     * @return
     */
    public boolean isTakeOrder();

    /**
     * Метод возвращающий стостояние сделвн ли заказ
     * @return
     */
    public boolean isMakeOrder();

    /**
     * Метод для установки состояния выдачи заказа
     * @param val
     */
    public void setTakeOrder(boolean val);

    /**
     * Метод для установки состояния создания заказа
     * @param val - заказ принят
     */
    public void setMakeOrder(boolean val);

    /**
     * Метод для возврата класса Автор
     * @return
     */
    public Actor geActor();
}
