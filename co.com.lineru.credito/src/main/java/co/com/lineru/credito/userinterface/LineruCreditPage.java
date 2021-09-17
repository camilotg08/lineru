package co.com.lineru.credito.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineruCreditPage extends PageObject {
    public static final Target NOTTODAY_BUTTON = Target.the("button that cancel the first popup")
            .located(By.xpath("//*[@id=\"wzrk-cancel\"]"));
    public static final Target CREDIT_BUTTON = Target.the("button that show us the form to apply for a credit")
            .located(By.xpath("//*[@id=\"routify-app\"]/div[1]/div[2]/div/a[1]"));
    public static final Target INPUT_MONEY = Target.the("where do we write amount requested")
            .located(By.xpath("//*[@id=\"value\"]"));
    public static final Target INPUT_DATE = Target.the("where do we write the date for the payment")
            .located(By.xpath("//*[@id=\"routify-app\"]/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/znb-datepicker//div/input"));
    public static final Target APPLY_BUTTON = Target.the("button that apply for a credit")
            .located(By.xpath("//*[@id=\"routify-app\"]/div[1]/div[2]/div/a[1]"));
    public static final Target APPLY_FORM = Target.the("form to fill the values for the apply credit")
            .located(By.xpath("//*[@id=\"routify-app\"]/div[1]/div"));
}
