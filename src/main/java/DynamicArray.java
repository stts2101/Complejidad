import java.util.Arrays;

public class DynamicArray {
    private int[] arreglo;
    private int size;
    private int capacity;
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
        if(capacity*2>=52000000){
            System.out.println("Tamaño maximo es " +  52000000);
            throw new RuntimeException("Limite de tamaño superado");
        }
        if (size==capacity){
            this.arreglo = Arrays.copyOf(arreglo, capacity*2);
            this.capacity*= 2;
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

    public void setSize(int size) {
        this.size = size;
    }
}
