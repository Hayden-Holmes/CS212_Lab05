public class TaskFive {
    static int c=0;
    static int b=0;
    public static void main(String[] args) {


        String names[] = new String[]{
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma",
                "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int times[] = new int[]{
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317,
                265};

        String fastestName = "";
        int fastestTime = times[0];
        for (int i = 0; i < times.length; i++) {
            if (times[i] < fastestTime) {
                fastestName = names[i];
                fastestTime = times[i];
            }
        }

        String secondName = "";
        int secondTime = times[0];
        for (int i = 0; i < times.length; i++) {
            if (times[i] < secondTime && times[i] != fastestTime) {
                secondName = names[i];
                secondTime = times[i];
            }
        }
        int total = 0;
        for (int i :
                times) {
            total += i;
        }
        double average = ((double) total / (double) times.length);
        for (int i = 0; i < times.length; i++) {
            if (times[i] < average){
                b++;
            }
        }
        String arr[] = new String[b];
        for (int i = 0; i < times.length; i++) {
        if (times[i] < average){
            arr[c]=names[i];
            c++;
        }
    }

        System.out.println("Fastest runner: "+fastestName+" with " + fastestTime+" minutes" );
        System.out.println("Second fastest runner: "+secondName+" with " + secondTime+" minutes" );
        System.out.println("Average time: "+average);
        System.out.println("All runners with better time than average: ");

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
