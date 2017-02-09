package UITesting;

import UI.CatalogUI;
import UI.UITextFields.TextFields;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by icecube on 2/7/17.
 */
public class TestingTextFields extends CatalogUI {

    //TextFields textFields = new TextFields();

    @Test
    public void testingTextFields() throws InterruptedException {

        CatalogUI catalogUI = PageFactory.initElements(ad, CatalogUI.class);
        uTextFields().typeOnTextFields();
//        catalogUI.uTextFields();
//        textFields.typeOnTextFields();
    }
}
