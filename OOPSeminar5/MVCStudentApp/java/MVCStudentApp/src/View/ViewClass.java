package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView {

    /**
     * Вывод списка студентов на экран
     * @param students
     */
    public void printAllStudents(List<Student> students)
    {
        System.out.println("------------------Список студентов--------------------");
        for(Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------");
    }

    /**
     * Конвертация введенного текста в строковую переменную
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
