package com.projeto.atribuicaoreferencia;

public class MeuObj {

    Integer num;

    public MeuObj(int i) {
        this.num=i;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return ""+
                num;
    }
}
