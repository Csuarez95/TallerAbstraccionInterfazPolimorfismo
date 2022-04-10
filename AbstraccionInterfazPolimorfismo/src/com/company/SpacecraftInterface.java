package com.company;

/**
 * Interface para la implementación de la nave.
 * @author Cristian Suárez Acosta
 */
public interface SpacecraftInterface {

    /**
     * Interfaz para el envío de las señales de la nave.
     */
    void sendSignals();
    /**
     * Interfaz para la cantidad de combustible de la nave.
     */
    void refuel();
    /**
     * Interfaz para la cantidad de tripulación de la nave.
     */
    void crewSize();
    /**
     * Interfaz para el peso de la nave.
     */
    void weight();
    /**
     * Interfaz para la velocidad de la nave.
     */
    void accelerate();
    /**
     * Interfaz para el encendido de la nave.
     */
    void turnOn();

} //Cierre de la interfaz SpacecraftInterface.
