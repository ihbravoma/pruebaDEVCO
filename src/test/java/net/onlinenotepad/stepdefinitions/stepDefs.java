package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.onlinenotepad.tasks.EliminarArticulo;
import net.onlinenotepad.tasks.IngresarAListaTareas;
import net.onlinenotepad.tasks.IngresarNotaEnriquecido;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class stepDefs {


    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que {string} ingresa a la pagina")
    public void queIngresaALaPagina(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(Open.url("https://www.online-notepad.net/es/bloc-de-notas-online"));
    }
    @Cuando("ingresa a la seccion de lista de tareas")
    public void ingresaALaSeccionDeListaDeTareas() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarAListaTareas.deLaPagina());
    }
    @Y("elimina el articulo numero {string} de la lista")
    public void eliminaElArticuloNumeroDeLaLista(String numeroArticulo) {
        OnStage.theActorInTheSpotlight().attemptsTo(EliminarArticulo.deLaLista(numeroArticulo));
    }
    @Entonces("no se debe visualizar")
    public void noSeDebeVisualizar() {

    }

    @Cuando("ingresa a la seccion Nota Texto Enriquecido")
    public void ingresaALaSeccionNotaTextoEnriquecido() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarNotaEnriquecido.deLaPagina());
    }
    @Y("escribe {string} en negrita")
    public void escribeEnNegrita(String texto) {

    }
    @Entonces("el texto se debe visualizar en negrita")
    public void elTextoSeDebeVisualizarEnNegrita() {

    }

}
