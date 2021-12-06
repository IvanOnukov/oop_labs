import java.util.Comparator;

public class AverageScoreComparator implements Comparator<Student> {
    public int compare(Student one, Student two){
        if (one.getAverScore() < two.getAverScore()){
            return -1 ;
        }else if(one.getAverScore() > two.getAverScore()) {
            return 1;
        }
        return 0;
    }
}
