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
public class gestoreGioco {
    /** 
    * Mazzo principale letto dal file 
    */
    mazzo mazzoTavola;
    /** 
     * Mazzo con le carte che si trovano sul tavolo 
     */
    mazzo carteTavola;
    /** 
     * Gestore dei file per leggere il mazzo iniziale 
     */
    fileManager f=new fileManager();
    /** 
     * Primo giocatore 
     */
    Giocatore g1;
     /** 
      * Secondo giocatore 
      */
    Giocatore g2;
    /**
     * Prepara il mazzo principale leggendo le carte dal file
     * e inizializza il mazzo delle carte sul tavolo come vuoto.
     */
    public void preparoMazzoTavola(){
        ArrayList<String> vuoto=new ArrayList();
        mazzoTavola=f.leggo();
        carteTavola=new mazzo(vuoto);
    }
     /**
     * Distribuisce le carte del mazzo principale ai due giocatori
     * in modo alternato (una a testa).
     */
    public void distribuiscoMazzi(){
        int i=0;
        mazzo m1;
        mazzo m2;
        ArrayList<String> c1=new ArrayList();
        ArrayList<String> c2=new ArrayList();
        for(carta c:mazzoTavola.carte){
            String ca=c.toString();
            if(i%2==0){
                c1.add(ca);
            }
            else{
                c2.add(ca);
            }
            i=i+1;
        }
        m1=new mazzo(c1);
        m2=new mazzo(c2);
        
        g1=new Giocatore(m1);
        g2=new Giocatore(m2);
        
          
    }//ok
    /**
     * Fa giocare una carta a ciascun giocatore
     * e le aggiunge al mazzo delle carte sul tavolo.
     * Ritornando un array cn le carte giocate che mi servirà per mettere le immagini
     * 
     * @return un array contenente le due carte giocate
     */
    public carta[] giocaCarta(){
        carta c1=g1.giocaCarta();
        carta c2=g2.giocaCarta();
        
        carteTavola.aggiungiCarta(c1);
        carteTavola.aggiungiCarta(c2);
        
        carta[] ritorno={c1,c2};
        return ritorno;
        
        
    }
    /**
     * Restituisce il punteggio totale di un giocatore.
     * 
     * @param g giocatore di cui calcolare i punti
     * @return punteggio totale del giocatore
     */
    public int contaPunti(Giocatore g){
        return g.contaPunti();
    }
    /**
     * Determina il vincitore della mano in base
     * alle ultime carte giocate dai due giocatori.
     * 
     * Regole:
     * - ROSSO batte VERDE e GIALLO
     * - VERDE batte GIALLO
     * - GIALLO perde contro ROSSO e VERDE
     * - Se le carte sono uguali -> pareggio
     * 
     * @return 1 se vince g1, 2 se vince g2, 0 in caso di pareggio
     */
    public int vincitoreMano(){
        switch (g1.ultimaGiocata.toString()){
            case "ROSSO":
                if(!g2.ultimaGiocata.toString().equals("ROSSO")){
                    return 1;
                }
                else{
                    return 0;
                }
            case "VERDE":
                if(g2.ultimaGiocata.toString().equals("ROSSO")){
                    return 2;
                }
                else if(g2.ultimaGiocata.toString().equals("VERDE")){
                    return 0;
                }
                else{
                    return 1;
                }
                
            case "GIALLO":
                    if(g2.ultimaGiocata.toString().equals("GIALLO")){
                    return 0;
                }
                else{
                    return 2;
                }
        }
        return 0;
    }
}