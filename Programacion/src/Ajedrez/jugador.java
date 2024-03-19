package Ajedrez;

public class jugador extends Integrante {
    private String categoria;
    Color colorJugador;

    public jugador(String nombre, Color colorJugador) {
        super(nombre);
        this.colorJugador = colorJugador;
    }
}