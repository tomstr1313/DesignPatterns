/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public class Square extends Rectangle{
    private double size;

    public Square(double size, double height, double width) {
        super(height, width);
        this.size = size;
    }
    @Override
    public double getArea(){
        return (size*size);
    }
    
    public double getPerimeter(){
        return (size+size)*2;
    }
    
    public String getShapeType() {
        return "Square";
    }
}
