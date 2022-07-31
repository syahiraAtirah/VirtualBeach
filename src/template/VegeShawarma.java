/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template;

/**
 *
 * @author User
 */
public class VegeShawarma extends TemplateShawarma{
    StringBuffer text = super.text;
    @Override
    void prepareFilling() {
        text.append("Fry the potato fillings.");
    }

    @Override
    void addFilling() {
       text.append("\nAdding the potato fillings.");
    }

    
    
}
