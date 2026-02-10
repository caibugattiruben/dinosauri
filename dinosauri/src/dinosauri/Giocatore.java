/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.util.ArrayList;

/**
 *
 * @author caibugatti.ruben
 */
public class Giocatore {
    ArrayList<String> prese=new ArrayList();
    
    mazzo mazzoInMano;
    mazzo mazzoPrese=new mazzo(prese);
    
    public Giocatore(mazzo m){
        mazzoInMano=m;
    }
    
    @Override
    public String toString(){
        return ""+mazzoInMano;
    }
}
