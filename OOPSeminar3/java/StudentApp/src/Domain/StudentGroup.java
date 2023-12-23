package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StudentGroup implements Iterable<Student>,Comparable<StudentGroup>  {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{" +
                "idGroup=" + idGroup +
                ", counter=" + group.size() +
                ", StudentList=" + group +
                '}';
    }

    public static StudentGroup newGroupList (Integer id, Integer firstPosition, Integer counter) {
        var list = new ArrayList<Student>();
        for(int i = firstPosition;i < firstPosition+counter;i++){
            list.add(new Student("Student_"+i, ThreadLocalRandom.current().nextInt(15, 24 + 1)));
        }
        return new StudentGroup(list, id);
    }

    // @Override
    // public Iterator<Student> iterator() {
    //    return new Iterator<Student>() {

    //     private int counter;

    //     @Override
    //     public boolean hasNext() {

    //         if(counter<group.size())
    //         {
    //             return true;
    //         }
    //         else
    //         {
    //             return false;
    //         }
    //     }

    //     @Override
    //     public Student next() {
    //         return group.get(counter++);
    //     }

    //    };

    // }

     @Override
    public Iterator<Student> iterator() {
       return new StudentIterator(group);

    }

    @Override
    public int compareTo(StudentGroup g) {
        if (this.getGroup().size()==g.getGroup().size()){
            if(idGroup==g.idGroup)return 0 ;
            if(idGroup>g.idGroup)return 1;
            else return -1;
        }

        if(this.getGroup().size()>g.getGroup().size())
            return 1;
        else
            return -1;
    }
}
