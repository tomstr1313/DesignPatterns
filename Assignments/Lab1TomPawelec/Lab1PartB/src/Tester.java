/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //For Circle
        Circle circle = new Circle(3);
//        System.out.println("Circle's Area: " + circle.getArea());
//        System.out.println("Circle's Perimeter: " + circle.getPerimeter());
//        System.out.println("Circle's Shape: " + circle.getShapeType());
        
        //For Triangle
        Triangle triangle = new Triangle(1,2,3,4);
//        System.out.println("\nTriangle's Area: " + triangle.getArea());
//        System.out.println("Triangle's Perimeter: " + triangle.getPerimeter());
//        System.out.println("Triangle's Shape: " + triangle.getShapeType());
        
        System.out.println("\nComparing Circle and Triangle: "+circle.compareTo(triangle));
        
        //For Square
        Square square = new Square(1,2,3);
//        System.out.println("\nSquare's Area: " + square.getArea());
//        System.out.println("Square's Perimeter: " + square.getPerimeter());
//        System.out.println("Square's Shape: " + square.getShapeType());
        
        //For Rectangle
        Rectangle rectangle = new Rectangle(4,7);
//        System.out.println("\nRectangle's Area: " + rectangle.getArea());
//        System.out.println("Rectangle's Perimeter: " + rectangle.getPerimeter());
//        System.out.println("Rectangle's Shape: " + rectangle.getShapeType());
        
        System.out.println("\nComparing Square and Rectangle: "+rectangle.compareTo(square));  
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(triangle.toString());
        
        
    }
    
}
