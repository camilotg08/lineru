package co.com.lineru.credito.tasks;

import co.com.lineru.credito.userinterface.LineruCreditPage;
import co.com.lineru.credito.userinterface.LineruPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Go implements Task {
    private LineruPage lineruPage;
    public static Go toLineruPage() {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(lineruPage),
                Click.on(LineruCreditPage.NOTTODAY_BUTTON));
    }
}
