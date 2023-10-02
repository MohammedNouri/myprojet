package com.example.tpcompte.manipulation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Compte> comptes = new ArrayList<>();
        Compte c1 = new Compte(1000, "CREATED");
        Compte c2 = new Compte(500, "CREATED");
        Compte c3 = new Compte(500, "CREATED");
        Compte c4 = new Compte(500, "CREATED");
        CompteCourant cm1 = new CompteCourant(150);
        c1.verser(500);
        c1.retirer(200);
        c2.verser(400);
        c2.retirer(320);
        c3.verser(800);
        c3.retirer(750);
        cm1.setSolde(2000);
        comptes.add(c1);
        comptes.add(c2);
        comptes.add(c3);
        comptes.add(c4);
        Compte.verement(200, c1, c2);
//        Compte.verement(200, c1, c2);
//        System.out.println(c1.ViewSolde());
//        System.out.println(c2.ViewSolde());
//        System.out.println(comptes.size());

 /*       Operation op1 = new Retrait(600);
        Operation op2 = new Versement(200);
        Operation op3 = new Retrait(400);
        Operation op4 = new Versement(700);
        c1.HistoriqueCompte(op3);
        c1.HistoriqueCompte(op2);
        c1.HistoriqueCompte(op1);
        c1.HistoriqueCompte(op4);
        c2.HistoriqueCompte(op2);
        c3.HistoriqueCompte(op3);
        c4.HistoriqueCompte(op4);*/
       /* double t=0;
        for (int i =0;i<comptes.size();i++){
            System.out.println("Compte de code :"+i);
            System.out.println("Information de votre Compte :");
            for (Operation e :comptes.get(i).ListOperation){
                if (e instanceof Retrait){
                    e.retirer();
                    System.out.println(t+=e.getMontant());

                }else {

                    e.verser();
                    System.out.println(t+=e.getMontant());

                }
            }*/

/*        for (int i =0;i<comptes.size();i++) {
            double v=0;
            double t = 0;
            System.out.println("Compte de code :" + i);
            for (Operation e : comptes.get(i).ListOperation) {

                if (e instanceof Versement) {
                    e.verser();
                    t +=e.getMontant();
                } else {
                    e.retirer();
                    v = v + e.getMontant();
                }

            }
            System.out.println("Total de versement :" + t);
            System.out.println("Total de Retairait :" + v);
        }*/
        for (int i = 0; i < comptes.size(); i++) {
            System.out.println(comptes.get(i).toString());
            System.out.println("Information de votre Compte :");
            for (Operation e : comptes.get(i).ListOperation) {
                if (e instanceof Retrait) {
                    System.out.println(e.retirer());
                } else {
                    System.out.println(e.verser());
                }
            }
            System.out.println("Totale de versement : " + comptes.get(i).totalVersement() + " DH ");
            System.out.println("Totale de Retairait: " + comptes.get(i).totalRetrait() + " DH  ");
            System.out.println();
        }
        PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\hp\\AndroidStudioProjects\\TpCompte\\app\\src\\main\\java\\com\\example\\tpcompte\\manipulation\\clinet2.txt"));
        for (int i = 0; i < comptes.size(); i++) {
            double v = 0;
            double t = 0;
            out.println(comptes.get(i).toString());
            out.println("Information de votre Compte :");
            for (Operation e : comptes.get(i).ListOperation) {
                if (e instanceof Retrait) {
                    out.println(e.retirer());
                } else {
                    out.println(e.verser());
                }
            }
            out.println("Total de versement :" + comptes.get(i).totalVersement() + " DH ");
            out.println("Total de Retairait :" +comptes.get(i).totalRetrait() + " DH  ");
            out.println();

        }
        out.close();


    }
}

