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
public class Assets implements Serializable {
    //instance variables
    private double bankAccount;
    private String vehicle;
    private String guitar;
    private String bass;
    private String drums;
    private String keyboard;

    public Assets() {
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getGuitar() {
        return guitar;
    }

    public void setGuitar(String guitar) {
        this.guitar = guitar;
    }

    public String getBass() {
        return bass;
    }

    public void setBass(String bass) {
        this.bass = bass;
    }

    public String getDrums() {
        return drums;
    }

    public void setDrums(String drums) {
        this.drums = drums;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.bankAccount) ^ (Double.doubleToLongBits(this.bankAccount) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.vehicle);
        hash = 71 * hash + Objects.hashCode(this.guitar);
        hash = 71 * hash + Objects.hashCode(this.bass);
        hash = 71 * hash + Objects.hashCode(this.drums);
        hash = 71 * hash + Objects.hashCode(this.keyboard);
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
        final Assets other = (Assets) obj;
        if (Double.doubleToLongBits(this.bankAccount) != Double.doubleToLongBits(other.bankAccount)) {
            return false;
        }
        if (!Objects.equals(this.vehicle, other.vehicle)) {
            return false;
        }
        if (!Objects.equals(this.guitar, other.guitar)) {
            return false;
        }
        if (!Objects.equals(this.bass, other.bass)) {
            return false;
        }
        if (!Objects.equals(this.drums, other.drums)) {
            return false;
        }
        if (!Objects.equals(this.keyboard, other.keyboard)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Assets{" + "bankAccount=" + bankAccount + ", vehicle=" + vehicle + ", guitar=" + guitar + ", bass=" + bass + ", drums=" + drums + ", keyboard=" + keyboard + '}';
    }
    
    
    
    
}
