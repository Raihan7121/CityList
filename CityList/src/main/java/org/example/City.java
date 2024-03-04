package org.example;

import java.util.Comparator;

/**
 * Represents a city with its name and province.
 */
public class City {
    private String city;
    private String province;

    /**
     * This is constructor to assign initial value
     * 
     * @param city     This is the first parameter
     * @param province This is the second parameter
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This is a function to know the current city name
     * 
     * @return returns the name of city of current object
     */
    String getCityName() {
        return this.city;
    }

    /**
     * This is a function to know province of the current city
     * 
     * @return returns the province of city of current object
     */
    String getProvinceName() {
        return this.province;
    }

}

/**
 * This is a class containing the function to compare the citylist
 */

class sortByCity implements Comparator<City> {
    /**
     * Here the comparator function is overrided
     * @param a first parameter
     * @param b second parameter
     * @return returns 1 if the first parameter a greater than b else returns 0
     * 
     */
    public int compare(City a, City b) {
        return a.getCityName().compareTo(b.getCityName());
    }
}
