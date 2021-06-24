package co.com.choucair.bancolombia.utest.practica.tasks;

import co.com.choucair.bancolombia.utest.practica.userinterface.UtestFillOutDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FillOutDevices implements Task {


    private UtestFillOutDevices utestFillOutDevices;

    public static FillOutDevices onThePage() {
        return Tasks.instrumented(FillOutDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestFillOutDevices.CLICK_CLOSE_AUTODETECTED),
                Click.on(UtestFillOutDevices.INPUT_LIST_COMPUTER),
                Click.on(UtestFillOutDevices.SELECT_CUMPUTER),
                Click.on(UtestFillOutDevices.INPUT_LIST_VERSION),
                Click.on(UtestFillOutDevices.SELECT_VERSION),
                Click.on(UtestFillOutDevices.INPUT_LIST_LANGUAGE),
                Click.on(UtestFillOutDevices.SELECT_LANGUAGE),
                Click.on(UtestFillOutDevices.BUTTON_NEXT_LAST_SETUP));
    }
}
