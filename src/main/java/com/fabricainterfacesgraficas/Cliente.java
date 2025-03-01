package com.fabricainterfacesgraficas;

import java.util.Scanner;

import com.fabricainterfacesgraficas.components.Button;
import com.fabricainterfacesgraficas.components.NavBar;
import com.fabricainterfacesgraficas.factories.DarkModeUIFactory;
import com.fabricainterfacesgraficas.factories.LightModeUIFactory;
import com.fabricainterfacesgraficas.factories.UIfactory;

public class Cliente {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seleccione el tema de UI ( 1 para el Modo Oscuro, 2 para el Modo Claro): ");
        String tema = scanner.nextLine().trim().toLowerCase();

        UIfactory factory = null;

        switch (tema) {
            case "1":
                factory = (UIfactory) new DarkModeUIFactory();
                break;
            case "2":
                factory = (UIfactory) new LightModeUIFactory();
                break;
            default:
                System.out.println("Tema no válido.");
                return;
        }

        Button button = factory.createStyledButton();
        NavBar navBar = factory.createNavBar();

        button.render();
        navBar.render();

        scanner.close();
    }
    
}