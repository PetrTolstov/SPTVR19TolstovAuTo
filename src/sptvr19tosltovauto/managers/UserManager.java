/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19tosltovauto.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import sptvr19tosltovauto.entires.Auto;
import sptvr19tosltovauto.entires.User;
import sptvr19tosltovauto.saver.SaveToFile;

/**
 *
 * @author user
 */
public class UserManager {
    private List<User> listUsers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
   
    public UserManager(){
        SaveToFile saveToFile = new SaveToFile();
        this.listUsers = saveToFile.loadFromFileUsers("listUsers");
        System.out.println("---Успешное подключение массива пользователей---");
    }
    
    public void createUser() {
        Boolean repeat = true;
        User user = new User();
        
        do{        
            System.out.println("---Добавление пользователя---");
            
            System.out.println("Имя: ");
            user.setFirstName(scanner.nextLine());

            System.out.println("Фамилия: ");
            user.setLastName(scanner.nextLine());

            System.out.println("Почта: ");
            user.setEmail(scanner.nextLine());

            System.out.println("Номер: ");
            user.setNumber(scanner.nextLine());
            
            System.out.println("Пароль: ");
            String pass = scanner.nextLine();
            
           user.setMoney(0);
            
            
            System.out.println("Введите пароль ещё раз: ");
            
            
            if(pass.equals(scanner.nextLine())){
                System.out.println("Продолжить?(Y/n) ");
                System.out.println(user.toString());
                String sc = scanner.nextLine();
                if("Y".equals(sc) || "".equals(sc)){
                    user.setPassword(pass);
                    repeat = false;
                }
            } else{
                System.out.println("Попробуйте ещё раз: ");
            }
        }while (repeat);
        
        user.addMoney();
        addToList(user);
        
    }

    public void addToList(User user) {
        if (listUsers.indexOf(user)!= -1){
            listUsers.add(user);
        }else{
            listUsers.set(listUsers.indexOf(user), user); 
        }
        
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.savingToFileUsers(listUsers, "listUsers");
    }
    
    public void getUsers(){
        for(int i = 0; i < listUsers.size(); i++){
                    System.out.println( i + " " + listUsers.get(i).toString() + "\n");      
             }
    }

    public User login() {
        getUsers();
        System.out.println("Выберите пользователя"); 
        User user = listUsers.get(scanner.nextInt());
        return user;
    }

    
}
