package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EliminarArticulo implements Task {

    private String numeroArtiuclo;

    public EliminarArticulo(String numeroArtiuclo) {
        this.numeroArtiuclo = numeroArtiuclo;
    }

    public static EliminarArticulo deLaLista(String numeroArticulo) {
        return Tasks.instrumented(EliminarArticulo.class, numeroArticulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
