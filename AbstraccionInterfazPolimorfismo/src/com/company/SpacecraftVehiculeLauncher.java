package com.company;

/**
 * Clase definida para la creación de la nave VEHÍCULOS LANZADERA.
 * @author Cristian Suárez Acosta
 */
public class SpacecraftVehiculeLauncher extends Spacecraft {

    /**
     * Atributo para la determinar el estado de la carga de la nave.
     */
    private boolean launchingLoad;

    /**
     * Método para asignar el estado de la carga de la nave.
     */
    public SpacecraftVehiculeLauncher() {
        this.launchingLoad = false;
    }

    /**
     * Método para retornar el estado de la carga de la nave.
     */
    public boolean isLaunchingLoad() {
        return launchingLoad;
    }

    /**
     * Método heredado de Spacecraft para definir la velocidad de la nave.
     */
    @Override
    public void accelerate() {
        this.speed = 5;
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
        this.fuel = 500;
    }

    /**
     * Método heredado de Spacecraft para definir la cantidad de tripulación de la nave.
     */
    @Override
    public void crew() {
        this.crew = 5;
    }

    /**
     * Método para impresión de los valores que caracterizan la nave.
     * @return Características de la nave creada.
     */
    @Override
    public String toString() {
        return "SpacecraftVehiculeLauncher\n{" +
                "\n speed = " + speed +
                ",\n activation = " + activation +
                ",\n fuel = " + fuel +
                ",\n crew = " + crew +
                ",\n launchingLoad = " + launchingLoad +
                "\n}";
    }
} //Cierre de la clase SpacecraftVehiculeLauncher
