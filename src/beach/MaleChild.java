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
public class MaleChild extends Person{

    private static MaleChild uniqueInstance;

    private MaleChild(){

    }

    public static MaleChild getInstance(){
        if(uniqueInstance == null){
            System.out.println("\nMale Child created");
            uniqueInstance = new MaleChild();
        }else{
            System.out.println("\nMale Child has been created before");
        }

        return uniqueInstance;
    }
    
}