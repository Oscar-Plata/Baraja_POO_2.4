/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.*;

/**
 * Generar Carta de la baraja
 *
 * @Autor Oscar Lopez Plata
 * @Version: 12/10/2021
 */
public class Carta {

    public int numero;
    public int palo; //Simbolos ASCCII
    public String color;

    /**
     * Constructor de Carta Default
     */
    public Carta() {
        this.numero = 1;
        this.color = "negro";
        this.palo = 9829;
    }

    /**
     * Constructor de Carta por parametros
     *
     * @param numero Numero de la carta
     * @param palo Figura de la carta Usar ASCII CORAZON= 9829, ROMBO=9830,
     * TREBOL=9827, ESPADA=9824
     * @param color Color de la carta
     */
    public Carta(int numero, int palo, String color) {
        this.numero = numero;
        this.palo = palo;
        this.color = color;
    }

    public void setNumero(int num) {
        if (num >= 1 && num <= 13) {
            this.numero = num;
        } else {
            System.out.println("Valor no admitido");
        }
    }
    /**
     * Regresa el Numero de la carta
     * @return  numero de carta
     */
    public int getNumero(){
        return this.numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color.toLowerCase();
        if (color.equals("rojo")) {
            this.color = color;
        } else if (color.equals("negro")) {
            this.color = color;
        } else {
            System.out.println("Solo es color negro o rojo");
        }
    }

    public boolean compararNumero(Carta otra) {
        if (numero == otra.numero) {
            return true;

        }

        return false;
    }

    public boolean esMayorNumero(Carta otra) {
        if (numero > otra.numero) {
            return true;

        }

        return false;
    }

    public boolean esMenorNumero(Carta otra) {
        if (numero < otra.numero) {
            return true;
        }

        return false;
    }

    public void crearCartaNueva() {
        Random alea = new Random();
        int aleatorio;

        aleatorio = alea.nextInt(4) + 1;
        switch (aleatorio) {
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

    public void mostrar() {
        switch (numero) {
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
                System.out.print(numero + " ");
        }

        System.out.println(figura);

    }

    

    //♥♦♣♠
    public void setFigura(String palo) {
        figura = palo;

        switch (palo) {
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

    public String getFigura() {
        return palo;
    }

    @Override
    public String toString() {
        setFigura(palo);
        return numero + "" + palo + " " + color;
    }

}
