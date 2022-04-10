package com.company;

/**
 * Clase definida para la creación de la nave NAVES ESPACIALES NO TRIPULADAS.
 * @author Cristian Suárez Acosta
 */

public class UnmannedSpacecraft extends Spacecraft{

    /**
     * Atributo para definir el número de celdas de la nave.
     */
    private int cells;
    /**
     * Atributo para definir los planetas analizados.
     */
    private int celestialPlanetsAnalyzed;

    /**
     * Constructor para inicializar los atributos.
     */
    public UnmannedSpacecraft() {
        this.cells = 0;
        this.celestialPlanetsAnalyzed = 0;
    }

    /**
     * Método para definir la cantidad de celdas fotovoltáicas de la nave.
     */
    public void setCells() {
        this.cells = 1000;
    }

    /**
     * Método para definir la cantidad de objetov analizados por de la nave.
     */
    public void setCelestialPlanetsAnalyzed() {
        this.celestialPlanetsAnalyzed = 4;
    }

    /**
     * Método heredado de Spacecraft para definir la velocidad de la nave.
     */
    @Override
    public void accelerate() {
        this.speed = 1;
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
        this.fuel = 300;
    }

    /**
     * Método heredado de Spacecraft para definir la cantidad de tripulación de la nave.
     */
    @Override
    public void crew() {
        this.crew = 0;
    }

    /**
     * Método para impresión de los valores que caracterizan la nave.
     * @return Características de la nave creada.
     */
    @Override
    public String toString() {
        return "UnmannedSpacecraft\n{" +
                "\n speed = " + speed +
                ",\n activation=" + activation +
                ",\n fuel=" + fuel +
                ",\n crew=" + crew +
                ",\n cells=" + cells +
                ",\n celestialPlanetsAnalyzed=" + celestialPlanetsAnalyzed +
                "\n}";
    }
} //Cierre de la clase UnmannedSpacecraft
