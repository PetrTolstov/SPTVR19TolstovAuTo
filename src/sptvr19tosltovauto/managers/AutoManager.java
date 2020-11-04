/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19tosltovauto.managers;

import sptvr19tosltovauto.entires.Auto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sptvr19tosltovauto.saver.SaveToFile;

/**
 *
 * @author user
 */
public class AutoManager {
    private List<Auto> listAutos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
   
    public AutoManager(){
        SaveToFile saveToFile = new SaveToFile();
        this.listAutos = saveToFile.loadFromFileAuto("listAutos");
        System.out.println("---Успешное подключение массива автомобилей---");
    }
    
    public void createAuto() {
        Boolean repeat = true;
        Auto auto = new Auto();
        
        do{
            System.out.println("---Добавление машины---");

            System.out.println("Марка: ");
            auto.setBrand(scanner.nextLine());

            System.out.println("Модель: ");
            auto.setModel(scanner.nextLine());

            System.out.println("Год: ");
            auto.setYear(scanner.nextLine());

            System.out.println("Цена: ");
            auto.setPrice(scanner.nextInt());
            
            System.out.println("Продолжить?(Y/n) ");
            
            System.out.println(auto.toString());
            
            String sc = scanner.nextLine();
            if("Y".equals(sc) || "".equals(sc)){
                    repeat = false;
                }
        }while(repeat);
        
        addToList(auto);
        
    }

    public void addToList(Auto auto) {
        listAutos.add(auto);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.savingToFileAutos(listAutos, "listAutos");
    }
    
    public void getAutos(){
        for(int i = 0; i < listAutos.size(); i++){
                    System.out.println( i + " " + listAutos.get(i).toString() + "\n");      
             }
    }

    public Auto choice() {
        getAutos();
        System.out.println("Выберите машину"); 
        Auto auto = listAutos.get(scanner.nextInt());
        return auto;
    }
}
