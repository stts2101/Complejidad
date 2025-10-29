public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 10};
        int att = BinarySearch.bs(arr, 10, 0, arr.length - 1);
        System.out.println("indexMiddle =  " + att);
        if (att > 0)
            System.out.println("Arr[indexMiddle]=  " + arr[att]);
        System.out.println("============");
        int aty = bs(arr, 22, 0, arr.length - 1);
        if (aty > 0) {
            System.out.println("Arr[indexMiddle]=  " + aty);
        } else {
            System.out.println("Arr[indexMiddle]= " + aty + " No esta dentro del arreglo");
        }
    }

    public static int bs(int[] a, int target, int start, int end) {
        if (start > end)
            return -1;
        int middle = (start + end) / 2;
        if (target == a[middle])
            return middle;
        if (target > a[middle])
            return bs(a, target, middle + 1, end);
        else
            return bs(a, target, start, middle - 1);
    }
}
