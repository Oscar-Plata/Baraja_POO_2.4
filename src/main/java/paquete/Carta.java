/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocartas;

import java.util.*;

/**
 *
 * @author ramjam
 */
public class Carta {
    
    public int numero;
    public String figura;
    public String color;

    /**
     * Constructor for objects of class Carta
     */
    
    
    public Carta() {
        this.numero = 1;
        this.color = "negro";
        this.figura = "corazon";
    }
    
    public Carta(int numero, String figura, String color)
    {
        this.numero = numero;
        this.figura = figura;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equals("rojo")) 
            this.color = color;
        else if(color.equals("negro"))
                this.color = color;
        else
            System.out.println("Solo es color negro o rojo");
    }
    
    public boolean compararNumero(Carta otra)
    {
        if(numero == otra.numero)
        {
            return true;

        }

        return false;
    }

    public boolean esMayorNumero(Carta otra)
    {
        if(numero > otra.numero)
        {
            return true;

        }

        return false;
    }

    public boolean esMenorNumero(Carta otra)
    {
        if(numero < otra.numero)
        {
            return true;           
        }

        return false;
    }

    public void crearCartaNueva()
    {
        Random alea = new Random();
        int aleatorio;

        aleatorio = alea.nextInt(4)+1;
        switch(aleatorio){
            case 1:
            figura = "corazon";
            break;
            case 2:
            figura = "diamante";
            break;
            case 3:
            figura = "espada";
            break;
            case 4:
            figura = "trebol";
            break;

        }

    }

    public void mostrar()
    {
        switch(numero)
        {
            case 1:
            System.out.print("A ");
            break;
            case 11:
            System.out.print("J ");
            break;
            case 12:
            System.out.print("Q ");
            break;
            case 13:
            System.out.print("K ");
            break;
            default:
            System.out.print(numero+" ");
        }

        System.out.println(figura);

    }

    public void setNumero(int num)
    {
        numero = num;

        if(numero >= 1 && numero <= 13)
        {
            numero = num;
        }
        else
        {
            System.out.println("Valor no admitido");
        }
    }

    public int getNumero()
    {
        return numero;
    }

    //♥♦♣♠

    public void setFigura(String palo)
    {
        figura = palo;

        switch(palo)
        {
            case "corazon":
            figura = "♥";
            break;
            case "trabol":
            figura = "♣";
            break;
            case "diamante":
            figura = "♦";
            break;
            case "espada":
            figura = "♠";
            break;
        }
    }

    public String getFigura()
    {
        return figura;
    }

    @Override
    public String toString(){
        setFigura(figura);
        return numero+""+figura+" "+color;
    }
    
}
