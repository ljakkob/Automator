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
    public void LigarTela() throws Exception {

        /*ligando a tela*/
        if (!mDevice.isScreenOn()) {
            mDevice.wakeUp();
            mDevice.pressHome();
        }
    }

    @Test
    public void AbreMenuApp() throws Exception {

        UiObject MenuApp = mDevice.findObject(new UiSelector().text("Apps"));
        MenuApp.clickAndWaitForNewWindow();
    }


    @Test
    public void Ajustes() throws Exception {
        UiObject Settings = mDevice.findObject(new UiSelector().text("Settings"));
        Settings.clickAndWaitForNewWindow();
    }

    @Test
    public void SelecionaBT() throws Exception {

        UiObject sBT = mDevice.findObject(new UiSelector().text("Bluetooth"));
        sBT.clickAndWaitForNewWindow();

        UiObject SwitchBT = sBT.getChild(new UiSelector().text("ON"));
        SwitchBT.click();
    }

     //aiimeudeus foi pass
}




