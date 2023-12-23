package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> studentGroupList;

    public StudentGroupIterator(List<StudentGroup> sgList) {
        this.studentGroupList = sgList;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
       return counter<studentGroupList.size();
    }
    @Override
    public StudentGroup next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return studentGroupList.get(counter++);
    }

}

