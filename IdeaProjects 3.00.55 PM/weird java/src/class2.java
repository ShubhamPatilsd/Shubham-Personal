public class class2 {

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

    class MyKeyboard implements NativeKeyListener {

        public static void main(String[] args) {
            try {
                GlobalScreen.registerNativeHook();
            } catch (NativeHookException ex) {
                System.err.println("There was a problem registering the native hook.");
                System.err.println(ex.getMessage());

                System.exit(1);
            }

            GlobalScreen.addNativeKeyListener(new MyKeyboard());

            // Now press any keys and look at the output
        }

        @Override
        public void nativeKeyPressed(NativeKeyEvent e) {
        }

        @Override
        public void nativeKeyTyped(NativeKeyEvent nke) {
        }

        @Override
        public void nativeKeyReleased(NativeKeyEvent nke) {
        }

    }
}
