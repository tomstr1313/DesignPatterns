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
        // TODO code application logic here
        
        Warrior warrior = new Warrior();
        System.out.println(warrior.getHealth());
        warrior.addHealth(10);
        System.out.println(warrior.getHealth());
        
        
    }
    
}
