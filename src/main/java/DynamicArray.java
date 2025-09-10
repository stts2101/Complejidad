import java.util.Arrays;

public class DynamicArray {
    private int[] arreglo;
    private int size;
    private int capacity;

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

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arreglo = new int[capacity];
    }

    public void eliminarUltimoElemento() {
        arreglo[size] = 0;
        size--;
        // arreglo[ arreglo.length-1 ] = 0;

        System.out.println("Ultimo elemento eliminado.");
    }
    public void eliminarElementoIndice(int indice){
        System.out.println("Elemento en indice '"+indice+"' eliminado.");
        size--;
        arreglo[indice] = 0 ;
    }
    public void insertarElemento(int n){
       // this.arreglo[indice] = n ;
        if (size==capacity){
            int op = capacity * 2;
            int[] trace = Arrays.copyOf(arreglo, op);
            this.arreglo = trace;
            this.capacity = op;
            System.out.println("Arreglo lleno, se duplico el tamaño a: " + capacity);
        }
        arreglo[size] = n;
        System.out.println("Elemento "+ n +" agregado.");
        size++;

    }
    public int obtenerElemento(int n){
        return arreglo[n];

    }
    public String imprimirArreglo(){
        System.out.println( Arrays.toString(this.arreglo)  );
        return Arrays.toString(this.arreglo);
    }
    public int tamañoArreglo(){
        System.out.println("Numero de elementos en el arreglo: " + this.size);
        return this.size;
    }
    public int capacidadArreglo(){
        System.out.println("Capacidad maxima del arreglo: " + capacity );
        return capacity;

    }



}
