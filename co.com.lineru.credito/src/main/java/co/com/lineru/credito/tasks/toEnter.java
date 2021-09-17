package co.com.lineru.credito.tasks;

import co.com.lineru.credito.userinterface.LineruCreditPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class toEnter implements Task {
    public static toEnter toApplyCredit() {
        return Tasks.instrumented(toEnter.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LineruCreditPage.CREDIT_BUTTON)
        );
    }
}
