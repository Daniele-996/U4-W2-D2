package esThree;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> rubricaTelefonica = new HashMap<>();

        rubricaTelefonica.put("Daniele", 354826179);
        rubricaTelefonica.put("Alessio", 354849657);
        rubricaTelefonica.put("Luisa", 327946242);
        rubricaTelefonica.put("Cristian", 392458710);

        rubricaTelefonica.remove("Cristian");

        System.out.println("Numero di Daniele: " + rubricaTelefonica.get("Daniele"));
        System.out.println("Numero di Alessio: " + rubricaTelefonica.get("Alessio"));
        System.out.println("Numero di Luisa: " + rubricaTelefonica.get("Luisa"));

        System.out.println("Nome con numero 327946242: " + cercaNome(rubricaTelefonica, 327946242));
        System.out.println("Nome con numero 354826179: " + cercaNome(rubricaTelefonica, 354826179));
        System.out.println("Nome con numero 354849657: " + cercaNome(rubricaTelefonica, 354849657));

        stampaContatti(rubricaTelefonica);
    }

    public static String cercaNome(HashMap<String, Integer> rubrica, int numero) {
        for (String nome : rubrica.keySet()) {
            if (rubrica.get(nome) == numero) {
                return nome;
            }
        }
        return "Numero non trovato.";
    }

    public static void stampaContatti(HashMap<String, Integer> rubrica) {
        for (String nome : rubrica.keySet()) {
            System.out.println(nome + ": " + rubrica.get(nome));
        }
    }
}
