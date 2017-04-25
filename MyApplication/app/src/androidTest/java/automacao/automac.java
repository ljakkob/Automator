package automacao;

import android.app.Instrumentation;
import android.support.test.espresso.core.deps.publicsuffix.PublicSuffixPatterns;
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


    /*@Test
    public void LigarTela() throws Exception {

        if (!mDevice.isScreenOn()) {
            mDevice.wakeUp();
            mDevice.pressHome();
        }
    }*/

    @Test
    public void AbreMenuApp() throws Exception {

        UiObject MenuApp = mDevice.findObject(new UiSelector().description("Apps"));
        MenuApp.clickAndWaitForNewWindow();
    }


    @Test
    public void Ajustes() throws Exception {
        UiObject Settings = mDevice.findObject(new UiSelector().description("Settings"));
        Settings.clickAndWaitForNewWindow();
    }

    /*@Test
    public void SelecionaBT() throws Exception {

        UiObject sBT = mDevice.findObject(new UiSelector().text("Bluetooth"));
        sBT.clickAndWaitForNewWindow();

        UiObject SwitchBT = sBT.getChild(new UiSelector().text("ON"));
        SwitchBT.click();
    }*/

    @Test

    /*public void AbreRadio () throws Exception {
        mDevice.pressHome();
        AbreMenuApp();
        UiObject radio = mDevice.findObject(new UiSelector().description("FM Radio"));
        radio.clickAndWaitForNewWindow();
        int cont = 0;
        while (cont<6) {
            UiObject Favorite = mDevice.findObject(new UiSelector().description("Favorite"));
            Favorite.click();

            UiObject proxRadio = mDevice.findObject(new UiSelector().description("Next seek"));
            proxRadio.clickAndWaitForNewWindow(3000);
            cont=cont+1;
        }
        mDevice.pressHome();
    } */


    public void addAlarm () throws Exception{
        AbreMenuApp();
        UiObject addAlarm = mDevice.findObject(new UiSelector().description("Clock"));
        addAlarm.clickAndWaitForNewWindow(3000);

        UiObject despertador = mDevice.findObject(new UiSelector().description("New alarm"));
        despertador.clickAndWaitForNewWindow(3000);

        UiObject addhora = mDevice.findObject(new UiSelector().resourceId("com.lge.sui.widget:id/hours"));
        addhora.click();
        addhora.setText("13");

        UiObject addmin = mDevice.findObject(new UiSelector().resourceId("com.lge.sui.widget:id/minutes"));
        addmin.click();
        addmin.setText("20");

    }
}











