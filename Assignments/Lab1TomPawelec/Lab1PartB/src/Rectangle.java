/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public class Rectangle extends Quad{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double getArea() {
        return (height*width);
    }

    @Override
    public double getPerimeter() {
        return (height + width)*2;
    }

    @Override
    public String getShapeType() {
        return "Rectangle";
    }
    
    
}
