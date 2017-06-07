package alg;

public class Shell extends Sort{

    @Override
    public void sort(Comparable[] a){
        int n = a.length;
        int h = 1;
        while(h < n)h = 3*h + 1;
        while(h >= 1){
            for(int i=h; i<n; i++){
                
                for(int j=i+1; j>=h && less(a[j], a[j-h]); j-=h){
                    exch(a, j, j-h);
                }
            }
            h /= 3;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,5,3,2,10,3,13,23,11,7};
        Shell shell = new Shell();

        shell.sort(array);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    private void sort(int[] array) {
        int n = array.length;
        int h = 1;
        while(h < n) h = 3*h + 1;
        while(h >= 1){
            for(int i=h; i<n; i++){
                for(int j=i; j>=h && array[j] < array[j-h]; j-=h){
                    swap(array, j, j-h);
                }
            }
            h = h/3;
        }
    }

    private void swap(int[] array, int j, int i) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }


}
