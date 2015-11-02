/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ducks;

import java.awt.Color;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author pablo.garcia
 */
public class Duck {
    Color color;
    Integer age;
    String name;
    
    public Duck(Color _color, Integer _age, String _name){
        this.color = _color;
        this.age = _age;
        this.name = _name;
    }
    
    public void setColor(Color _color){
        this.color = _color;
    }
    
    public void setAge(Integer _age){
        this.age = _age;
    }
    
    public void setName(String _name){
        this.name = _name;
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public Integer getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void display(){
        if(this.name.isEmpty())
            System.out.println("Hi, I'm a duck!");
        else
            System.out.println("Hi, I'm a duck and my name is "+this.name+"!");
    }

}

