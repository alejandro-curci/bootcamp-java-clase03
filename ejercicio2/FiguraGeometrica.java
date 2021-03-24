package ejercicio2;

public abstract class FiguraGeometrica {

    public abstract double area();

    // no tiene sentido sobreescribir este metodo en una clase abstracta
    // no tengo acceso a los campos propios de cada clase hija para personalziar el metodo toString()
    @Override
    public String toString() {
        return "Figura geométrica";
    }


}
