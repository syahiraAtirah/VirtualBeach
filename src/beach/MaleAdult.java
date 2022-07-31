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
public class MaleAdult extends Person{

    private static MaleAdult uniqueInstance;

    private MaleAdult(){

    }

    public static MaleAdult getInstance(){
        if(uniqueInstance == null){
            System.out.println("\nMale Adult created");
            uniqueInstance = new MaleAdult();
        }else{
            System.out.println("\nMale Adult has been created before");
        }

        return uniqueInstance;
    }

}