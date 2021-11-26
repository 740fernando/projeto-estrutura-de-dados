package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[]args){

        int intA= 1;
        int intB= 2;

        System.out.println(intA+intB);

        MeuObj objA= new MeuObj(1);
        MeuObj objB= objA;

        System.out.println("Meu obj: "+ objA+"\n Obj 2: "+objB);
        objA.setNum(3);
        System.out.println("Meu obj: "+ objA+"\n Obj 2: "+objB);

    }
}
