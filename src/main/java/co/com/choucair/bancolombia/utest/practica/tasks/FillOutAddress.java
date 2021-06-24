package co.com.choucair.bancolombia.utest.practica.tasks;

import co.com.choucair.bancolombia.utest.practica.model.UtestData;
import co.com.choucair.bancolombia.utest.practica.userinterface.UtestFillOutAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.choucair.bancolombia.utest.practica.userinterface.UtestFillOutAddress.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillOutAddress implements Task {
    List<UtestData> utestData;
    public FillOutAddress(List<UtestData> utestData) {
        this.utestData = utestData;
    }


    public static FillOutAddress onThePage(List<UtestData> utestData) {
        return Tasks.instrumented(FillOutAddress.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrCity()).into(UtestFillOutAddress.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestFillOutAddress.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestFillOutAddress.INPUT_CITY),
                Enter.theValue(utestData.get(0).getStrPostal()).into(UtestFillOutAddress.INPUT_POSTAL),
                Click.on(UtestFillOutAddress.INPUT_COUNTRY),
                Click.on(UtestFillOutAddress.SELECT_COUNTRY),
                Click.on(UtestFillOutAddress.BUTTON_NEXT_DEVICES));

    }
}
