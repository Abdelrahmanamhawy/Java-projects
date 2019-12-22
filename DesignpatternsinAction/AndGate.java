/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.util.Observer;
import java.util.Observable;
/**
 *
 * @author Whiterabbit2015
 */
public class AndGate implements Observer{
    Signal inO=new Signal();
    Signal inT=new Signal();
    Signal out=new Signal();
    
    public AndGate(Signal i,Signal t,Signal o){
      this.inO=i;
      this.inT=t;
      this.out=o;
    
    
    }

    @Override
    public void update(Observable o, Object arg) {
       out.setValue(! (out.getValue()));
       System.out.print("Value has changed");
        //To change body of generated methods, choose Tools | Templates.
    }
}
