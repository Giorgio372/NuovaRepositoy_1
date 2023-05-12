package Esercitazione_05;

import java.util.Scanner;

public class calcolaPerimetroArea {
    public static void main(String[] args) {
        int lato;
        Scanner input = new Scanner(System.in);
        System.out.print("Inserire il valore del lato di un quadrato: ");
        lato = input.nextInt();
        //se l'input dell'utente è maggiore di 400 stampa "il numero è troppo grosso"
        //se invece è minore effettua il calcolo
        if (lato > 400 || lato<1){
            System.out.print("Il numero è troppo grosso");    
        }
        else{
        System.out.print("Perimetro: " + lato*4 + "\nArea: " + lato*lato);
        }
    }
}
