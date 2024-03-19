package Ajedrez;

public class Tablero {

    public Casilla[][] getCasillas() {
        return casillas;
    }

    private Casilla[][] casillas = new Casilla[8][8];


    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }
}

