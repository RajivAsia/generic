/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hm;

import com.leapfrog.hm.controller.ControllerFactory;
import com.leapfrog.hm.controller.MainController;
import com.leapfrog.hm.dao.FoodDAO;
import com.leapfrog.hm.dao.impl.FoodDAOImpl;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         FoodDAO foodDAO=new FoodDAOImpl();
        while(true){
            menu();
        
        MainController controller =ControllerFactory.get(input.nextInt());
        if(controller!=null){
            controller.setInput(input);
            controller.process();
        }
        else{
            System.out.println("invallid enter choice");
        }1
       
            
        }
        }
    public static void menu(){
        System.out.println("1.Enter for Food");
        System.out.println("2.Enter for Customer");
        System.out.println("3.Enter fo OrderList");
        System.out.println("4.Exit");
        System.out.println("Enter any choice[1-4");
    }

}
