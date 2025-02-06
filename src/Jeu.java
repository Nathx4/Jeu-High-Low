import java.util.Scanner;

public class Jeu {

    public static void main(String[] args) {
        final String PRESENTATION = "Le jeu va choisir un nombre aléatoire compris entre 0 et 100. "
                + "Vous avez 10 tentatives pour le trouver =)";
        final String PROPOSITION = "Proposez un nombre : ";
        final String PLUS_GRAND = "Plus grand !";
        final String PLUS_PETIT = "Plus petit !";
        final String BRAVO = "\nBravo vous avez trouver le chiffre !";
        final String GAME_OVER = "\n\n***GAME OVER...Vous n'avez pas réussi à trouver le nombre en 10 essaies***";
        int max = 100;
        int min = 0;
        boolean trouver = false;
        int nombreATrouver;
        int nombrePropose;

        nombreATrouver = (int) (Math.random() * ( max - min ));
        Scanner clavier = new Scanner (System.in);

        for (int i = 0; i < 10 ; i++){
            System.out.println(PROPOSITION);
            nombrePropose = clavier.nextInt();
            if (nombrePropose < nombreATrouver){
                System.out.println(PLUS_GRAND);
            } else if (nombrePropose > nombreATrouver) {
                System.out.println(PLUS_PETIT);
            }else {
                System.out.println(BRAVO);
                trouver = true;
                break;
            }
        }
        if (trouver == false){
            System.out.println(GAME_OVER);
        }
    }
}
