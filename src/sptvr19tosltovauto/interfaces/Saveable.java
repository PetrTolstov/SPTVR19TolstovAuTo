/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19tosltovauto.interfaces;

import java.util.List;
import sptvr19tosltovauto.entires.Auto;
import sptvr19tosltovauto.entires.User;

/**
 *
 * @author user
 */
public interface Saveable {
    public void savingToFileAutos(List<Auto> listAutos, String fileName);
    public List loadFromFileAuto(String fileName);
    public void savingToFileUsers(List<User> listUsers, String fileName)  ;
    public List loadFromFileUsers(String fileName);      
        
    
}
