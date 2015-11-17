package Ducks;

import FlyBehaviours.FlyBehaviour;
import QuackBehaviours.QuackBehaviour;

public abstract class Duck {
    
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    
    public Duck(){
    }

    public void performFly(){
        flyBehaviour.fly();
    }
    
    public void performQuack(){
        quackBehaviour.quack();
    }
    
    public void setFlyBehavior(FlyBehaviour fb){
        this.flyBehaviour=fb;
    }
    
    public void setQuakBehavior(QuackBehaviour qb){
        this.quackBehaviour=qb;
    }
    
    public abstract void display();
    
    public void swim(){
        System.out.println("All ducks float.");
    }
}

