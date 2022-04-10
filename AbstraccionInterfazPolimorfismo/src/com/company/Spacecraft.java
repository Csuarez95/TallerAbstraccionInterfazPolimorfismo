package com.company;

/**
 * Clase abstracta de las naves espaciales.
 * @author Cristian Suárez Acosta
 */

public abstract class Spacecraft {

    /**
     * Atributo para almacenar la velocidad de la nave.
     */
    protected int speed;
    /**
     * Atributo para encender la nave.
     */
    protected boolean activation;
    /**
     * Atributo para indicar la cantidad de combustible de la nave.
     */
    protected int fuel;
    /**
     * Atributo para almacenar la capacidad de tripulantes de la nave.
     */
    protected int crew;

    /**
     * Constructur para inicializar los Atributos.
     */
    public Spacecraft() {
        this.speed = 0;
        this.activation = false;
        this.fuel = 0;
        this.crew = 0;
    }

    /**
     * Método para la velocidad de la nave.
     */
    public abstract void accelerate();

    /**
     * Método para el encendido de la nave.
     */
    public abstract void turnOn();

    /**
     * Método para la candiad de combustible de la nave.
     */
    public abstract void refuel();

    /**
     * Método para la cantidad de tripulación de la nave.
     */
    public abstract void crew();
}
