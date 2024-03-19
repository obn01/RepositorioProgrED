package Ajedrez;

public class Juego {
    public static void main(String[] args) {
        Integrante arbitro = new Arbitro("Juan");
        Integrante jugador1 = new jugador("Pepe",Color.BLANCO);
        Integrante jugador2 = new jugador("Ana",Color.NEGRO);

        Tablero tablero = new Tablero();

        Ficha ficha01 = new Ficha(TipoFicha.TORRE,Color.BLANCO);
        Ficha ficha02 = new Ficha(TipoFicha.CABALLO,Color.BLANCO);
        Ficha ficha03 = new Ficha(TipoFicha.ALFIL,Color.BLANCO);
        Ficha ficha04 = new Ficha(TipoFicha.REY,Color.BLANCO);
        Ficha ficha05 = new Ficha(TipoFicha.DAMA,Color.BLANCO);
        Ficha ficha06 = new Ficha(TipoFicha.ALFIL,Color.BLANCO);
        Ficha ficha07 = new Ficha(TipoFicha.CABALLO,Color.BLANCO);
        Ficha ficha08 = new Ficha(TipoFicha.TORRE,Color.BLANCO);

        Ficha ficha81 = new Ficha(TipoFicha.TORRE,Color.NEGRO);
        Ficha ficha82 = new Ficha(TipoFicha.CABALLO,Color.NEGRO);
        Ficha ficha83 = new Ficha(TipoFicha.ALFIL,Color.NEGRO);
        Ficha ficha84 = new Ficha(TipoFicha.REY,Color.NEGRO);
        Ficha ficha85 = new Ficha(TipoFicha.DAMA,Color.NEGRO);
        Ficha ficha86 = new Ficha(TipoFicha.ALFIL,Color.NEGRO);
        Ficha ficha87 = new Ficha(TipoFicha.CABALLO,Color.NEGRO);
        Ficha ficha88 = new Ficha(TipoFicha.TORRE,Color.NEGRO);

        Casilla casilla00= new Casilla(ficha01);
        Casilla casilla01= new Casilla(ficha02);
        Casilla casilla02= new Casilla(ficha03);
        Casilla casilla03= new Casilla(ficha04);
        Casilla casilla04= new Casilla(ficha05);
        Casilla casilla05= new Casilla(ficha06);
        Casilla casilla06= new Casilla(ficha07);
        Casilla casilla07= new Casilla(ficha08);

        Casilla casilla70= new Casilla(ficha81);
        Casilla casilla71= new Casilla(ficha82);
        Casilla casilla72= new Casilla(ficha83);
        Casilla casilla73= new Casilla(ficha84);
        Casilla casilla74= new Casilla(ficha85);
        Casilla casilla75= new Casilla(ficha86);
        Casilla casilla76= new Casilla(ficha87);
        Casilla casilla77= new Casilla(ficha88);

        tablero.getCasillas()[0][0]= casilla00;
        tablero.getCasillas()[0][1]= casilla01;
        tablero.getCasillas()[0][2]= casilla02;
        tablero.getCasillas()[0][3]= casilla03;
        tablero.getCasillas()[0][4]= casilla04;
        tablero.getCasillas()[0][5]= casilla05;
        tablero.getCasillas()[0][6]= casilla06;
        tablero.getCasillas()[0][7]= casilla07;

        tablero.getCasillas()[7][0]= casilla70;
        tablero.getCasillas()[7][1]= casilla71;
        tablero.getCasillas()[7][2]= casilla72;
        tablero.getCasillas()[7][3]= casilla73;
        tablero.getCasillas()[7][4]= casilla74;
        tablero.getCasillas()[7][5]= casilla75;
        tablero.getCasillas()[7][6]= casilla76;
        tablero.getCasillas()[7][7]= casilla77;

        for (int i = 0; i < 8; i++) {
            Ficha peonBlanco = new Ficha(TipoFicha.PEON, Color.BLANCO);
            Casilla casillaPeonBlanco = new Casilla(peonBlanco);
            tablero.getCasillas()[1][i] = casillaPeonBlanco;

            Ficha peonNegro = new Ficha(TipoFicha.PEON, Color.NEGRO);
            Casilla casillaPeonNegro = new Casilla(peonNegro);
            tablero.getCasillas()[6][i] = casillaPeonNegro;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <8; j++) {
                if(tablero.getCasillas()[i][j] == null){
                System.out.print("");
                }
                else {
                    System.out.print(tablero.getCasillas()[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
}