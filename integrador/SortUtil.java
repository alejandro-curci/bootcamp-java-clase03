package integrador;

public class SortUtil {

    public static void ordenar(Precedable arr[]) {
        Precedable aux;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j+1].precedeA(arr[j])<0) {
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public static void mostrarLista(Precedable arr[]) {
        for(Precedable p : arr) {
            System.out.println(p);
        }
        System.out.println();
    }
}
