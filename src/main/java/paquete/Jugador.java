/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.ArrayList;
/**
 * Jugador, clase encargada de los individuos jugadores de  
 * la baraja
 * 
 * @author Oscar JL Plata
 * @version (17/10/21
 */
public class Jugador
{
    private ArrayList<Carta> mano;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador()
    {
        this.mano= new ArrayList<>(5);
    }

    public void recibirCartas(ArrayList<Carta> recibido){
        this.mano=recibido;
    }
    
    public void agregarCarta(Carta c){
        mano.add(c);
    }

    public void mostrarCartas(){
        int c=mano.size();
        for(int i=0;i<c;i++){
            System.out.println(mano.get(i).toString()+"\n");
        }

    }
    public int sumarCartas(){
        int total=0;
        int c=mano.size();
        for(int i=0;i<c;i++){
           total+=mano.get(i).getNumero();
        }
        System.out.println("Total de cartas: "+total);
        return total;
    }
   public Carta mostrarAlta(){
        Carta alta=new Carta();
        int c=mano.size();
        for(int i=0;i<c;i++){
            if(mano.get(i).getNumero()>alta.getNumero()){
                alta=mano.get(i);
            }
        }
        System.out.println("Carta mas alta del jugador: \n"+alta+"\n");
        return alta;
    }

    public void mismoPalo(){
        int palo=mano.get(0).getPalo();
        int iguales=0;
        int c=mano.size();
        for(int i=0;i<c;i++){
            if(mano.get(0).getPalo()==palo){
                iguales++;
            }
        }
        if(palo==c) System.out.println("Todas las cartas tuene el mismo palo\n");
        else System.out.println("Las cartas tienen palos distintos\n");

    }

    
    @Override
    public String toString(){
       String inf="Cantidad Cartas: "+mano.size()+" ";
        for(int i=0;i<mano.size();i++){
            inf=inf.concat(mano.get(i).toString()+" ");
        }
        return inf;
    }
}
