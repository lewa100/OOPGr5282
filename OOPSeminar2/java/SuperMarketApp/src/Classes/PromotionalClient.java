package Classes;

public class PromotionalClient extends Actor {
    final int LIMIT = 2;
    private static int clientCounter = 0;
    private static String promoName = "PROMO";
    private int clientID;

    /**
     * Конструктор для инициализации пользователя по акции
     * @param clientName - имя клиента
     * @param id - идентификатор клиента
     */
    public PromotionalClient(String clientName,int id) {
        super(clientName);
        if (LIMIT == clientCounter){
            System.out.println("Акция завершена");
            return;
        }
        this.clientID = id;
        clientCounter++;
    }

    /**
     * Метод для получение количества участников
     */
    public static void getClientCounter(){
        System.out.println("В акции "+promoName+" количество клиентов: "+clientCounter);
    }

    /**
     * Метод для получения названия акции
     * @return название акции
     */
    public static String getPromoName(){
        return promoName;
    }


    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor geActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
