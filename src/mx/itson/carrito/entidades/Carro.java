/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

import mx.itson.carrito.enumTransmision.Transmision;
import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author dag13
 */
public class Carro
{

    /**
     * @return the transmision
     */
    public Transmision getTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the kilomatraje
     */
    public double getKilomatraje() {
        return kilomatraje;
    }

    /**
     * @param kilomatraje the kilomatraje to set
     */
    public void setKilomatraje(double kilomatraje) {
        this.kilomatraje = kilomatraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    private String color;
    private int anio;
    private String marca;
    private double kilomatraje;
    private TipoMotor tipoMotor;
    private Transmision transmision;
        
    /**
     * Calcula el tiempo que el carro tarda en reccorrer una distancia.
     * @param distancia Distencia que el carro va a recorrer.
     * @param velocidad Velocidad a la que viaja el carro.
     * @return Tiempo que tarda en recorrer la distancia especificada con la velocidad especificada.
     */
    public double calcularTiempoRecorrido(double distancia, double velocidad)
    {
        this.kilomatraje += distancia;
        double tiempo = distancia / velocidad;
        return tiempo;
    }
}
