/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ducks;

import FlyBehaviours.FlyBehaviour;
import QuackBehaviours.QuackBehaviour;
import java.awt.Color;

/**
 *
 * @author pablo.garcia
 */
public class Duck {
    Color color;
    Integer age;
    String name;
    
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    
    /**
     * Constructor
     * @param _color
     * @param _age
     * @param _name 
     */
    public Duck(Color _color, Integer _age, String _name){
        this.color = _color;
        this.age = _age;
        this.name = _name;
    }
    
    /** End Getters and Setters **/
    
    /**
     * Set color to the duck
     * @param _color 
     */
    public void setColor(Color _color){
        this.color = _color;
    }
    
    /**
     * Set age to the duck
     * @param _age 
     */
    public void setAge(Integer _age){
        this.age = _age;
    }
    
    /**
     * Set name to the duck
     * @param _name 
     */
    public void setName(String _name){
        this.name = _name;
    }
    
    /**
     * Set fly behaviour to the duck
     * @param _flyBehaviour 
     */
    public void setFlyBehaviour(FlyBehaviour _flyBehaviour){
        this.flyBehaviour = _flyBehaviour;
    }
    
    public void setQuackBehaviour(QuackBehaviour _quackBehaviour){
        this.quackBehaviour = _quackBehaviour;
    }
    
    /**
     * Get color of the duck
     * @return 
     */
    public Color getColor(){
        return this.color;
    }
    
    /**
     * Get age of the duck
     * @return 
     */
    public Integer getAge(){
        return this.age;
    }
    
    /**
     * Get name of the duck
     * @return 
     */
    public String getName(){
        return this.name;
    }
    
    /** End Getters and Setters **/
    
    public void performFly(){
        flyBehaviour.fly();
    }
    
    public void performQuack(){
        quackBehaviour.quack();
    }
    
    public void display(){
        System.out.println("**************************************************");
        if(this.name.isEmpty())
            System.out.println("Hi, I'm a duck!");
        else
            System.out.println("Hi, I'm a duck and my name is "+this.name+"!");
    }

}

