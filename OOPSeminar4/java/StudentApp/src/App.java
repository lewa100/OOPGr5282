import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.PersonComparator;
import Domain.Student;
import Domain.StudentGroup;
import Domain.Teacher;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);


        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");

        System.out.println(new PersonComparator<Teacher>().compare(t1, t2));
        System.out.println(new PersonComparator<Student>().compare(s1, s2));

       // AccountController controller = new AccountController();
       // controller.paySalary(t1, 50000);
       // controller.paySalary(s1, 50000);

       AccountController.paySalary(t1, 50000);
       var tchService = new TeacherService();
       tchService.create("Anastasiya", 34);
       tchService.create("Viktor", 50);
        tchService.create("Anatoliy", 30);
       tchService.create("Semen", 29);

        System.out.println("=========================================================");
        System.out.println(tchService.getAll());
        System.out.println("=========================================================");
       tchService.sortByFIO();
        System.out.println(tchService.getAll());
        System.out.println("=========================================================");

        System.out.printf("averageAge = %.2f\n", AccountController.averageAge(listStud));
    }
}
