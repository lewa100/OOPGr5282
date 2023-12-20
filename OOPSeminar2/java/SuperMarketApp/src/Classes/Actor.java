package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * Коструктор Автора
     * @param name имя автора
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Метод для возврата имени автора
     * @return
     */
    public abstract String getName();

    /**
     * Метод для установки имени автора
     * @param name
     */
    public abstract void setName(String name);
}





