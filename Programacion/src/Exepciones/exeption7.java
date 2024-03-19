package Exepciones;

class ExcepcionPersonalizada extends Exception {
    ExcepcionPersonalizada() {
        super("Mensaje por defecto");
    }

    ExcepcionPersonalizada(String msg) {
        super(msg);
    }
}

public class exeption7 {
    public static void main(String[] args) {
        try {
            throw new ExcepcionPersonalizada();
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExcepcionPersonalizada("Mensaje personalizado");
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }
}


