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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.number = 1;
        parent.text = "parent";
        System.out.println(parent);
        
        Child child = new Child();
        child.number = 1;
        child.text = "child";
        child.child = "child_text";
        System.out.println(child);
        
        Parent global_variable = child;
        
        System.out.println(global_variable);
        
        
    }

}
