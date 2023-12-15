package Domen;

public class HotDrink extends Product {
    // Поля
    private int tempHotDrink;
// Свойства
    public int getHotDrinkTemperature() {
        return tempHotDrink;
    }

    public void setHotDrinkTemperature(int temp) {
        this.tempHotDrink = temp;
    }
    //конструкторы
    public HotDrink(int price, int place, String name, long id){
        super(price,place,name,id);
        this.tempHotDrink = 100;
    }
    public HotDrink(int price, int place, String name, long id, int temp){
        super(price,place,name,id);
        this.tempHotDrink = temp;
    }

    @Override
    public String toString() {
        return super.toString() + "temperature="+tempHotDrink ;
    }

}


