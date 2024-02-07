package com.polytech;
public class Factorielle {
    int valeur;
    public Factorielle() {
        valeur = 5;
    }
    public int getResultat() {
        int i, resultat = 1;
        if (valeur > 1)
            for (i = 1; i <= valeur; i++)
                resultat *= i;
        return resultat;
    }
}