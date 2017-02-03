package UITesting;

import CommonMethods.CommonMethodsGH;
import UI.NavigateMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by icecube on 2/2/17.
 */
public class TestingScheduledOrders extends NavigateMenu {

    @Test
    public void testingScheduledOrders() throws InterruptedException {
        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        commonMethodsGH.logIn();
        NavigateMenu navigateMenu = PageFactory.initElements(ad, NavigateMenu.class);
        uScheduledOrders().doSomething();
    }
}
