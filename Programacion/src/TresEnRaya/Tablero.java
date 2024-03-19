package TresEnRaya;

public class Tablero {
   private Casilla[][] casillas= new Casilla[3][3];

    public Tablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j]=new Casilla();
            }
        }
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }
}
