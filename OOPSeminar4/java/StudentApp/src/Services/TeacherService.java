package Services;

import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher>  {

    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age){
        var teacher = new Teacher(name, age,"Docent");
        count++;
        teachers.add(teacher);
    }

    public void sortByFIO()
    {
        PersonComparator<Teacher> tchComp = new PersonComparator<Teacher>();
        teachers.sort(tchComp);
    }
}
