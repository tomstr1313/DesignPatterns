/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
class Course {
    
    private String name;
    private int number;

    public Course(int number, String name) {
        this.name = name;
        this.number = number;
    }
    
    

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    
}
