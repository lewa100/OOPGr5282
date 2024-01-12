package Model.Domain;

public class Student extends Person implements Comparable<Student>{

    private int id;

    private static int generalId;


    /**
     * Конструктор
     * @param name
     * @param age
     */
    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    public int getId() {
        return id;
    }

    /**
     * Получение ID студента
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Получить данные пользователя в виде строки
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + ", id: " + this.id;
    }


    /**
     * Сортировка студентов сначала по возрасту, потом по ID
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {
        System.out.println(super.getName() + "-" + o.getName());
        if(super.getAge() > o.getAge()) return 1;
        if(super.getAge() < o.getAge()) return -1;
        if(this.id > o.id) return 1;
        if(this.id < o.id) return -1;
        return 0;
    }
}
