package com.company;

/**
 * Clase definida para la creación de la nave NAVE ESPACIAL DESCONOCIDA.
 * @author Cristian Suárez Acosta
 */

public class UnknownSpacecraft implements SpacecraftInterface{

    /**
     * Atributo para definir el envío de señales de la nave.
     */
    private boolean signal;
    /**
     * Atributo para definir la cantidad de combustible de la nave.
     */
    private int fuel;
    /**
     * Atributo para definir la cantidad de tripulación de la nave.
     */
    private int crew;
    /**
     * Atributo para definir el peso de la nave.
     */
    private int weight;
    /**
     * Atributo para definir la velocidad de la nave.
     */
    private int speed;

    /**
     * Atributo para definir el estado de la nave.
     */
    private boolean activation;

    /**
     * Constructor para inicializar los atributos.
     */
    public UnknownSpacecraft() {
        this.signal = false;
        this.fuel = 0;
        this.crew = 0;
        this.weight = 0;
        this.speed = 0;
        this.activation = false;
    }

    /**
     * Método implementado de la interfaz para definir el envío de señales por de la nave.
     */
    @Override
    public void sendSignals() {
        this.signal = true;
    }

    /**
     * Método implementado de la interfaz para definir la cantidad de combustible de la nave.
     */
    @Override
    public void refuel() {
        this.fuel = 35;
    }

    /**
     * Método implementado de la interfaz para definir la cantidad de tripulación por de la nave.
     */
    @Override
    public void crewSize() {
        this.crew = 4;
    }

    /**
     * Método implementado de la interfaz para definir el peso de la nave.
     */
    @Override
    public void weight() {
        this.weight = 10000;
    }

    /**
     * Método implementado de la interfaz para definir la velocidad de la nave.
     */
    @Override
    public void accelerate() {
        this.speed = 24;
    }

    /**
     * Método implementado de la interfaz para definir el encendido de la nave.
     */
    @Override
    public void turnOn() {
        this.activation = true;
    }

    /**
     * Método para impresión de los valores que caracterizan la nave.
     * @return Características de la nave creada.
     */
    @Override
    public String toString() {
        return "UnknownSpacecraft\n{" +
                "\n signal = " + signal +
                ",\n fuel = " + fuel +
                ",\n crew = " + crew +
                ",\n weight = " + weight +
                ",\n speed = " + speed +
                ",\n activation = " + activation +
                "\n}";
    }
} // Cierre de la clase UnknownSpacecraft
