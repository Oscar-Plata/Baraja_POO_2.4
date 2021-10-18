/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Baraja del juego, se encarga de crear una coleccion de cartas 
 * que pueden ser obtenidas al azar y ser entregadas a jugadores.
 * 
 * @author Oscar Joel L Plata
 * @version 17/11/21
 */
public class Baraja {
     public ArrayList<Carta> cartas;
    public Baraja(){
        this.cartas=new ArrayList<>(52);
    }

    public void llenarBaraja(){
        for(int i=1;i<=13;i++){
            cartas.add(new Carta(i," R",9829));
            cartas.add(new Carta(i," R",9830));
            cartas.add(new Carta(i," N",9827));
            cartas.add(new Carta(i," N",9824));
        }
    }

    public void mostrarBaraja(){
        System.out.println("cartas de la baraja:\n");
        int c=cartas.size();
        for(int i=0;i<c;i++){
            System.out.println(cartas.get(i).toString()+"\n");
        }
    }

    public void revolver(){
        Collections.shuffle(cartas);
    }

    public Carta darCarta(){
        Carta aux= cartas.get(0);
        cartas.remove(0);
        return aux;
    } 

    public ArrayList<Carta> darCartas(int x){
        ArrayList<Carta> aux= new ArrayList<>(x);
        for(int i=0;i<x;i++){
            aux.add(cartas.get(0));
            cartas.remove(0);
        }
        return aux;
    }
}
