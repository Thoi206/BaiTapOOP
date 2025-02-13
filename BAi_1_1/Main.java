package BAi_1_1;

public class Main {
    public static void main(String[] args) {
        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());

        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString());
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too
    }
}
