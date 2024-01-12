package Model;

import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClass implements iGetModel {

    private List<Student> students;

    /**
     * Конструктор
     * @param students
     */
    public ModelClass(List<Student> students) {
        this.students = students;
    }

    /**
     * Получение списка студентов
     * @return
     */
    public List<Student> getStudents()
    {
        return students;
    }

    @Override
    public HashMap<Integer, Student> getHashStudents() {
        return null;
    }

    /**
     * Удаление студента из списка по его ID
     * @param id
     */
    @Override
    public void deleteStudentByID(Integer id) {
        boolean isFind = false;
        for(Student stud : students){
            if (stud.getId() == id){
                students.remove(stud);
                isFind = true;
            }
        }
        if (!isFind){
            System.out.println("Студент не найден!");
        }else {
            System.out.println("Студент удален!");
        }
    }

}
