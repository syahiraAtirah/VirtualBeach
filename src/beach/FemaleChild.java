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
public class FemaleChild extends Person{

    private static FemaleChild uniqueInstance;

    private FemaleChild(){

    }

    public static FemaleChild getInstance(){
        if(uniqueInstance == null){
           System.out.println("\nFemale Child created");
            uniqueInstance = new FemaleChild();
        }else{
            System.out.println("\nFemale Child has been created before");
        }

        return uniqueInstance;
    }

}
