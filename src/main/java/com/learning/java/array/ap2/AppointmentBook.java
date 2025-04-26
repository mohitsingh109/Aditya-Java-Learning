package com.learning.java.array.ap2;

public class AppointmentBook {

    private boolean[][] schedule;

    public AppointmentBook() {
        this.schedule = new boolean[8][60]; // false

        // marking all the minute as available
        for(int period = 0; period < 8; period++) {
            for(int minute = 0; minute < 60; minute++) {
                schedule[period][minute] = true;
            }
        }
    }

    private boolean isMinuteFree(int period, int minute) {
        return schedule[period - 1][minute];
    }

    //1 <= period <= 8
    private void reserveBlock(int period, int startMinute, int duration) {
        for(int i = 0; i < duration; i++) {
            schedule[period - 1][startMinute + i] = false; // marking that minute as booked
        }
    }

    // findFreeBlock(2, 2)
    //1  <= period <= 8
    public int findFreeBlock(int period, int duration) {

        for(int start = 0; start <= 60 - duration; start++) {
            boolean found = true; // here it's true

            for(int i = 0; i < duration; i++) { //3 min
                if(!isMinuteFree(period, start + i)) {
                    found = false; // that minute is not available
                    break;
                }
            }
            if (found) {
                return start;
            }
        }

        return -1;
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {

        for (int period = startPeriod; period <= endPeriod; period++) {
            int startMinute = findFreeBlock(period, duration);

            if(startMinute != -1) {
                reserveBlock(period, startMinute, duration);
                return true;
            }
        }

        return false;
    }
}
