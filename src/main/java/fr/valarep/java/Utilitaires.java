package fr.valarep.java;

import java.util.*;

public class Utilitaires {

    public static int demanderNombre(int limiteBasse, int limiteHaute) {
        int res;
        Scanner in = new Scanner(System.in);

        do {

            System.out.print("Entrez un nombre : ");
            while (!in.hasNextInt()) {
                String entree = in.next();
                System.out.println(entree + " n'est pas un nombre");
                System.out.print("Entrez un nombre : ");
            }

            res = in.nextInt();

            if (res < limiteBasse || res > limiteHaute) {
                System.err.println("\"" + res + "\"" + " n'est pas dans le domaine demandé");
            }
        } while (res < limiteBasse || res > limiteHaute);

        return res;
    }

    public static boolean demanderOuiNon() {
        do {
            System.out.print("On joue encore (o/n) ? ");
            Scanner in = new Scanner(System.in);
            if (in.hasNext("[on]")) {
                String reponse = in.nextLine();
                return reponse.substring(0, 1).equals("o");
            }
        } while (true);
    }
}