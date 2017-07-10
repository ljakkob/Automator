package Chrom;

import android.support.test.uiautomator.UiDevice;

import org.junit.Before;
import android.app.Instrumentation;
import android.support.test.espresso.core.deps.publicsuffix.PublicSuffixPatterns;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Created by brisatc239.pimenta on 10/05/2017.
 */

public class Chrome extends Instrumentation {
    /*Criando Objeto mDevice do tipo UiDevice*/
    UiDevice mDevice;

    /*Iniciando mDevice*/
    @Before

    public void SetUp() throws Exception {
        mDevice = UiDevice.getInstance(getInstrumentation());
    }


    public void top50() throws Exception {


        UiObject aba = mDevice.findObject(new UiSelector().resourceId("com.android.chrome:id/tab_switcher_button"));
        aba.click();
        UiObject tab = mDevice.findObject(new UiSelector().resourceId("com.android.chrome:id/new_tab_button"));
        tab.click();

    }

    @Test
    public void Chrome() throws Exception {
        mDevice.pressHome();
        UiObject Chrome = mDevice.findObject(new UiSelector().text("Chrome"));
        Chrome.click();

        UiObject TypeMessage = mDevice.findObject(new UiSelector().className("android.widget.EditText"));
        TypeMessage.clickAndWaitForNewWindow(2000);
        TypeMessage.setText("facebook.com");

        UiDevice mDevice = UiDevice.getInstance();
        mDevice.pressEnter();
        top50();

        UiObject TypeMessage1 = mDevice.findObject(new UiSelector().className("android.widget.EditText"));
        TypeMessage1.clickAndWaitForNewWindow(2000);
        TypeMessage1.setText("Google.com");
        mDevice.pressEnter();
        top50();

        UiObject TypeMessage2 = mDevice.findObject(new UiSelector().className("android.widget.EditText"));
        TypeMessage2.clickAndWaitForNewWindow(2000);
        TypeMessage2.setText("Live.com");
        mDevice.pressEnter();
        top50();

        UiObject TypeMessage3= mDevice.findObject(new UiSelector().className("android.widget.EditText"));
        TypeMessage3.clickAndWaitForNewWindow(2000);
        TypeMessage3.setText("Msn.com");
        mDevice.pressEnter();
        top50();

        UiObject TypeMessage4= mDevice.findObject(new UiSelector().className("android.widget.EditText"));
        TypeMessage4.clickAndWaitForNewWindow(2000);
        TypeMessage4.setText("Wikipedia.org");
        mDevice.pressEnter();
        top50();


        UiObject TypeMessage5= mDevice.findObject(new UiSelector().className("android.widget.EditText"));
        TypeMessage5.clickAndWaitForNewWindow(2000);
        TypeMessage5.setText("Wordpress.com");
        mDevice.pressEnter();
        top50();
    }

}






