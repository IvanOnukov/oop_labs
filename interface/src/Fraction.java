public class Fraction implements Pair{

   private double value;

    Fraction(double value){

        this.value = value;
    }

    public void setValue(double value){
        this.value = value;
    }
    public double getValue(){
        return this.value;
    }

    public double plus(double value){

        double result = this.value + value;

        return  result;
    }
    public double minus(double value){

        double result = this.value - value;

        return  result;
    }
    public double multi(double value){

        double result = this.value * value;

        return  result;
    }
    public double div(double value){

        double result = this.value / value;

        return  result;
    }

}
