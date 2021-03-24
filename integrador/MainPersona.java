package integrador;

public class MainPersona {
    public static void main(String[] args) {
        Persona jorge = new Persona("Jorge", 35504932);
        Persona carlos = new Persona("Carlos", 27809192);
        Persona rodri = new Persona("Rodrigo", 42765092);
        Persona santi = new Persona("Santiago", 16002398);

        Persona lista[] = {jorge, carlos, rodri, santi};

        System.out.println("Antes de ordenar...");
        SortUtil.mostrarLista(lista);
        System.out.println("Luego de ordenar...");
        SortUtil.ordenar(lista);
        SortUtil.mostrarLista(lista);
    }
}
