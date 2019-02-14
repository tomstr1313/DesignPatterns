/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public class Circle extends Shape{
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * (radius*radius);
    }

    @Override
    public double getPerimeter() {
        return ((radius)*2) *3.14;
    }

    @Override
    public String getShapeType() {
        return "Circle";
    }
    
}
