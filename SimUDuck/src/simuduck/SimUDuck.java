/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

import Ducks.Duck;
import java.awt.Color;

/**
 *
 * @author pablo.garcia
 */
public class SimUDuck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Duck d = new Duck(Color.YELLOW,2,"Pablo");
       d.display();
    }
    
}
