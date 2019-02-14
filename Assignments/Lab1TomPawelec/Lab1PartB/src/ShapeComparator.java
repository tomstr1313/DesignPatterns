
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public class ShapeComparator implements Comparator <Shape>{
    public int compare(Shape s1, Shape s2){
        return s1.compareTo(s2);
    }
    public boolean equals(Shape s1, Shape s2){
        return s1.compareTo(s2)==0?true:false;
    }
}
