/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author User
 */
public class BeachFacade {
    
    Music music;
    LightHouse lights;
    Sky sky;

    public BeachFacade(Music music, LightHouse lights, Sky sky) {
        this.music = music;
        this.lights = lights;
        this.sky = sky;
    }
    
    public void changeToDay(){
        System.out.println("Day Time");
        music.playBirdSound();
        lights.lightOff();
        sky.lightSky();
    }
    
    public void changeToNight(){
        System.out.println("Night Time");
        music.playBreezeSound();
        lights.lightOn();
        sky.darkSky();
    }
    
    
    
    
}

