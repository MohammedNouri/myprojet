package com.example.tpcompte.manipulation;

import java.util.ArrayList;
import java.util.Date;

public class Operation {
    private int numero;
    public Date dateOperation;
    protected double montant;
    public static int cmpt;


    public Operation(){}
    public Operation(double mt){
        this.dateOperation=new Date();
        this.montant=mt;
        this.numero=++cmpt;
    }
    public int getNumero(){
        return this.numero;
    }

    public String retirer(){return null;}
    public String verser(){return null;}


}
