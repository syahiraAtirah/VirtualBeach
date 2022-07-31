/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package template;

/**
 *
 * @author User
 */
public abstract class TemplateShawarma {
    
    StringBuffer text = new StringBuffer("");
    
    public final String prepare(){
        prepareFilling();
        prepareVege();
        addSauce();
        addVege();
        addFilling();
        roll();
        cook();
        garnish();
        
        return text.toString();
    }

    
    
    abstract void prepareFilling();
    abstract void addFilling();

    private void prepareVege() {
        text.append("\nSlice lettuce, tomato and cucumber.");
    }
    
    private void addSauce(){
        text.append("\nSpread the sauce.");
    }
    
    private void addVege(){
        text.append("\nAdd the vegetables.");
    }
    private void roll(){
        text.append("\nRoll the shawarma");
    }
    
    private void cook(){
        text.append("\nFry the shawarma");
    }
    
    private void garnish(){
        text.append("\nGarnish the plate");
    }
    
   
     
   
}
