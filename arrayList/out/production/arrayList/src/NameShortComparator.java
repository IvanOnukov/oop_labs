import java.util.Comparator;

public class NameShortComparator implements Comparator<Student> {
    public int compare(Student one, Student two){
        return one.getName().compareTo(two.getName());
    }
}
