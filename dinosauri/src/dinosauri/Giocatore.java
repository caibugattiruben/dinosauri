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
    
    protected mazzo mazzoInMano;
    mazzo mazzoPrese=new mazzo(prese);
    protected carta ultimaGiocata;
    
    public Giocatore(mazzo m){
        mazzoInMano=m;
    }
    
    public carta giocaCarta(){
        ultimaGiocata=mazzoInMano.pescaPrimaCarta();
        mazzoInMano.rimuoviCarta();
        return ultimaGiocata;
    }
    public int contaPunti(){
        return mazzoPrese.contaPunti();
    }
    
    public void aggiungiCartaPrese(ArrayList<carta> c){
        for(carta a:c){
            mazzoPrese.aggiungiCarta(a);
        }
    }
    
    public int getSize(){
        int ritorno=0;
        for(carta c:mazzoInMano.carte){
            ritorno=ritorno+1;
        }
        return ritorno;
    }
    
    @Override
    public String toString(){
        return ""+mazzoInMano;
    }
}
