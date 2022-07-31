/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beach;

/**
 *
 * @author user
 */
public class FemaleAdult extends Person{

    private static FemaleAdult uniqueInstance;

    private FemaleAdult(){

    }

    public static FemaleAdult getInstance(){
        if(uniqueInstance == null){
           System.out.println("\nFemale Adult created");
            uniqueInstance = new FemaleAdult();
        }else{
            System.out.println("\nFemale Adult has been created before");
        }

        return uniqueInstance;
    }
    
}