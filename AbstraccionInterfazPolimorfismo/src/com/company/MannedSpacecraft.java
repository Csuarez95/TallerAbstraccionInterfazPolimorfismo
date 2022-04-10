package com.company;

/**
 * Clase definida para la creación de la nave NAVES ESPACIALES TRIPULADAS.
 * @author Cristian Suárez Acosta
 */
public class MannedSpacecraft extends Spacecraft{

    /**
     * Método heredado de Spacecraft para definir la velocidad de la nave.
     */
    @Override
    public void accelerate() {
        this.speed = 10;
    }

    /**
     * Método heredado de Spacecraft para definir el encendido de la nave.
     */
    @Override
    public void turnOn() {
        this.activation = true;
    }

    /**
     * Método heredado de Spacecraft para definir la cantidad de combustible de la nave.
     */
    @Override
    public void refuel() {
        this.fuel = 700;
    }

    /**
     * Método heredado de Spacecraft para definir la cantidad de tripulación de la nave.
     */
    @Override
    public void crew() {
        this.crew = 3;
    }

    /**
     * Método para impresión de los valores que caracterizan la nave.
     * @return Características de la nave creada.
     */
    @Override
    public String toString() {
        return "MannedSpacecraft\n{" +
                "\n speed = " + speed +
                ",\n activation = " + activation +
                ",\n fuel = " + fuel +
                ",\n crew = " + crew +
                "\n}";
    }
} // Cierre de la clase MannedSpacecraft.
