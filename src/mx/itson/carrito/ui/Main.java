/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import mx.itson.carrito.entidades.Carro;

/**
 *
 * @author dag13
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la distancia recorrida por el carro.\nDistancia: ");
        double distancia = sc.nextDouble();
        
        System.out.print("Ingrese la velocidad a la que viaja el carro.\nVelocidad: ");
        double velocidad = sc.nextDouble();
        
        //Generamos una nueva instancia de la clase carro:
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setColor("Negro");
        bmw.setAnio(2021);
        bmw.setKilomatraje(10000);


        
        //Se invoca el método dentro de la clase Carro:
        double tiempo = bmw.calcularTiempoRecorrido(distancia, velocidad);
        
        System.out.println("El tiempo que le tomará al carro " + bmw.getMarca()
                + " del modelo " + bmw.getAnio() + " y de color " + bmw.getColor() + " es de " + tiempo + " y su kilometrage es: " + bmw.getKilomatraje());
    }
}
