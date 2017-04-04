package automacao;

import android.app.Instrumentation;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Created by on 21/03/2017.
 */

public class automac extends Instrumentation {

    /*Criando Objeto mDevice do tipo UiDevice*/
    UiDevice mDevice;

    /*Iniciando mDevice*/
    @Before

    public void SetUp() throws Exception {
        mDevice = UiDevice.getInstance(getInstrumentation());
    }


    @Test
    public void LigarTela () throws Exception {

        /*ligando a tela*/
        if (!mDevice.isScreenOn()) {
            mDevice.wakeUp();
            mDevice.pressHome();
        }
        //Create UiObject instance for the UI element


        UiObject AppTray_Button = new UiObject(new UiSelector().description("Apps"));
        /* Check if the button exists */
        if (AppTray_Button.exists()) {
            //Click on the Button
            AppTray_Button.clickAndWaitForNewWindow();
        }

        UiObject Settings = new UiObject( (new UiSelector().description("Settings")));

        if (Settings.exists()){
            Settings.clickAndWaitForNewWindow();
        }

        UiObject Bluetooth = new UiObject((new UiSelector().description("Bluetooth")));
        if (Bluetooth.exists()) {
            Bluetooth.clickAndWaitForNewWindow();
        }
    }
}

