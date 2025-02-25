package Bai4_1;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(3.0, "blue");

        System.out.println("=== Testing Circle ===");
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());

        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());

        System.out.println(circle3);
        System.out.println("Area: " + circle3.getArea());

        circle3.setColor("green");
        circle3.setRadius(4.0);
        System.out.println("Modified Circle3: " + circle3);
        System.out.println("New Area: " + circle3.getArea());

        System.out.println("\n=== Testing Cylinder ===");
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(5.0);
        Cylinder cylinder3 = new Cylinder(2.5, 10.0);
        Cylinder cylinder4 = new Cylinder(3.0, 7.0, "yellow");

        System.out.println(cylinder1);
        System.out.println("Volume: " + cylinder1.getVolume());

        System.out.println(cylinder2);
        System.out.println("Volume: " + cylinder2.getVolume());

        System.out.println(cylinder3);
        System.out.println("Volume: " + cylinder3.getVolume());

        System.out.println(cylinder4);
        System.out.println("Volume: " + cylinder4.getVolume());

        cylinder4.setHeight(10.0);
        cylinder4.setRadius(4.0);
        cylinder4.setColor("purple");
        System.out.println("Modified Cylinder4: " + cylinder4);
        System.out.println("New Volume: " + cylinder4.getVolume());
    }
}