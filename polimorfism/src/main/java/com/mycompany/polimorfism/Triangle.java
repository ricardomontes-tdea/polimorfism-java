/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfism;

/**
 *
 * @author Ricardo
 */
public class Triangle extends GeometricForm{
    
    public Triangle(double heigth, int sizes, double base) {
        super(heigth, sizes);
        
        this.base = base;
    }
    
    
    @Override
    public double getArea(){
        double area = (this.base * this.heigth) / 2;
        
        return area;
    }
    
}
