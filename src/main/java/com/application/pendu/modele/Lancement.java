package com.application.pendu.modele;

public class Lancement {
    public static void main(String[] args) {
        ModelePendu1  p= new ModelePendu1();
        System.out.println(p);
        System.out.println(p.essayerLette("v"));
        System.out.println(p);
        System.out.println(p.essayerLette("p"));
        System.out.println(p);
        System.out.println(p.essayerLette("o"));
        System.out.println(p);
        System.out.println(p);
        System.out.println(p.essayerLette("o"));
        System.out.println(p);
        System.out.println(p.getMotAtrouver().equals(p.getMotAtrouver().toUpperCase()));

    }
}
