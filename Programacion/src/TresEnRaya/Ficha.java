package TresEnRaya;

public class Ficha {
    TipoFicha tipoFicha;


    public Ficha(TipoFicha tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    @Override
        public String toString() { return tipoFicha.toString(); }
}
