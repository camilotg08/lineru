package co.com.lineru.credito.tasks;

import co.com.lineru.credito.models.Values;
import co.com.lineru.credito.userinterface.LineruCreditPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Fill implements Task {
    public Fill() {
    }
    public static Fill theForm() {
        return Tasks.instrumented(Fill.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Values.amount).into(LineruCreditPage.INPUT_MONEY),
                Enter.theValue(Values.date).into(LineruCreditPage.INPUT_DATE),
                Click.on(LineruCreditPage.APPLY_BUTTON)
        );
    }
}
