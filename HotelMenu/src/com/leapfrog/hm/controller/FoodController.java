/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hm.controller;

import com.leapfrog.hm.dao.FoodDAO;
import com.leapfrog.hm.dao.impl.FoodDAOImpl;
import com.leapfrog.hm.model.Food;

/**
 *
 * @author lenovo
 */
public class FoodController extends MainController {
    FoodDAO foodDAO=new FoodDAOImpl();

    @Override
    public void add() {
        Food food=new Food();
        System.out.println("Enter Food Id");
        food.setFoodid(input.nextInt());
        System.out.println("Enter Food Name");
        food.setFoodName(input.next());
        System.out.println("Enter Food Description");
       food.setDescription(input.next());
       
    }

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showAll() {
       for(Food t:foodDAO.getAll()){
           System.out.println("t");
       }
    }

    @Override
    public void getById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void process() {
        menu();
        switch(input.nextInt()){
            case 1:
                add();
                break;
            case 4 :
                showAll();
            case 2:
                delete();
                break;
        }

    }

    private void menu(){
        System.out.println("1.Add food");
        System.out.println("2.Edit  food ");
        System.out.println("3.Delete food");
        System.out.println("4.show all");
        System.out.println("5.getBy Id");
        System.out.println("6.exit");
        System.out.println("Enter Your choice [1-6]");

    }

}
