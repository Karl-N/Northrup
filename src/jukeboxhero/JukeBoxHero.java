/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukeboxhero;

import byui.cit260.jukeBoxHero.model.Player;
import byui.cit260.jukeBoxHero.model.Band;
import byui.cit260.jukeBoxHero.model.Game;
import byui.cit260.jukeBoxHero.model.Loan;
import byui.cit260.jukeBoxHero.model.Map;
import byui.cit260.jukeBoxHero.model.Assets;
/**
 *
 * @author Karl
 */
public class JukeBoxHero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //testing classes
        Player playerOne = new Player();
      
      playerOne.setName("Eddie Money");
      String playerInfo = playerOne.toString();
      System.out.println(playerInfo);
      
      Band awesome = new Band();
      awesome.setName("Stack the Elephants");
      awesome.setGenre("Acid Rock");
      awesome.setMembers("Joe Cool, Sakimoto, Mr. Beans, Thunder, Moosejaw");
      awesome.setPopularity(12.00);
      String bandInfo = awesome.toString();
      System.out.println(bandInfo);
      
      Game gameOne = new Game();
      gameOne.setHallOfFame("Led Zepplin, Rush, Yes, The Who");
      gameOne.setHighScore(9700.0);
      String gameInfo = gameOne.toString();
      System.out.println(gameInfo);
      
      Loan loanOne = new Loan();
      loanOne.setNumMonths(3.0);
      loanOne.setRate(0.03);
      loanOne.setTotalAmount(10000.0);
      String loanInfo = loanOne.toString();
      System.out.println(loanInfo);
      
      Map mapOne = new Map();
      mapOne.setCity("Boston");
      String city = mapOne.toString();
      System.out.println(city);
      
      Assets bandStuff = new Assets();
      bandStuff.setBankAccount(5.35);
      bandStuff.setBass("Galaxy Bass");
      bandStuff.setDrums("Tama Standard Kit");
      bandStuff.setGuitar("First real six string");
      bandStuff.setKeyboard("Korg 100");
      bandStuff.setVehicle("'98 Dodge Van");
      String bandAssets = bandStuff.toString();
      System.out.println(bandAssets);
    }
    
}
