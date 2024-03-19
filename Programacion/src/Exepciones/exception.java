package Exepciones;

public class exception {
    public static void m3(int pVal1, int pVal2) {
        try {
            System.out.println(pVal1 / pVal2);
        } catch (ArithmeticException e) {
            System.out.println("estoy en m3" + e.getMessage());
            throw e;
        }
    }

    public static void m2(int pVal1, int pVal2) {
        try {
            m3(pVal1, pVal2);
        } catch (ArithmeticException e) {
            System.out.println("estoy en m2 porque m3 lanzó la excepción que se generó");
        }
    }

    public static void m1(int pVal1, int pVal2) {
        m2(pVal1, pVal2);
    }

    public static void main(String[] args) {
        m1(2225, 0);
    }
}
