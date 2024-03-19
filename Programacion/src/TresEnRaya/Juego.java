package TresEnRaya;

public class Juego {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();

        Ficha circulo = new Ficha(TipoFicha.O);
        Ficha circulo2 = new Ficha(TipoFicha.O);
        Ficha circulo3 = new Ficha(TipoFicha.O);

        Ficha cruz = new Ficha(TipoFicha.X);
        Ficha cruz2 = new Ficha(TipoFicha.X);
        Ficha cruz3 = new Ficha(TipoFicha.X);

//        Casilla casilla00 = new Casilla(circulo);
//        Casilla casilla21 = new Casilla(circulo2);
//        Casilla casilla12 = new Casilla(circulo3);
//
//        Casilla casilla20 = new Casilla(cruz);
//        Casilla casilla11 = new Casilla(cruz2);
//        Casilla casilla02 = new Casilla(cruz3);

        tablero.getCasillas()[0][0].setFicha(circulo);
        tablero.getCasillas()[2][1].setFicha(cruz);
        tablero.getCasillas()[1][2].setFicha(circulo);

        tablero.getCasillas()[2][0].setFicha(cruz);
        tablero.getCasillas()[1][1].setFicha(circulo);
        tablero.getCasillas()[0][2].setFicha(cruz);

        tablero.getCasillas()[2][2].setFicha(tablero.getCasillas()[0][2].getFicha());
        tablero.getCasillas()[0][2].setFicha(null);
//        casilla02.setFicha(null);
//        Casilla casilla22 = new Casilla(cruz3);
//        if (tablero.getCasillas()[2][2] == null) {
//            tablero.getCasillas()[2][2]=casilla22;
//        }


//        casilla22.setFicha(null);
//        Casilla casilla01 = new Casilla(cruz3);
//        if (tablero.getCasillas()[0][1] == null) {
//            tablero.getCasillas()[0][1]=casilla01;
//        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero.getCasillas()[i][j]== null)
                    System.out.print("   ");
                else
                    System.out.print(tablero.getCasillas()[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}
