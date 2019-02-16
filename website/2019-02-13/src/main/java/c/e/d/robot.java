package c.e.d;

import java.awt.*;
import java.awt.event.KeyEvent;

public class robot {

    public static void main(String[] args) {
        Robot r;

        {
            try {
                r = new Robot();
                r.keyPress(KeyEvent.VK_A);
                Thread.sleep(1000);
                r.keyRelease(KeyEvent.VK_A);



            } catch (AWTException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
