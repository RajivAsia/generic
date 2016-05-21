/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hm.controller;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public abstract class MainController {
     protected Scanner input;
     public void setInput(Scanner input){
     this.input=input;
     }
    public abstract void process();
    public abstract void add();
    public abstract void edit();
    public abstract void delete();
    public abstract void showAll();
    public abstract void getById();
    public abstract void exit();
    
    
}
