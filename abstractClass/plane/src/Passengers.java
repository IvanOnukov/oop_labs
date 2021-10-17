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
        setName(name);
        setTank(tank);
        setDistance(distance);
    }
    public void setseats(int seats){num_seats = seats;}
    public int getseats(){ return num_seats; }

    @Override
    public String toString() {
        return super.toString()+getseats();
    }

    @Override
    public void print(){
        System.out.println(this.toString());
    }
}
