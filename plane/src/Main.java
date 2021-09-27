import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("введите название самолета");
        String name_plane = sc.nextLine();

        System.out.println("введите обьем бака самолета");
        double tank = sc.nextDouble();

        System.out.println("введите максимальное растояние");
        double distance = sc.nextDouble();

        System.out.println("введите количество пасожиров");
        int person = sc.nextInt();



        Passengers pers = new Passengers(name_plane, tank, distance, person);
        pers.GetSeats();
    }
}
