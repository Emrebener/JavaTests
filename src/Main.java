import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Emre Bener");
        System.out.println("TYZM-621-01 \n");

        Buggy.nullPointerEx();
        Buggy.unusedVariable();
        Buggy.unnecessaryInitialVal();
    }

    public static class Buggy {

        // Null pointer referans hatasi
        public static void nullPointerEx() {
            String str = null;
            System.out.println(str.length());
        }

        // Gereksiz initial value atamasi
        public static void unnecessaryInitialVal() {
            int x = 5;
            x = 10;
            // The initial value of x is never used
        }

        // Kullanilmayan degisken
        public static void unusedVariable() {
            var kullanilmayacak = new Object();
        }


    }
}
