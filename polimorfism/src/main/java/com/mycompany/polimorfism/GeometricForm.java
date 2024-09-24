/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfism;

/**
 *
 * @author Ricardo
 */
public class GeometricForm {
    
    protected double width;
    protected double heigth;
    protected int sizes;
    protected double base;

    public GeometricForm(double heigth, int sizes) {
        this.heigth = heigth;
        this.sizes = sizes;
    }
    
    
     
    public double getArea(){
        return 0.0;
    }

    

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the heigth
     */
    public double getHeigth() {
        return heigth;
    }

    /**
     * @param heigth the heigth to set
     */
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    
    
    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @param sizes the sizes to set
     */
    public void setSizes(int sizes) {
        this.sizes = sizes;
    }
    
    
    
}
