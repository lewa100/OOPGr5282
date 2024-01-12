package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.HashMap;
import java.util.List;

public class ModelClassHash implements iGetModel {

    private HashMap<Integer,Student> hashStudents;

    /**
     * Конструктор
     * @param hashStudents
     */
    public ModelClassHash(HashMap<Integer,Student> hashStudents) {
        this.hashStudents = hashStudents;
    }

    /**
     * Выдача hashMap студентов
     * @return
     */
    public HashMap<Integer,Student> getHashStudents()
    {
        return hashStudents;
    }

    /**
     * Удаление списка студентов по id hashMap
     * @param id
     */
    @Override
    public void deleteStudentByID(Integer id) {
        var value = hashStudents.get(id);
        if (value != null) {
            System.out.println("Студент удален!");
        } else {
            hashStudents.remove(id);
            System.out.println("Студент не найден!");
        }
    }

    @Override
    public List<Student> getStudents() {
        return null;
    }
}
