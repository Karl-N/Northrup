/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jukeBoxHero.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Karl
 */
public class Game implements Serializable {
    //instance variables
    private double highScore;
    private String hallOfFame;

    public Game() {
    }

    public Double getHighScore() {
        return highScore;
    }

    public void setHighScore(Double highScore) {
        this.highScore = highScore;
    }

    public String getHallOfFame() {
        return hallOfFame;
    }

    public void setHallOfFame(String hallOfFame) {
        this.hallOfFame = hallOfFame;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.highScore);
        hash = 11 * hash + Objects.hashCode(this.hallOfFame);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.hallOfFame, other.hallOfFame)) {
            return false;
        }
        if (!Objects.equals(this.highScore, other.highScore)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "highScore=" + highScore + ", hallOfFame=" + hallOfFame + '}';
    }
    
    
    
}
