
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
public class University {
    
    private ArrayList<Person> people = new ArrayList<Person>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    private String name;
    
    public University(String name) {
        this.name = name;
    }
    
    public void addPerson(Person person){
        people.add(person);
    }

    public ArrayList<Person> getPeople() {
        return people;
    }
    
    public void addCourse(Course course){
        courses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
    
    public int getNumberOfPeople(){
        return people.size();
    }
    
    public int getNumberOfCourses(){
        return courses.size();
    }

    
    
}
