/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructor alan = new Instructor(111,"Alan");
        Instructor john = new Instructor(112,"John");
        Instructor jane = new Instructor(113,"Jane");
        
        Student sara = new Student("Sara",5001,"AI");
        Student sam = new Student("Sam",5002,"ENG");
        Student helen = new Student("Helen",5003,"BIO");
        
        Course dpst = new Course(5424,"Design Pattern");
        Course bigdata = new Course(5554,"Big Data");
        
        sara.addCourse(dpst);
        sam.addCourse(bigdata);
        
        University york = new University("York University");
        york.addPerson(sara);
        york.addPerson(alan);
        
        System.out.println("Number of people "+york.getNumberOfPeople());
        
        
    }
    
}
