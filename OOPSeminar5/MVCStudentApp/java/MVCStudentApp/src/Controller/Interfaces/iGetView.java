package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetView {
    void printAllStudents(List<Student> students);
    String prompt(String msg);
}
