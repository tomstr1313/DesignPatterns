/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tompa
 */
public interface IShooter {
    void incHealth(); // health++
    void decHealth(); // health--
    int getHealth();
}
