package Model.Domain;

public class Person {

    private String name;
    private int age;

    /**
     * Конструктор
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Получить имя пользователя
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Установка имени пользователя
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получить возраст пользователя
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Установить возраст пользователю
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Получить данные пользователя в виде строки
     * @return
     */
    @Override
    public String toString() {
        return "Person" + " name: " + this.name + ", age: " + this.age;
    }
}
