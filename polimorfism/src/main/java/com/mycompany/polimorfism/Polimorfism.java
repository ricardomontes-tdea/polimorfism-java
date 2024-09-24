/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfism;

import java.util.*;

/**
 *
 * @author Ricardo
 */
public class Polimorfism {

    public static void main(String[] args) {
        List<GeometricForm> forms = Arrays.asList(
            new Square(10, 4, 10),
            new Rectangle(3, 4, 8),
            new Triangle(10, 3, 15)
        );
        
        for(GeometricForm form : forms){
            System.out.println(form.getArea());
        }
                
    }
}
