package com.company;

import java.util.Scanner;

/**
 * Programa en el que se emplean los conocimientos adquiridos de clases abstractas e interfaces.
 * @author Cristian Suárez Acosta
 */
public class Main {

    public static void main(String[] args) {

        boolean flag = true;
        System.out.println("-----------------------------");
        System.out.println("Welcome to Spacecraft creater");
        System.out.println("-----------------------------");

        while (flag) {
            System.out.println("\n\nselect one of the following options: ");
            System.out.println("1. Spacecraft Vehicle Launcher");
            System.out.println("2. Unmanned Spacecraft");
            System.out.println("3. Manned Spacecraft");
            System.out.println("4. Unknow Spacecraft");
            System.out.println("5. Finish");
            Scanner option = new Scanner(System.in);
            int selection = option.nextInt();

            switch (selection) {
                case 1:
                    SpacecraftVehiculeLauncher spacecraftVehiculeLauncher = new SpacecraftVehiculeLauncher();
                    spacecraftVehiculeLauncher.accelerate();
                    spacecraftVehiculeLauncher.crew();
                    spacecraftVehiculeLauncher.refuel();
                    spacecraftVehiculeLauncher.turnOn();
                    spacecraftVehiculeLauncher.isLaunchingLoad();

                    System.out.println(spacecraftVehiculeLauncher.toString());
                    break;
                case 2:
                    UnmannedSpacecraft unmannedSpacecraft = new UnmannedSpacecraft();
                    unmannedSpacecraft.accelerate();
                    unmannedSpacecraft.crew();
                    unmannedSpacecraft.refuel();
                    unmannedSpacecraft.turnOn();
                    unmannedSpacecraft.setCelestialPlanetsAnalyzed();
                    unmannedSpacecraft.setCells();

                    System.out.println(unmannedSpacecraft.toString());
                    break;
                case 3:
                    MannedSpacecraft mannedSpacecraft = new MannedSpacecraft();
                    mannedSpacecraft.accelerate();
                    mannedSpacecraft.crew();
                    mannedSpacecraft.refuel();
                    mannedSpacecraft.turnOn();

                    System.out.println(mannedSpacecraft.toString());
                    break;
                case 4:
                    UnknownSpacecraft unknownSpacecraft = new UnknownSpacecraft();
                    unknownSpacecraft.accelerate();
                    unknownSpacecraft.crewSize();
                    unknownSpacecraft.weight();
                    unknownSpacecraft.refuel();
                    unknownSpacecraft.sendSignals();
                    unknownSpacecraft.turnOn();

                    System.out.println(unknownSpacecraft.toString());
                    break;
                case 5:
                    System.out.println("Finishing the program");
                    flag = false;
                    break;
                default:
                    System.out.println("You have selected an invalid option, please try again.");
                    System.exit(0);
            }
        }
    }
}
