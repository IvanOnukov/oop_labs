import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Student pavel = new Student("Pasha", 2, "ФКТиПМ", 4.0);
        Student alex = new Student("Alex", 2, "ФКТиПМ", 3.5);
        Student ivan = new Student("Ivan", 2, "ФКТиПМ", 3.9);
        Student saha = new Student("Saha", 1, "ФКТиПМ", 3.6);
        Student misha = new Student("Miha", 3, "ФКТиПМ", 4.3);
        Student grisha = new Student("Grisha", 4, "ФКТиПМ", 5.0);

        Group one = new Group();


        one.add(pavel);
        one.add(grisha);
        one.add(ivan);
        one.add(saha);
        one.add(misha);
        one.add(alex);

        one.viewALL();

        System.out.println("------------сортировка по имени-------------");
        one.sortName();
        one.viewALL();


        System.out.println("------------сортировка по курсу-------------");
        one.sortCourse();
        one.viewALL();

        System.out.println("---------сортировка по среднему балу--------");
        one.sortAverScore();
        one.viewALL();






    }
}
