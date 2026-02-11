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
public class mazzo {
    
    ArrayList<carta> carte=new ArrayList();
    public mazzo(ArrayList<String> a){
        for(String p:a){
            carta cartaSin=new carta(p);
            carte.add(cartaSin);
        }
    }
    
    public carta pescaPrimaCarta(){
        carta rit=carte.get(0);
        rimuoviCarta(carte.get(0));
        
        return rit;
    }
    public void aggiungiCarta(carta c){
        carte.add(c);
    }
    public void rimuoviCarta(carta c){
        carte.remove(c);
    }
    public int contaPunti(){
        return 0;
    }
    
    @Override
    public String toString(){
        for(carta a:carte)
        {
            System.out.println(a);}
        return "siamo su mazzo, queste sono le carte";
    }
}
