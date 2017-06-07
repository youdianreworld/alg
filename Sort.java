package alg;

public class Sort {

    public void sort(Comparable[] a){
        System.out.println("You need implement the method!");
    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    public static void exch(Comparable[] a, int i, int j){

        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean isSort(Comparable[] a){
        for(int i=1; i<a.length; i++){
            if(less(a[i], a[i-1]))return false;
        }
        return true;
    }
}
