public class Main {
    public static void main(String[] args) {
        Money one = new Money(32.1);

        System.out.println("////Money////");

        System.out.println(one.plus(43.9));
        System.out.println(one.minus(23.9));
        System.out.println(one.multi(2));
        System.out.println(one.div(3));

        System.out.println("////Fraction////");

        Fraction two = new Fraction(54.21);
        System.out.println(two.plus(15.79));
        System.out.println(two.minus(14.21));
        System.out.println(two.multi(3));
        System.out.println(two.div(2));

    }
}
