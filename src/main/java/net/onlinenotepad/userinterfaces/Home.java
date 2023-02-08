package net.onlinenotepad.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

    private Home() {

    }

    public static final Target BTN_LISTA_TAREA = Target.the("botón de lista de tarea").located(By.id("tasklist-tab"));
    public static final Target BTN_NOTA_TEXTO_ENRIQUECIDO = Target.the("botón nota texto enriquecido").located(By.id("richtextnote-tab"));

}
