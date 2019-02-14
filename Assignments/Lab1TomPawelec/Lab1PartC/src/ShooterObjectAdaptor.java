/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public class ShooterObjectAdaptor implements IShooter{

    Warrior tom = new Warrior();
    @Override
    public void incHealth() {
        tom.addHealth(1);
    }

    @Override
    public void decHealth() {
        tom.subHealth(1);
    }

    @Override
    public int getHealth() {
        return tom.getHealth();
    }
    
}
