import java.util.*;
public class Plane {
    private String name_plane;
    private double fuel_tank;
    private double max_distance;

    public Plane(){
        name_plane = "";
        fuel_tank = 0;
        max_distance =0;
    }
    public Plane( String name, double tank, double distance){
        name_plane = name;
        fuel_tank = tank;
        max_distance = distance;
    }

   public void SetName(String name){ name_plane = name; }
   public void SetTank(double tank){ fuel_tank = tank; }
   public void SetDistance(double distance){ max_distance = distance; }

   public void GetName(){ System.out.println( name_plane); }
   public void GetTank(){ System.out.println(fuel_tank); }
   public void GetDistance(){ System.out.println(max_distance); }


}
