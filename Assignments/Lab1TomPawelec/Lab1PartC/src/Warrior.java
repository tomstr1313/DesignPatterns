/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public class Warrior{

    public Warrior() {
    }
    
    private int health = 100;
    
    public void addHealth(int amt) { 
        health += amt; 
    }
    
    public void subHealth(int amt) { 
        health -= amt; 
    }
    
    public int getHealth() { 
        return health; 
    }
    
}
