package fr.valarep.java;

public class Triangle {

    public static void VerificationTriangle() {

        int baton1 = Utilitaires.demanderNombre(1, 1000);
        int baton2 = Utilitaires.demanderNombre(1, 1000);
        int baton3 = Utilitaires.demanderNombre(1, 1000);

        if (peutFormerTriangle(baton1, baton2, baton3)) {
            System.out.println("Triangle possible");
        } else {
            System.out.println("Triangle impossible");
        }
    }

    private static boolean peutFormerTriangle(int longueur1, int longueur2, int longueur3) {

        if (longueur1 > longueur2 + longueur3) {
            return false;
        } else if (longueur2 > longueur1 + longueur3) {
            return false;
        } else if (longueur3 > longueur1 + longueur2) {
            return false;
        }
        return true;
    }
}