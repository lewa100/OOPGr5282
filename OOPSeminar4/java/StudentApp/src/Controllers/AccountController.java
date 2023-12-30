package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Teacher;

public class AccountController {

    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    //Загатовка для метода averageAge
    public static <T extends Person> double averageAge(List<T> persons)
    {
        var sum = 0;
        for (var p : persons){
            sum += p.getAge();
        }
        if(sum != 0){
            return (double) sum /persons.size();
        }
        return 0.0;
    }
}
