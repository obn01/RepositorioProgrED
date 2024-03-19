package Exepciones;

import java.io.IOException;

public class exeption4 {
    public static void m3(int pVal1, int pVal2) {
        try {
            System.out.println(pVal1/pVal2);
        } catch (ArithmeticException e) {
            System.out.println("estoy en m3" + e.getMessage());
            try {
                //puedo lanzar una excepción que yo quiera
                throw new IOException("le puedo pasar un mensaje");
            } catch (IOException e1) {
                System.out.println("Vuelvo a estar en m3" + e1.getMessage());
            }
        }
    }

    public static void m2(int pVal1, int pVal2) {
        m3(pVal1, pVal2);
    }

    public static void m1(int pVal1, int pVal2) {
        m2(pVal1, pVal2);
    }

    public static void main(String[] args) {
        m1(2225,0);
    }
}
