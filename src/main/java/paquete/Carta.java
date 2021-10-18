/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;


/**
 * Carta de una baraja, objeto que simula un naipe o carta
 * de un juego de baraja.
 * 
 * @author Oscar Joel Lopez Plara 
 * @version 17/10/21
 */
public class Carta
{
    private int numero;
    private String color;
    private int palo; //Simbolos ASCCI

     /**
     * Constructor de Carta Default
     */
    public Carta() {
    }

    /**
     * Constructor de Carta por parametros
     *
     * @param valor Numero de la carta
     * @param palo Figura de la carta Usar ASCII CORAZON= 9829, ROMBO=9830,
     * TREBOL=9827, ESPADA=9824
     * @param color Color de la carta
     */
    public Carta(int valor,String color,int palo){
        if((valor>=1)&&(valor<=13))        {
            this.numero=valor;
            this.numero=valor;
            this.color=color;
            this.palo=palo;
        }
            else System.out.println("error valor no valido");
    }

    public void setNumero(int x){
        if((x>=1)&&(x<=13))        this.numero=x;
            else System.out.println("error valor no valido");
    }
//Figura de la carta Usar ASCII CORAZON= 9829, ROMBO=9830,
    // * TREBOL=9827, ESPADA=9824
    public void setPalo(int p){
        this.palo=p;
    }

    public void setColor(String color){
        this.color=color;
    }

    public int getNumero(){
        return numero;
    }

    public int getPalo(){
        return palo;
    }

    public String getColor(){
        return color;
    }
    
    @Override
    public String toString(){
        String valor;
        //System.out.println(palo);
        switch(numero){
            case 1: valor="A";
                break;
            case 11: valor="J";
                break;
            case 12: valor="Q";
                break;
            case 13: valor="K";
                break;
            default: valor=numero+"";
                break;            
        }
        return "["+valor+" "+(char)palo+color+"]";
    }
    public void mostrartoString(){
        System.out.println(toString());
    }
    public void getASCCIPalos(){
        char cora='♥';
        int codeCora=(int)cora;
        System.out.println("\n♥"+codeCora);
        char rombo='♦';
        int codeRombo=(int)rombo;
        System.out.println("\n♦"+codeRombo);
        char trebol='♣';
        int codeTrebol=(int)trebol;
        System.out.println("\n♣"+codeTrebol);
        char espada='♠';
        int codeEspada=(int)espada;
        System.out.println("\n♠"+codeEspada);
    }
}

