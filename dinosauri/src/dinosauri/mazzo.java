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
    
    protected ArrayList<carta> carte=new ArrayList();
    public mazzo(ArrayList<String> a){
        for(String p:a){
            carta cartaSin=new carta(p);
            carte.add(cartaSin);
        }
    }
    
    public carta pescaPrimaCarta(){
        carta rit=carte.get(0);
        rimuoviCarta();
        
        return rit;
    }
    public void aggiungiCarta(carta c){
        carte.add(c);
    }
    public void rimuoviCarta(){
        if(carte.size()!=0){
            carte.remove(0);
        }
        
    }
    public void pulisci(){
        carte.clear();
    }
    public int contaPunti(){
        int ritorno=0;
        for(carta c:carte){
            switch (c.toString()){
                case "ROSSO":
                    ritorno=ritorno+5;
                    break;
                case "VERDE":
                    ritorno=ritorno+3;
                    break;
                case "GIALLO":
                    ritorno=ritorno+1;
                    break;
            }
        }
        return ritorno;
    }
    
    @Override
    public String toString(){
        for(carta a:carte)
        {
            System.out.println(a);}
        return (".");
    }
}
