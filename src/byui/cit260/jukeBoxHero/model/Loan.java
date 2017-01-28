/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jukeBoxHero.model;

import java.io.Serializable;
/**
 *
 * @author Karl
 */
public class Loan implements Serializable {
    //instance variables
    private double totalAmount;
    private double rate;
    private double numMonths;

    public Loan() {
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getNumMonths() {
        return numMonths;
    }

    public void setNumMonths(double numMonths) {
        this.numMonths = numMonths;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.totalAmount) ^ (Double.doubleToLongBits(this.totalAmount) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.rate) ^ (Double.doubleToLongBits(this.rate) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.numMonths) ^ (Double.doubleToLongBits(this.numMonths) >>> 32));
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
        final Loan other = (Loan) obj;
        if (Double.doubleToLongBits(this.totalAmount) != Double.doubleToLongBits(other.totalAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rate) != Double.doubleToLongBits(other.rate)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numMonths) != Double.doubleToLongBits(other.numMonths)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Loan{" + "totalAmount=" + totalAmount + ", rate=" + rate + ", numMonths=" + numMonths + '}';
    }
    
    
}
