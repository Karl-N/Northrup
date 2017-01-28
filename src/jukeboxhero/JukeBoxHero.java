/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukeboxhero;

import byui.cit260.jukeBoxHero.model.Player;

/**
 *
 * @author Karl
 */
public class JukeBoxHero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Player playerOne = new Player();
      
      playerOne.setName("Eddie Money");
      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
    }
    
}
