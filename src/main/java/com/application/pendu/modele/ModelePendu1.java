package com.application.pendu.modele;


public class ModelePendu1 {
     private int nbErreur;
    // dans le motAtrouver les lettres non trouvées en minuscule et les trouvées en Majuscule.
     private String motAtrouver;

    public int getNbErreur() {
        return nbErreur;
    }

    public void setNbErreur(int nbErreur) {
        this.nbErreur = nbErreur;
    }

    public String getMotAtrouver() {
        return motAtrouver;
    }

    public void setMotAtrouver(String motAtrouver) {
        this.motAtrouver = motAtrouver;
    }

    public ModelePendu1() {
        this.nbErreur = 0;
        this.motAtrouver="voituro".toLowerCase();
    }

    public void reset() {
        this.nbErreur = 0;
        this.motAtrouver="voiture".toLowerCase();
    }

    public boolean essayerLette(String s) {
        boolean trouve = false;
        if (motAtrouver.contains(s.toLowerCase())) {
            motAtrouver=motAtrouver.replace(s.toLowerCase().charAt(0), s.toUpperCase().charAt(0));
            trouve = true;
        } else {
            nbErreur++;
        }
        return trouve;
    }

    @Override
    public String toString() {
        return "ModelePendu1{" +
                "nbErreur=" + nbErreur +
                ", motAtrouver='" + motAtrouver + '\'' +
                '}';
    }

    public boolean perdu(){
        return nbErreur==12;
    }

    public boolean gagne(){
        return motAtrouver.equals(motAtrouver.toUpperCase());
    }
}




