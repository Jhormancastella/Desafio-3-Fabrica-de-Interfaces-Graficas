package com.fabricainterfacesgraficas.factories;

// simepre realizar las importaciones necesarias
// en este caso importar las clases de los componentes
// y la interfaz UIfactory

import com.fabricainterfacesgraficas.components.Button;
import com.fabricainterfacesgraficas.components.NavBar;
import com.fabricainterfacesgraficas.components.DarkModeButton;
import com.fabricainterfacesgraficas.components.DarkModeNavBar;

// nota siempre usar el implements para implementar una interfaz
// en este caso la interfaz UIfactory
public class DarkModeUIFactory implements UIfactory{                   

    public Button createStyledButton() {
        return new DarkModeButton();
    }

    public NavBar createNavBar() {
        return new DarkModeNavBar();
    }
}
