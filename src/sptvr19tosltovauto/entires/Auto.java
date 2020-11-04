/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19tosltovauto.entires;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Auto implements Serializable {
    private String Brand;
    private String Model;
    private int Price;
    private String Year;

    @Override
    public String toString() {
        return "Brand: " + Brand + ", \nModel: " + Model + ", \nPrice: " + Price + ", \nYear: " + Year;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.Brand);
        hash = 47 * hash + Objects.hashCode(this.Model);
        hash = 47 * hash + Objects.hashCode(this.Price);
        hash = 47 * hash + Objects.hashCode(this.Year);
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
        final Auto other = (Auto) obj;
        if (!Objects.equals(this.Brand, other.Brand)) {
            return false;
        }
        if (!Objects.equals(this.Model, other.Model)) {
            return false;
        }
        if (!Objects.equals(this.Price, other.Price)) {
            return false;
        }
        if (!Objects.equals(this.Year, other.Year)) {
            return false;
        }
        return true;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getPrice() {
        return Price;
    }

    public String getYear() {
        return Year;
    }
    
    

}
