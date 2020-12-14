package ru.itsjava.oop;

public class Main {

    public static void main(String[] args) {

        Lion simba = new Lion();
        simba.sayR();
        simba.setName("Simba");
        simba.sayMeow();
        System.out.println(simba.getName());

        Lion nala = new Lion("Nala");
        nala.sayR();


        Lion shram = new Lion("Shram");
        shram.sayR();

        Lion muphasa = new Lion("Muphasa");
        muphasa.sayR();

        Cat bagira = new Panther();
        bagira.sayMeow();

        Human m1 = new Human("Alex", 'M', 32);
        m1.sayHello();

        Human w1 = new Human("Alexa", 'W', 27);
        w1.sayHello();

        Iron ir1 = new Iron("Philips", 1200, 2f);
        System.out.println(ir1.getBrand());
        System.out.println(ir1.getPower());
        System.out.println(ir1.getCordLength());

        Iron ir2 = new Iron();
        System.out.println(ir2.getBrand());
        System.out.println(ir2.getPower());
        System.out.println(ir2.getCordLength());

        Automobile car1 = new Automobile("Toyota", "Camry", 181, 2020, 2.5f);
        Automobile car2 = new Automobile("Ford", "EcoSport", 122);
        car2.setReleaseYear(2018);
        car2.setEngineVolume(1.6f);

        car1.printInfo();
        car2.printInfo();


        System.out.println(" ");

        Person[] array = new Person[4];

        array[0] = new Man("Alex", 32);
        array[1] = new Man("Jim", 27);

        array[2] = new Woman("Jane", 25);
        array[3] = new Woman("Megan", 29);

        for (int i = 0; i < array.length; i++) {
            array[i].printAge();
            System.out.println(" ");
        }

        Triangle tr = new Triangle(8.0, 3.0, 3.0);
        System.out.println("tr.getPerimeter() - " + tr.getArea());
        System.out.println("tr.getSquare() - " + tr.getSquare());

        Rectangle rect = new Rectangle(6.0, 4.0);
        System.out.println("rect.getPerimeter() - " + rect.getArea());
        System.out.println("rect.getSquare() - " + rect.getSquare());

        Square sq = new Square(7.0);
        System.out.println("sq.getPerimeter() - " + sq.getArea());
        System.out.println("sq.getSquare() - " + sq.getSquare());

        Circle c1 = new Circle(5.0);
        System.out.println("c1.getArea() = " + c1.getArea());
        System.out.println("c1.getSquare() = " + c1.getSquare());
        System.out.println("Circle.PI = " + Circle.PI);

        Figure c2 = new Circle(6.0);
        System.out.println("c2.getArea() = " + c2.getArea());
    }
}
