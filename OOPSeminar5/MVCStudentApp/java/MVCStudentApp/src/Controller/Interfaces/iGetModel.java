package Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
    public List<Student> getStudents();

    void deleteStudentByID(Integer id);
}
