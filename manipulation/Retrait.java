package com.example.tpcompte.manipulation;

public class Retrait extends Operation{
    public Retrait(double i){
        super(i);
    }
    public String retirer(){
        return ("Num d'operation :"+getNumero()+" , "+"Le montant retirer :"+montant+" DH "+" , "+"Date d'operation"+dateOperation);
    }
}
