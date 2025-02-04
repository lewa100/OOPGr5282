package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassFile implements iGetModel {
    private String fileName;

    /**
     * Конструктор
     * @param fileName
     */
    public ModelClassFile(String fileName) {
        this.fileName = fileName;

        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Выдача списка студентов из файла
     * @return
     */
   // @Override
    public List<Student> getStudents() {
        List<Student> students  = new ArrayList<Student>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }

    /**
     * Удаление студента из файла по  ID
     * @param id
     */
    @Override
    public void deleteStudentByID(Integer id) {
        var students = getStudents();
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
            saveAllStudentToFile(students);
            System.out.println("Студент удален!");
        }
    }

    /**
     * Метод для сохранения студентов в файл
     * @param students
     */
    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
