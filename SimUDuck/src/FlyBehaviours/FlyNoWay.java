/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyBehaviours;

/**
 *
 * @author pablo.garcia
 */
public class FlyNoWay implements FlyBehaviour{
    
    @Override
    public void fly(){
        System.out.println("**************************************************");
        System.out.println("I Can't Fly :(");
    }
    
}
