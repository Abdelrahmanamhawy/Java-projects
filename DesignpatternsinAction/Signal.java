/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author Whiterabbit2015
 */
import java.util.Observer;
import java.util.Observable;

public class Signal extends Observable {
    
    boolean value=false;
    public Signal(){
    
    }
    
    public boolean getValue(){
    
     return value;
    }
    public void setValue(boolean f){
     this.value=f;
     setChanged();
     notifyObservers();
    }

    
    
}
