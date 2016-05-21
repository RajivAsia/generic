/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hm.dao;

import java.util.List;

/**
 *
 * @author lenovo
 */
public interface GenericDAO<T> {
    int insert(T t);
    int delete(int id);
    int update(T t);
    T getById(int id);
    List<T> getAll();
    
    
}
