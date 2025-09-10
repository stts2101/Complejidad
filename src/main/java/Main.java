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
        System.out.println("");
        n1.insertarElemento(0);
        n1.insertarElemento(402);
        n1.tamañoArreglo();
        n1.capacidadArreglo();
        n1.imprimirArreglo();
        try {
            DynamicArray n2 = new DynamicArray(50000000);
            n2.setSize(49000000);
            n2.insertarElemento(1);
        }catch (Exception e ){
            System.out.println("Contacte con el proeveedor.");
        }
    }
}
