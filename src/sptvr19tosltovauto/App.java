/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19tosltovauto;

import sptvr19tosltovauto.managers.AutoManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sptvr19tosltovauto.entires.Auto;
import sptvr19tosltovauto.entires.User;
import sptvr19tosltovauto.managers.UserManager;

/**
 *
 * @author user
 */
class App {
    private Scanner scanner = new Scanner(System.in);  
    private AutoManager autoManager = new AutoManager();
    private UserManager userManager = new UserManager();
    
//    public List<Person> getListPersons() {
//        return listPersons;
//    }


//    private List<Journal> listJournals = new ArrayList<>();
//    private JournalManager journalManager = new JournalManager();
    

    void run() {

        System.out.println("---Auto Shop---");
        boolean repeat = true;
        
      
         
         do{
         System.out.println("Задачи:");
         System.out.println("0. Выход из приложения");
         System.out.println("1. Добавить машину");
         System.out.println("2. Список машин");
         System.out.println("3. Добавить покупателя");
         System.out.println("4. Список покупателя");
         System.out.println("5. Купить машину");
         System.out.println("Выберите задачу:");
         
        String task = scanner.nextLine();
        switch(task){
            case "0":
                System.out.println("До свидания");
                repeat = false;
                break;
                
            case "1":
                autoManager.createAuto();
                break;
                
            case "2":
                autoManager.getAutos();
                break;
                
            case "3":
                userManager.createUser();
                break;

                
            case "4":
                userManager.getUsers();
                break;
                
            case "5":
                Auto auto = autoManager.choice();
                User user = userManager.login();
                if(auto.getPrice() > user.getMoney()){
                    user.addMoney();
                    System.out.println("Попробуйте ещё раз");
                    break;
                }
                //надо вычесть стоимость машины из денег пользователя
                user.setMoney(user.getMoney()-auto.getPrice());
                userManager.addToList(user);
                break;
             
            default:
                
                break;
        }     
        
         }while(repeat);
    }


    
}
