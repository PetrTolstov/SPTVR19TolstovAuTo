/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19tosltovauto.entires;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class User implements Serializable  {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Number;
    private String Password;
    private int Money;
    private Scanner scanner = new Scanner(System.in);


    @Override
    public String toString() {
        return "FirstName: " + FirstName + ", \nLastName: " + LastName + ", \nEmail: " + Email + ", \nNumber: " + Number;
    }

    
    public int getMoney() {
        return Money;
    }

    public void setMoney(int Money) {
        this.Money = Money;
    }
    
    public void addMoney() {
        System.out.println("Какую сумму вы хотите добавить? ");
        this.setMoney(scanner.nextInt() + this.getMoney());
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.FirstName);
        hash = 79 * hash + Objects.hashCode(this.LastName);
        hash = 79 * hash + Objects.hashCode(this.Email);
        hash = 79 * hash + Objects.hashCode(this.Number);
        hash = 79 * hash + Objects.hashCode(this.Password);
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
        final User other = (User) obj;
        if (!Objects.equals(this.FirstName, other.FirstName)) {
            return false;
        }
        if (!Objects.equals(this.LastName, other.LastName)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.Number, other.Number)) {
            return false;
        }
        if (!Objects.equals(this.Password, other.Password)) {
            return false;
        }
        return true;
    }

    
    
    
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getNumber() {
        return Number;
    }

    public String getPassword() {
        return Password;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    
}
