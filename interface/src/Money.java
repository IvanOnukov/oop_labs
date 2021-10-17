import java.math.BigDecimal;

public class Money implements Pair{
   private double value;

    Money(double value){
        this.value = value;
    }

    public void setValue(double value){
        this.value = value;
    }
    public double getValue(){
        return this.value;
    }

    private static double round(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, 2);
        return bd.doubleValue();
    }
    public double plus(double value){

        double result = this.value + value;

        return  round(result);
    }
    public double minus(double value){

        double result = this.value - value;

        return  round(result);
    }
    public double multi(double value){

        double result = this.value * value;

        return  round(result);
    }
    public double div(double value){

        double result = this.value / value;

        return  round(result);
    }
}
