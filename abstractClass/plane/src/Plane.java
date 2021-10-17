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

   public void setName(String name){ name_plane = name; }
   public void setTank(double tank){ fuel_tank = tank; }
   public void setDistance(double distance){ max_distance = distance; }

   public String getname(){ return name_plane; }
   public double gettank(){return fuel_tank;}
   public double getdistanse(){ return max_distance; }


    public String toString(){
        return getname()+"\n"+gettank()+"\n"+getdistanse();
    }
    public void print(){
        System.out.println(this.toString());
    }



}
