/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

/**
 *
 * @author Leslee
 */
public class King implements CharacterWeapon{
   private String exacalibur;
   private String player;
   
   @Override
    public String useWeapon(){
        System.out.println("You are using exacalibur!");
        return exacalibur;
    }
    
}
