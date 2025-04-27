package com.learning.java.array.temprature;

import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {
        ArrayList<Double> temps = new ArrayList<>();
        temps.add(99.1);
        temps.add(142.0);
        temps.add(140.02);
        temps.add(150.0);
        temps.add(181.1);
        temps.add(77.5);
        temps.add(55.1);
        temps.add(45.1);

        WeatherData weatherData = new WeatherData(temps);
        weatherData.cleanData(100.0, 147.0);
        weatherData.printData();
        // [99.1, 142.0, 140.02, 150, 181.1, 77.5, 55.1, 45.1]
        // [142.0, 140.02]

        ArrayList<Double> tempsNew = new ArrayList<>() {{
            add(100.5);
            add(98.5);
            add(102.0);
            add(103.9);
            add(87.5);
            add(105.2);
            add(90.3);
            add(94.8);
            add(109.1);
            add(102.1);
            add(107.4);
            add(93.2);
        }};

        WeatherData weatherDataNew = new WeatherData(tempsNew);
        System.out.println(weatherDataNew.longestHeatWave(95.2));
    }
}
