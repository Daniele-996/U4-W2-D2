package esOne;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero per stabilere quante parole inserire! :");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);


        List<String> arrayParole = new ArrayList<>();
        System.out.println("Inserisci " + n + " parole a tua scelta!");

        for (int i = 0; i < n; i++) {
            String parolaInserita = scanner.nextLine();
            arrayParole.add(parolaInserita);
        }

        Set<String> paroleSingole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (String parolaInserita : arrayParole) {
            if (!paroleSingole.add(parolaInserita)) {
                paroleDuplicate.add(parolaInserita);
            }
        }

        System.out.println("------Duplicati------");
        for (String x : paroleDuplicate) {
            System.out.println(x);
        }

        System.out.println("-------Singole-------");
        for (String y : paroleSingole) {
            System.out.println(y);
        }
        ;
        System.out.println(arrayParole);
        scanner.close();
    }
}