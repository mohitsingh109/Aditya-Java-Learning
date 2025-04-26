package com.learning.java.array.ap2;

public class TestAppointment {

    public static void main(String[] args) {
        AppointmentBook appointmentBook = new AppointmentBook();
        System.out.println(appointmentBook.makeAppointment(1, 3, 35));
        // period1 ==> [0-34] Occupied
        System.out.println(appointmentBook.makeAppointment(1, 3, 35));
        // period2 ==> [0-34] Occupied
        System.out.println(appointmentBook.makeAppointment(1, 3, 10));
        // period1 ==> [35 - 44]
        System.out.println(appointmentBook.makeAppointment(1, 3, 5));
        // period1 ==> [45 - 49]
        System.out.println(appointmentBook.makeAppointment(1, 3, 60));
        // period3 ==> [0, 59]
        System.out.println(appointmentBook.makeAppointment(1, 3, 25));
        // period2 ==> [35, 54]
        System.out.println(appointmentBook.makeAppointment(1, 3, 5));
        // period1 ==> [50 , 54]
        System.out.println(appointmentBook.makeAppointment(1, 3, 5));
        // period1 ==> [55 , 59]
        System.out.println(appointmentBook.makeAppointment(1, 3, 4));
        System.out.println(appointmentBook.findFreeBlock(3, 5));
    }
}
