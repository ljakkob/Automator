package perfomance;

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

public class perfomance extends Instrumentation {

    /*Criando Objeto mDevice do tipo UiDevice*/
    UiDevice mDevice;

    /*Iniciando mDevice*/
    @Before

    public void SetUp() throws Exception {
        mDevice = UiDevice.getInstance(getInstrumentation());
    }

    public void chat () throws Exception {

            UiObject TypeMessage = mDevice.findObject(new UiSelector().text("Type a message"));
            TypeMessage.click();
            TypeMessage.setText("Testando 123 abc pass or fail");

            UiObject Send = mDevice.findObject(new UiSelector().resourceId("com.whatsapp:id/send"));
            Send.click();

            mDevice.pressBack();
            mDevice.pressBack();
    }

    @Test
    public void whats () throws Exception {
        mDevice.pressHome();
        UiObject Wapp = mDevice.findObject(new UiSelector().text("WhatsApp"));
        Wapp.clickAndWaitForNewWindow();
        int cont = 0;
        while (cont<10) {
            UiObject Grupo1 = mDevice.findObject(new UiSelector().index(2));
            Grupo1.clickAndWaitForNewWindow();
            chat();
            UiObject Grupo2 = mDevice.findObject(new UiSelector().index(3));
            Grupo2.clickAndWaitForNewWindow();
            chat();
            UiObject Grupo3 = mDevice.findObject(new UiSelector().index(4));
            Grupo3.clickAndWaitForNewWindow();

            cont=cont+1;
        }

        mDevice.pressBack();

    }
}



