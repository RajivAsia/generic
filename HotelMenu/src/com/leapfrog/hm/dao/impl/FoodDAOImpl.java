/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hm.dao.impl;

import com.leapfrog.hm.dao.FoodDAO;
import com.leapfrog.hm.model.Food;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class FoodDAOImpl implements FoodDAO{
private List<Food>foodList=new ArrayList<>();
    @Override
    public int insert(Food t) {
        foodList.add(t);
        return 1;
    }

    @Override
    public int delete(int id) {
      Food t= getById(id);
      if(t!=null){
          foodList.remove(t);
      return 1;
    }
    return 0;
    }

    @Override
    public int update(Food t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Food getById(int id) {
       for(Food t :foodList){
           if(t.getFoodid()==id){
               return t;
           }
       }
       return null;
    }

    @Override
    public List<Food> getAll() {
       return foodList; 
    }
    
}
