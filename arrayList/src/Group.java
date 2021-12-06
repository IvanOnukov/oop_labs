
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Group {

    ArrayList<Student> group;

    Group(){
        group = new ArrayList<>();
    }
     public void add(Student newStudent)
     {
         group.add(newStudent);
     }

     public void remove(Student rmStudrnt)
     {
         group.remove(rmStudrnt);
     }

     public int size(){
       return group.size();
     }

    Student getElem(int i){ return group.get(i);}

    void sortName(){
        Comparator nameTemplate = new NameShortComparator();
        Collections.sort(group, nameTemplate);
    }

    void sortAverScore(){
        Comparator averScoreTemplate = new AverageScoreComparator();
        Collections.sort(group, averScoreTemplate);
    }

    void sortCourse(){
        Collections.sort(group);
    }

    public void viewALL(){
        for (Student i : group){
        System.out.print(
                i.getName()+"\t"
                        + i.getCourse()+"\t"
                        + i.getFaculty()+"\t"
                        +i.getAverScore()+"\n"
        );
        }
    }


    public void fullRecord(int i){
         System.out.print(
                 getElem(i).getName()+"\t"
                         + getElem(i).getCourse()+"\t"
                         + getElem(i).getFaculty()+"\t"
                         +getElem(i).getAverScore()+"\n"
         );
     }


}
