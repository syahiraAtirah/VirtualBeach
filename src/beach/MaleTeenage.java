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
public class MaleTeenage extends Person{

    private static MaleTeenage uniqueInstance;

    private MaleTeenage(){

    }

    public static MaleTeenage getInstance(){
        if(uniqueInstance == null){
             System.out.println("\nMale Teenage created");
            uniqueInstance = new MaleTeenage();
        }else{
            System.out.println("\nMale Teenage has been created before");
        }

        return uniqueInstance;
    }
    
}