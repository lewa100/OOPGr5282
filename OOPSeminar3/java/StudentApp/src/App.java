import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        var group23 = StudentGroup.newGroupList(23, 1, 8);
        var group33 = StudentGroup.newGroupList(33, 10, 4);
        var group11 = StudentGroup.newGroupList(11, 40, 6);
        var group55 = StudentGroup.newGroupList(55, 30, 7);
        var group77 = StudentGroup.newGroupList(77, 90, 9);
        var group1 = StudentGroup.newGroupList(1, 100, 6);

        var groupList = new ArrayList<StudentGroup>();
        groupList.add(group23);
        groupList.add(group33);
        groupList.add(group11);
        groupList.add(group55);
        groupList.add(group77);
        groupList.add(group1);

        var steam1 = new StudentSteam(groupList, 1);

        for(StudentGroup group : steam1)
        {
            System.out.println(group);
        }

        System.out.println("=========================================================");
        Collections.sort(group11.getGroup());
        for(var item: group11.getGroup())
        {
            System.out.println(item);
        }

        System.out.println("=========================================================");
        Collections.sort(steam1.getSteam());

        for(var stm: steam1.getSteam())
        {
            System.out.println(stm);
        }
        System.out.println("=========================================================");
        System.out.println(steam1);
    }
}
