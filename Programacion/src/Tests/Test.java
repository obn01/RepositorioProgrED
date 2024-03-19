package Tests;

class Figura{
    private String colorBorde="negro";
    public Figura(){
        this.colorBorde="white";
    }

    public Figura(String colorBorde){
        this.colorBorde=colorBorde;
    }

     public String getColorBorde() {
         return colorBorde;
     }

     public void setcolorBorde(String colorBorde){
        this.colorBorde = colorBorde;
    }
}
class FiguraCerrada extends Figura{
    private String  colorFondo=" verde";

    public String getColorFondo() {
        return colorFondo;
    }

}
class FiguraAbierta extends Figura{
    private String GrosorBorde = "2 cm";

    public String getGrosorBorde(){
        return GrosorBorde;
    }
}
class Rectangulo extends FiguraCerrada{
    private int altura,base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    public int getAreaRectangulo() {
        return base*altura;
    }
}
class Cuadrado extends FiguraCerrada{
    private int lado1,lado2;

    public Cuadrado(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public int getAreaCuadrado() {
        return lado1*lado2;
    }
}
 public class Test {
    public static  void  main(String[] args){
//        Tests.FiguraCerrada figCerrada = new Tests.FiguraCerrada();
//        System.out.println(figCerrada.getColorBorde());
//        System.out.println(figCerrada.getColorFondo());
//        System.out.println(figCerrada.getColorBorde());
//        Tests.FiguraAbierta figAbierta = new Tests.FiguraAbierta();
//        System.out.println(figAbierta.getGrosorBorde());
        Rectangulo figRect = new Rectangulo(6,5);
        System.out.println("El area  del rectangulo son: "+figRect.getAreaRectangulo()+"cm");
        Cuadrado figCuad = new Cuadrado(5,5);
        System.out.println("El area del cuadrado son: "+figCuad.getAreaCuadrado()+"cm");


    }
 }


