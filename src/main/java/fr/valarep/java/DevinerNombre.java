package fr.valarep.java;

import java.util.*;

public final class DevinerNombre {

    private static int genererNombre() {
        Random random = new Random();
        int nombreOrdi = random.nextInt(100) + 1;
        return nombreOrdi;
    }

    public static void LancerJeu() {

        boolean onJoueEncore = false;
        do {
            System.out.println("Je pense à un nombre entre 1 et 100.");
            int nombreOrdi = genererNombre();
            System.out.println("(je pense à " + nombreOrdi + ")");
            int nombreJoueur = Utilitaires.demanderNombre(1, 100);
            afficherResultat(nombreOrdi, nombreJoueur);
            onJoueEncore = Utilitaires.demanderOuiNon();
        } while (onJoueEncore);
    }

    private static void afficherResultat(int nombreOrdi, int nombreJoueur) {
        System.out.println("Vous avez saisi : " + nombreJoueur);
        System.out.println("Je pensais à : " + nombreOrdi);

        int difference = Math.abs(nombreOrdi - nombreJoueur);
        if (nombreJoueur > nombreOrdi) {
            System.out.println("Vous avez dépassé de : " + difference);
            afficherPerdu();
        } else if (nombreJoueur < nombreOrdi) {
            System.out.println("Vous étiez à  : " + difference);
            afficherPerdu();
        } else {
            afficherGagne();
        }
    }

    private static void afficherPerdu() {
        String msg = "Vous avez perdu !";
        for (int i = msg.length() - 1; i >= 0; i--) {
            System.out.println(msg.substring(i));
        }
    }

    private static void afficherGagne() {
        String msg = "Vous avez gagné !";
        for (int i = 0; i < msg.length(); i++) {
            System.out.println(msg.substring(0, i + 1));
        }
    }

}