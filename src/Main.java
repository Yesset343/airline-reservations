package org.example;

public class Main {
    public static void main(String[] args) {

        Passenger p1 = new Passenger(1, "John Smith", "AA123456");
        Passenger p2 = new Passenger(2, "Anna Brown", "BB987654");

        Flight f1 = new Flight("FL101", "New York", 180);
        Flight f2 = new Flight("FL102", "London", 200);

        Reservation r1 = new Reservation(1001, p1, f1);
        Reservation r2 = new Reservation(1002, p2, f2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(r1);
        System.out.println(r2);

        if (f1.getCapacity() > f2.getCapacity()) {
            System.out.println("Flight FL101 has more capacity");
        } else {
            System.out.println("Flight FL102 has more or equal capacity");
        }
    }
}
