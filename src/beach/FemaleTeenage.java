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
public class FemaleTeenage extends Person{

    private static FemaleTeenage uniqueInstance;

    private FemaleTeenage(){

    }

    public static FemaleTeenage getInstance(){
        if(uniqueInstance == null){
            System.out.println("\nFemale Teenage created");
            uniqueInstance = new FemaleTeenage();
        }else{
            System.out.println("\nFemale Teenage has been created before");
        }

        return uniqueInstance;
    }
    
}
