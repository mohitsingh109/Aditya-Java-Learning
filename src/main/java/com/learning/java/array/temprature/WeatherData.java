package com.learning.java.array.temprature;

import java.util.ArrayList;

public class WeatherData {

    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void printData() {
        System.out.println(temperatures);
    }

    public void cleanData(double lower, double upper) {
        // 100.0, 147.0
        // [142.0, 140.02, 181.1, 45.1]
        //                          i
        // [142.0, 140.02] ==> [142.0, 140.02, 181.1, 55.1]

        // you are loop over an array as well as you are deleting data from array
        for(int i = 0; i < temperatures.size(); i++) {
            double temp = temperatures.get(i);
            if( temp < lower || temp > upper ) {
                //remove from list
                temperatures.remove(i);
                i--; // Adjust index because list size decrease
            }
        }
    }

    public int longestHeatWave(double threshold) {
        // AACCBBBDDDDEE
        // AA = 2
        // CC = 2 X
        // BBB = 3  C
        // DDDD = 4 C
        // EE = 2 X
        // array = [10, 5, 11, 7, 8, 11, 10, 6, 11, 11, 11] , [9]
        // [10] ==> 1  (currentLength = 1)
        // [11] ==> 1 (currentLength = 1)  X
        // [11, 10] ==> 2  (currentLength = 3)  C
        // [11, 11, 11] ==> 3

        int maxLength = 0;
        int currentLength = 0;

        for(double temp: temperatures) {
            if(temp > threshold) {
                currentLength++;
                if(currentLength > maxLength) { // to pick the best option
                    maxLength = currentLength; // 2
                }
            } else {
                currentLength = 0; // to handle the rest case if not greater value found
            }
        }
        return maxLength;
    }

}
