package esTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        List<Integer> listaNumeri = new ArrayList<>();
        Random random = new Random();
        int n = 10;

        for (int i = 0; i < n; i++) {
            listaNumeri.add(random.nextInt(101));
        }
        Collections.sort(listaNumeri);
        System.out.println(listaNumeri);

        List<Integer> nuova = new ArrayList<>(listaNumeri);
        List<Integer> inversa = new ArrayList<>(listaNumeri);
        Collections.reverse(inversa);
        nuova.addAll(inversa);
        System.out.println(nuova);

        boolean pari = true;
        //boolean dispari = false;

        if (pari) {
            System.out.println("Numeri in posizioni pari");
            for (int i = 0; i < nuova.size(); i += 2) {
                System.out.println("In posizione " + i + ": " + nuova.get(i));
            }
        } else {
            System.out.println("Numeri in posizioni dispari");
            for (int i = 1; i < nuova.size(); i += 2) {
                System.out.println("In posizione " + i + ": " + nuova.get(i));
            }
        }
    }
}
