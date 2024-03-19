package Ajedrez;

public class Casilla {
    Ficha ficha;
    public Casilla(Ficha ficha) {
        this.ficha = ficha;
    }

    public Casilla(){
        ficha=null;
    }
    public String toString(){
        String result;
        if(ficha==null)
            result=" ";
        else
            result= ficha.toString();
        return result;
    }
}
