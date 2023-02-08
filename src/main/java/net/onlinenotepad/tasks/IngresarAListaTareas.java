package net.onlinenotepad.tasks;

import net.onlinenotepad.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarAListaTareas implements Task {

    public static IngresarAListaTareas deLaPagina() {
        return Tasks.instrumented(IngresarAListaTareas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Home.BTN_LISTA_TAREA));
    }
}
