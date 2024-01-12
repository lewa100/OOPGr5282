package View;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClassEng implements iGetView {

    /**
     * Вывод списка студентов на экран на английском
     * @param students
     */
    public void printAllStudents(List<Student> students)
    {
        System.out.println("------------------List of students--------------------");
        for(Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------");
    }

    /**
     * Конвертация введенного текста в строковую переменную на английском
     * @param msg
     * @return
     */
    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
