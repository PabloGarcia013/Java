/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ducks;

import FlyBehaviours.FlyNoWay;
import FlyBehaviours.FlyWithWings;
import QuackBehaviours.Quack;

/**
 *
 * @author v
 */
public class ModelDuck extends Duck{
    
    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }
    
    @Override
    public void display(){
        System.out.println("I'm a Model Duck!");
    }
    
}
