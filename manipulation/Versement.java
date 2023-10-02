package com.example.tpcompte.manipulation;

public class Versement extends Operation{
    public Versement(double i){
        super(i);
    }
    public String verser(){
        return ("Num d'operation :"+getNumero()+" , "+"Le montant verser :"+montant+" DH "+" , "+"Date d'operation"+dateOperation);
    }
}
