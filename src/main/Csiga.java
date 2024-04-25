/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Random;


public class Csiga {
    
    static Random rnd = new Random();
    private int lep;
    
    public String karakter(){
       String csiga = "🐌";
       return csiga;
    }
    
    public String karakterSzin(){
        
    }
    
    public int getLepes(){
        return lep;
    }
    
    public void lepes(){
        lep = Csiga.rnd.nextInt()+1;
    }
    
    
    
}
