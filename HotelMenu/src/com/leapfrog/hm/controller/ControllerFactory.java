/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hm.controller;

/**
 *
 * @author lenovo
 */
public class ControllerFactory {
    public static MainController get(int param){
    if(param==1){
    return new FoodController();
    
    }
    else if(param==2){
        return new CustomerController();
        
    }
    else if (param==3){
        return new OrderListController();
    }
    else if(param==4){
        return new ExitController();
    }
    else{
            return null;
}
    }
}

