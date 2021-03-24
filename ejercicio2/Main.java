package ejercicio2;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new Triangulo(3, 5);
        FiguraGeometrica rectangulo = new Rectangulo(4, 7);
        FiguraGeometrica circulo = new Circulo(6);

        FiguraGeometrica lista[] = {triangulo, rectangulo, circulo};
        FiguraUtil.mostrarAreas(lista);
        System.out.println("\nArea promedio = " + FiguraUtil.areaPromedio(lista));

    }
}
