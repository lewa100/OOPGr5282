package Domain;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> steam;
    private Integer idSteam;

    public StudentSteam(List<StudentGroup> steam, Integer idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setGroup(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public Integer getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(Integer idSteam) {
        this.idSteam = idSteam;
    }

     @Override
    public String toString() {
        var str = new StringBuilder();
        str.append("StudentSteam{").
                append("idSteam=").append(idSteam).
                append(", groupCounter=").append(steam.size()).
                append(", groupList=[");
                var list = steam.stream().iterator();
                while (list.hasNext()){
                    var gp = list.next();
                    str.append("groupID=").append(gp.getIdGroup()).
                            append(", studentList=").append(gp.getGroup());
                    if(list.hasNext()){
                        str.append(", ");
                    }
                }
                str.append("]}");
        return str.toString();
    }

     @Override
    public Iterator<StudentGroup> iterator() {
       return new StudentGroupIterator(steam);

    }


}
