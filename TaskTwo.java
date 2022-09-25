import java.util.Scanner;


public class TaskTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        System.out.print("Enter size of arrays: ");
        int size = in.nextInt();
        int vec1[] = new int[size];
        int vec2[] = new int[size];
        System.out.println("Enter "+ size+  " coefficients of the first vector: ");
        for(int i=0; i<size; i++)
        {
            vec1[i]=in.nextInt();
        }
        System.out.println("Enter "+ size+ " coefficients of the second vector: ");
        for(int i=0; i<size; i++)
        {
            vec2[i]=in.nextInt();
        }
        int total=0;
        for(int i=0; i<size; i++){
            total+=  Math.pow(vec1[i]-vec2[i],2);
        }
        System.out.println("The Euclidean distance is: "+(int)Math.sqrt(total));


    }
}
