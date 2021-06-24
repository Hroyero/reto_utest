package co.com.choucair.bancolombia.utest.practica.tasks;

import co.com.choucair.bancolombia.utest.practica.model.UtestData;
import co.com.choucair.bancolombia.utest.practica.userinterface.UtestFillOutPassword;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class FillOutPassword implements Task {
    List<UtestData> utestData;
    public FillOutPassword(List<UtestData> utestData) {
        this.utestData = utestData;
    }


    public static FillOutPassword onThePage(List<UtestData> utestData) {
        return Tasks.instrumented(FillOutPassword.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrPassword()).into(UtestFillOutPassword.INPUT_PASSWORD),
                Enter.theValue(utestData.get(0).getStrConfirmPassword()).into(UtestFillOutPassword.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestFillOutPassword.CHECK_STAY_INFORME),
                Click.on(UtestFillOutPassword.CHECK_ACCEPT_THE_TERM_OF_USE),
                Click.on(UtestFillOutPassword.CHECK_ACCEPT_THE_SECURITY_POLICIES));
    }
}
