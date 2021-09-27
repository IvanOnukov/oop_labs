import java.util.*;
public class Passengers extends Plane{
    private int num_seats;

    public Passengers()
    {
        num_seats = 0;
    }
    public  Passengers(int nam){
        num_seats = nam;
    }
    public Passengers(String name, double tank, double distance, int nam){
        num_seats = nam;
        SetName(name);
        SetTank(tank);
        SetDistance(distance);
    }
    public void SetSeats(int seats){num_seats = seats;}
    public void GetSeats(){ System.out.println(num_seats); }
}
