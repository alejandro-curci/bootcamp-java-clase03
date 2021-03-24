package integrador;

public class MainCelular {
    public static void main(String[] args) {
        Celular movistar = new Celular( 155673829, "Jorge");
        Celular claro = new Celular( 155902398, "Carlos");
        Celular tuenti = new Celular( 155439028, "Rodrigo");
        Celular personal = new Celular(155293789, "Alan");

        Celular lista[] = {movistar, claro, tuenti, personal};

        System.out.println("Antes de ordenar...");
        SortUtil.mostrarLista(lista);
        System.out.println("Luego de ordenar...");
        SortUtil.ordenar(lista);
        SortUtil.mostrarLista(lista);
    }
}
