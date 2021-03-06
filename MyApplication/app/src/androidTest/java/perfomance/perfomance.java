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


    public void chat() throws Exception {

        UiObject TypeMessage = mDevice.findObject(new UiSelector().text("Type a message"));
        TypeMessage.clickAndWaitForNewWindow(1000);
        TypeMessage.setText("123");

        UiObject Send = mDevice.findObject(new UiSelector().resourceId("com.whatsapp:id/send"));
        Send.click();

        mDevice.pressBack();
        mDevice.pressBack();

    }


    public void chatFace() throws Exception {

        UiObject TypeMessage = mDevice.findObject(new UiSelector().resourceId("com.facebook.orca:id/text_input_bar"));
        TypeMessage.clickAndWaitForNewWindow(2000);
        TypeMessage.setText("123");

        UiObject Send = mDevice.findObject(new UiSelector().resourceId("com.facebook.orca:id/composer_send_action_button"));
        Send.click();

        mDevice.pressBack();
        mDevice.pressBack();

    }

    @Test
    public void whats() throws Exception {
        mDevice.pressHome();
        UiObject Wapp = mDevice.findObject(new UiSelector().text("WhatsApp"));
        Wapp.click();
        int cont = 0;
        while (cont < 50) {
            UiObject Grupo1 = mDevice.findObject(new UiSelector().index(2));
            Grupo1.click();
            chat();

           UiObject Grupo2 = mDevice.findObject(new UiSelector().index(3));
            Grupo2.click();
            chat();

            UiObject Grupo3 = mDevice.findObject(new UiSelector().index(4));
            Grupo3.click();
            chat();

            UiObject Grupo4 = mDevice.findObject(new UiSelector().index(5));
            Grupo4.click();
            chat();

            cont++;
        }

        mDevice.pressBack();


    }


    public void Face() throws Exception {

        UiObject Fmsg = mDevice.findObject(new UiSelector().text("Messenger"));
        Fmsg.clickAndWaitForNewWindow();

        int cont = 0;
        while (cont < 40) {
            UiObject Grupo1 = mDevice.findObject(new UiSelector().index(0));
            Grupo1.click();
            chatFace();

            UiObject Grupo2 = mDevice.findObject(new UiSelector().index(1));
            Grupo2.click();
            chatFace();

            UiObject Grupo3 = mDevice.findObject(new UiSelector().className("android.view.ViewGroup").index(2));
            Grupo3.click();
            chatFace();

            UiObject Grupo4 = mDevice.findObject(new UiSelector().index(3));
            Grupo4.click();
            chatFace();

            cont++;
        }

            mDevice.pressBack();

    }

}







