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
    /**
     * Lista delle carte del mazzo.
     */
    protected ArrayList<carta> carte=new ArrayList();
    /**
     * Costruisce un mazzo a partire da una lista di stringhe
     * che rappresentano i colori delle carte.
     * 
     * @param a lista di stringhe con i colori delle carte
     */
    public mazzo(ArrayList<String> a){
        for(String p:a){
            carta cartaSin=new carta(p);
            carte.add(cartaSin);
        }
    }
    /**
     * Pesca (e rimuove) la prima carta del mazzo.
     * 
     * @return la prima carta del mazzo
     */
    public carta pescaPrimaCarta(){
        carta rit=carte.get(0);
        rimuoviCarta();
        return rit;
    }
    /**
     * Aggiunge una carta al mazzo.
     * 
     * @param c carta da aggiungere
     */
    public void aggiungiCarta(carta c){
        carte.add(c);
    }
    /**
     * Rimuove la prima carta del mazzo, se c'è.
     */
    public void rimuoviCarta(){
        if(carte.size()!=0){
            carte.remove(0);
        }
        
    }
    /**
     * Svuota completamente il mazzo.
     */
    public void pulisci(){
        carte.clear();
    }
    /**
     * Calcola il punteggio totale delle carte presenti nel mazzo.
     * 
     * @return somma dei punti di tutte le carte
     */
    public int contaPunti(){
        int ritorno=0;
        for(carta c:carte){
            ritorno=ritorno+c.punti;
        }
        return ritorno;
    }
    /**
     * Scrive che carte ci sono nel mazzo e chiude il mazzo con un punto.
     * 
     * @return una stringa con le carte del mazzo
     */
    @Override
    public String toString(){
        for(carta a:carte)
        {
            System.out.println(a);
        }
        return (".");
    }
}
