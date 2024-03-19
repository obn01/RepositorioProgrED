package Colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ColCochesEj1 {
    public static void main(String[] Args) {
        ColCoches colCoches = new ColCoches();
        colCoches.aniadir( new Coche("107890KFG"));
        colCoches.aniadir( new Coche("453124SDG"));
        colCoches.aniadir( new Coche("107890KFG"));
        colCoches.aniadir( new Coche("390284HJL"));
        colCoches.recorrer();

        System.out.println("----------------------");
        Coche cocheEliminado = new Coche("390284HJL");
        colCoches.eliminar(cocheEliminado);
        colCoches.recorrer();

    }
}
class Coche {
    String matricula;

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coche Coche)) return false;
        return Objects.equals(matricula, Coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return matricula;
    }
}
class ColCoches {
    List<Coche> colCoches = new ArrayList<>();
    public boolean aniadir(Coche coche){
        boolean aniadido = false;
        if (!colCoches.contains(coche)) {
            colCoches.add(coche);
            aniadido=true;
        }
        return aniadido;
    }

    public void recorrer(){
        for (Coche coche:colCoches) {
            System.out.println("la matricula es " + coche);
        }
    }
    public boolean  eliminar(Coche coche){
        return colCoches.remove(coche);
    }
}