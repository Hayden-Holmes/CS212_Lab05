public class TaskFour {
    static public int[] sumArrays(int[] a, int[] b, int size){
        int newArr[]=new int[size];
        for(int i=0; i<size; i++){
            newArr[i]=a[i]+b[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int newArr[]= new int[]{1,2,3};
        int secArr[]= new int[]{13,4,30};

        int newestArr[]=(sumArrays(newArr, secArr, 3));
        for (int i=0;i<newestArr.length; i++) {
            System.out.print(newestArr[i]);
            if(i<newestArr.length-1){
                System.out.print(", ");
            }
        }
    }
}
