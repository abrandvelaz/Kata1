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
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Pepe",new Date(49,8,24));
        System.out.println(person.getName() + " tiene: " + person.getAge()+ " años");
        
        // TODO code application logic here
    }
    
}
