import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of items ");
        int numItems = in.nextInt();
        int intArray[] = new int[numItems];
        System.out.print("Enter "+ numItems +" numbers ");
        for(int i=0; i<numItems; i++)
        {
            intArray[i]=in.nextInt();
        }
        int total=0;
        for (int i:intArray) {
            total+=i;
        }

        Arrays.sort(intArray);

        System.out.println("Mean: "+(double)total/(double)numItems);
        System.out.println("Highest: "+intArray[numItems-1]);
        System.out.println("Lowest: "+ intArray[0]);
    }

}
