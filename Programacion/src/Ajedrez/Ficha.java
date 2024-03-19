package Ajedrez;

public class Ficha {
    TipoFicha tipoFicha;
    Color colorFicha;

    public Ficha(TipoFicha tipoFicha, Color colorFicha) {
        this.tipoFicha = tipoFicha;
        this.colorFicha = colorFicha;
    }
    public String toString(){
        return tipoFicha.toString().substring(0,1)+colorFicha.toString().substring(0,1);
    }
}
