public class Main {
    public static void main(String[] args) {
        DynamicArray n1 = new DynamicArray(2);
        n1.insertarElemento(282);
        n1.insertarElemento(5);
        n1.imprimirArreglo();
        n1.tamañoArreglo();
        n1.eliminarElementoIndice(0);
        n1.tamañoArreglo();
        n1.eliminarUltimoElemento();
        n1.tamañoArreglo();
        n1.imprimirArreglo();
        System.out.println("");

        n1.capacidadArreglo();
        System.out.println("");
        n1.insertarElemento(282);
        n1.insertarElemento(5);
        n1.insertarElemento(8);
        n1.tamañoArreglo();
        n1.capacidadArreglo();
        n1.imprimirArreglo();


    }
}
