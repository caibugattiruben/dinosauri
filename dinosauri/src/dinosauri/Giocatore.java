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
    /**
     * Lista che mi serve a creare un mazzo.
     */
    ArrayList<String> prese=new ArrayList();
    /** 
     * Mazzo delle carte attualmente in mano al giocatore 
     */
    protected mazzo mazzoInMano;
    /** 
     * Mazzo contenente le carte vinte dal giocatore 
     */
    mazzo mazzoPrese=new mazzo(prese);
    /** 
     * Ultima carta giocata dal giocatore 
     */
    protected carta ultimaGiocata;
    /**
     * Costruisce un giocatore con un mazzo iniziale.
     * 
     * @param m mazzo assegnato al giocatore
     */
    public Giocatore(mazzo m){
        mazzoInMano=m;
    }
    /**
     * Permette al giocatore di giocare la prima carta del mazzo.
     * 
     * La carta viene rimossa dal mazzo in mano
     * e salvata come ultimaGiocata.
     * 
     * @return la carta giocata
     */
    public carta giocaCarta(){
        this.ultimaGiocata=mazzoInMano.pescaPrimaCarta();
        return ultimaGiocata;
    }
    /**
     * Calcola il punteggio totale delle carte vinte.
     * 
     * @return punteggio totale del giocatore
     */
    public int contaPunti(){
        return mazzoPrese.contaPunti();
    }
    /**
     * Aggiunge una lista di carte alle prese del giocatore.
     * 
     * @param c lista di carte vinte
     */
    public void aggiungiCartaPrese(ArrayList<carta> c){
        for(carta a:c){
            mazzoPrese.aggiungiCarta(a);
        }
    }
    /**
     * Restituisce il numero di carte rimaste nel mazzo in mano.
     * 
     * @return numero di carte rimanenti
     */
    public int getSize(){
        return mazzoInMano.carte.size();
    }
     /**
     * Restituisce una rappresentazione testuale
     * del mazzo in mano del giocatore.
     * 
     * @return stringa rappresentativa del mazzo in mano
     */
    @Override
    public String toString(){
        return ""+mazzoInMano;
    }
}
