package LoginTest;

import CommonMethods.CommonMethodsGH;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.Base.ad;

/**
 * Created by icecube on 2/1/17.
 */
public class TestLogin extends CommonMethodsGH {

    @Test
    public void testLoginGH(){

        CommonMethodsGH commonMethodsGH = PageFactory.initElements(ad, CommonMethodsGH.class);
        //commonMethodsGH.logIn();
        commonMethodsGH.linkLogIn.click();
        commonMethodsGH.tfEmail.sendKeys("mytestingmytest@gmail.com");
        commonMethodsGH.tfPassword.sendKeys("MyGrub456");
        commonMethodsGH.btnLogIn.click();
    }
}
