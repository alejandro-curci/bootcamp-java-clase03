package ejercicio2;

public class FiguraUtil {

    public static double areaPromedio(FiguraGeometrica arr[]) {
        double areaTotal = 0;
        for (FiguraGeometrica f : arr) {
            areaTotal += f.area();
        }
        return areaTotal / arr.length;
    }

    public static void mostrarAreas(FiguraGeometrica arr[]) {
        for (FiguraGeometrica f : arr) {
            System.out.println("Area de " + f.toString() + " = " + f.area());
        }
    }
}
