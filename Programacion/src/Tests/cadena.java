package Tests;
import java.util.Locale;

class cadena {
    public static void main(String[] args) {
//        String Tests.cadena = "Hola Soy Omar";
//        System.out.println(invierteCadena(Tests.cadena));
//        System.out.println(CadenaMinuscula(Tests.cadena));
//        System.out.println(CadenaIndex(Tests.cadena));
//        System.out.println(CadenaLastIndex(Tests.cadena));
        System.out.println("hola".equals("hola"));
        System.out.println("hola".equals("hala"));

    }
    public static String invierteCadena(String cadenaAInvertir) {
        String cadenaInvertida = "";
        int len=cadenaAInvertir.length();
        for (int i = (len-1); i >= 0; i--) {
            cadenaInvertida+=cadenaAInvertir.charAt(i);
        }
        return cadenaInvertida;
    }


    public static String CadenaLastIndex(String cadenaAConvertir) {
        String cadenaConvertida = "";
        cadenaConvertida= String.valueOf(cadenaAConvertir.lastIndexOf("a"));
        return cadenaConvertida;
    }

}
