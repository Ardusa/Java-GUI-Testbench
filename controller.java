import java.util.function.Supplier;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.Port;
import javax.swing.KeyStroke;

public class controller {
    KeyStroke keyStroke;
    private static Port port;

    public controller(String keyStroke) {
        // port2;
        // this.port.addLineListener(new LineListener() {
        // @Override
        // public void update(LineEvent event) {

        // }
        // });
        this.keyStroke = KeyStroke.getKeyStroke(keyStroke);
    }

}
