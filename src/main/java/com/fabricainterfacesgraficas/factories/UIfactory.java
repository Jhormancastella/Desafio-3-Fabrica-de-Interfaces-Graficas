package com.fabricainterfacesgraficas.factories;

import com.fabricainterfacesgraficas.components.Button;
import com.fabricainterfacesgraficas.components.NavBar;

public interface UIfactory {
    Button createStyledButton();
    NavBar createNavBar();

}
