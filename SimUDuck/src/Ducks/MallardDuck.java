package Ducks;

import FlyBehaviours.FlyWithWings;
import QuackBehaviours.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    @Override
    public void display(){
        System.out.println("Hi!, I'm a Mallard Duck.");
    }
    
}
