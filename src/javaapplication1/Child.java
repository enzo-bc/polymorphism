/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author enzo
 */
public class Child extends Parent {

    public int number;
    public String text;
    public String child;
    
    public String toString() {
        return text + " - " + number + " - " + child;
    }
}
