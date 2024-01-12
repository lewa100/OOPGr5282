package Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
    public List<Student> getStudents();
    public HashMap<Integer,Student> getHashStudents();

    void deleteStudentByID(Integer id);
}
