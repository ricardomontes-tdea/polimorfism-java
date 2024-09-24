/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfism;

/**
 *
 * @author Ricardo
 */
public class Rectangle extends GeometricForm{
    
    public Rectangle(double heigth, int sizes, double width) {
        super(heigth, sizes);
        
        this.width = width;
    }
    
    @Override
    public double getArea(){
        double area = this.heigth * this.width;
        
        return area;
    }
    
}
