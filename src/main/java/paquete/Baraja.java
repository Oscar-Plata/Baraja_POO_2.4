/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocartas;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ramjam
 */
public class Baraja{
    
    public ArrayList<Carta> cartas, mano;

    /**
     * Constructor for objects of class Baraja
     */
    public Baraja()
    {
        cartas = new ArrayList();
        llenarBaraja();
    }

    public void barajear()
    {
        Random alea = new Random();
        for (int i=0; i<cartas.size(); i++)
        {
            Carta carta1 = cartas.get(i);
            int posicion = alea.nextInt(cartas.size());
            Carta cartaAleatoria = cartas.get(posicion);

            //intercambiar cartas
            cartas.set(i,cartaAleatoria);
            cartas.set(posicion,carta1);

        }
        //entregarCarta();
    }
    
    public Carta entregarCarta()
    {
        Carta temp = new Carta(0, "0", "blanco");
        if(cartas.size()==0){            
            System.out.println("Ya no hay cartas");
        }
        else{
            Carta cartaNueva = cartas.remove(0);
            temp = cartaNueva;
            cartaNueva.mostrar();            
        }
        return temp;
    }

    public ArrayList<Carta> getMano(){
        mano = new ArrayList<>();

        if(cartas.size()>=5){
            for(int i=0;i<5;i++){
                Carta cartaNueva = cartas.remove(0);
                //System.out.println("Carta removita " );
                cartaNueva.mostrar();
                mano.add(cartaNueva);
            }
        }        
        else if(cartas.size()==0){            
            System.out.println("Ya no hay cartas");
        }
        else if(cartas.size()<=4){
            for(int i=0;i<cartas.size();i++){
                Carta cartaNueva = cartas.remove(0);
                //System.out.println("Carta removita " );
                cartaNueva.mostrar();
                mano.add(cartaNueva);
            }
        }
        return mano;
    }

    public void llenarBaraja()
    {
        String figuras = "♥♦♣♠";
        String color="negro";
        for (int i=1; i<=13; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(i<2)
                    color="negro";
                else
                    color="rojo";
                String figura = figuras.substring(j,j+1);
                //System.out.println("La figura es "+figura);

                Carta nuevaCarta = new Carta(i,figura,color);
                //nuevaCarta.mostrar();
                //System.out.println(cartas.size());
                cartas.add(nuevaCarta);
                //System.out.println(cartas.size());
            }
        }

    }

    public void mostrar()
    {
        if(cartas.size()==0){            
            System.out.println("Ya no hay cartas");
        }
        else{
            for (Carta carta : cartas)
            {
                carta.mostrar();
            }
        }
        //El metodo for de arriba es equivalente a este
        /*
        for(int i=0; i<cartas.size(); i++)
        {
        Carta carta = cartas.get(i);
        carta.mostrar();
        }
         */
    }
    
}
