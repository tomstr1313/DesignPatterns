
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public class Student extends Person{
    private ArrayList<Course> courses = new ArrayList<Course>();
    private String Major;
    
    public Student (String name, int id, String major){
        super (name, id);
        Major = major;
    }
    
    public void addCourse(Course course){
        courses.add(course);
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
    }
    
    public String getMajor(){
        return Major;
    }
    
}
