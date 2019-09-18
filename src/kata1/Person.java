/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Alber
 */
public class Person {
    
    private final String name;
    private final int age;
    private final Date birthay;
    private final static int ms = 1000;
    private final int MS_PER_SECOND = 1000;
    private final int SECON_PER_MINUTE = 60;
    private final int MINUTES_PER_HOUR = 60;
    private final int HOURS_PER_DAY = 24;
    private final double DAYS_PER_YEAR = 365.25;
    
    public Person(String name, int age, Date birthay) {
        this.name = name;
        this.age = age;
        this.birthay = birthay;
    }

    public String getName() {
        return name;
    }

    public Date getBirthay() {
        return birthay;
    }
    
    public int getAge(long ms) {
        return (int)(ms/MS_PER_YEAR());
    }
    
    private double MS_PER_YEAR(){
        return MS_PER_SECOND*
                SECON_PER_MINUTE*
                MINUTES_PER_HOUR*HOURS_PER_DAY*DAYS_PER_YEAR;
    }  
}
