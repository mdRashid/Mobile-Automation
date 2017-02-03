package CommonMethods;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by icecube on 2/1/17.
 */
public class CommonMethodsGH extends Base {

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[2]")
    public WebElement linkLogIn;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")
    public WebElement tfEmail;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.EditText[2]")
    public WebElement tfPassword;

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")
    public WebElement btnLogIn;

    public void logIn(){

        linkLogIn.click();
        tfEmail.sendKeys("mytestingmytest@gmail.com");
        tfPassword.sendKeys("MyGrub456");
        btnLogIn.click();
    }
}


// "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[2]"