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
public class Band implements Serializable {
    //class instance variables
    private String name;
    private String genre;
    private String members;
    private double popularity;

    public Band() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.genre);
        hash = 97 * hash + Objects.hashCode(this.members);
        hash = 97 * hash + Objects.hashCode(this.popularity);
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
        final Band other = (Band) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        if (!Objects.equals(this.members, other.members)) {
            return false;
        }
        if (!Objects.equals(this.popularity, other.popularity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Band{" + "name=" + name + ", genre=" + genre + ", members=" + members + ", popularity=" + popularity + '}';
    }
    
    
    
}
