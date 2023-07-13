import java.util.Arrays;

public class App {

    // a function for making the random array
    public static double[] ranArray() {
        // making the array with a random amout of lenth ( between 100 -1000 )
        double[] nums = new double[((int)Math.random()*900)+100];
        // making every item in the array a double between 0 - 1000
        for (int i=0;i<nums.length;i++){
            nums[i] = Math.random()*1000;
        }
        // returning the array
        return nums;
    }

    // a function for finding the avrage of an array
    public static double avr(double[] nums) {
        // returning the sum devided by the array length
        return sum(nums)/nums.length;
    } 

    // a function to find the maximum number in the array
    public static double max(double[] nums) {
        // setting up a variable to test who is the biggest number
        double biggestNum = nums[0];
        // making a for loop to search between all of the numbers in the array who is the biggest
        for (int i=0;i<nums.length;i++){
            if (biggestNum < nums[i]){
                biggestNum = nums[i];
            }
        }
        // returning the biggest number
        return biggestNum;
    }

    // a function to find the minimum number in the array
    public static double min(double[] nums) {
        // setting up a variable to test who is the smallest number
        double smallestNum = nums[0];
        // making a for loop to search between all of the numbers in the array who is the smallest
        for (int i=0;i<nums.length;i++){
            if (smallestNum > nums[i]){
                smallestNum = nums[i];
            }
        }
        // returning the smallest number
        return smallestNum;
    }

    // a function to find the sum of all of the array
    public static double sum(double[] nums) {
        // setting up a sum variable
        double sum = 0;
        // adding up all of the items
        for (int i=0;i<nums.length;i++){
            sum+= nums[i];
        }
        // returning the sum variable
        return sum;
    }

    // a function to find the median
    public static double med(double[] nums) {
        // sorting the array by smalles to largest
        Arrays.sort(nums);
        // if the array lenth is even then the code needs to get the avrage of the middle items in the array
        if (nums.length%2==0){
            double[] x = {nums[((int)nums.length/2)-1] , nums[(int)nums.length/2]};
            // returning the avrage
            return avr(x);
        // if the array is odd then the code needs to get the middle item in the array 
        } else if (nums.length%2==1){
            // returning the middle item
            return nums[((int)nums.length/2)];
        // because the code is dumb it is thinks there is a way a full number could be neither odd or even at the same time so if its somehow happens the code will return -1 for error
        } else {return -1;}
    }

    // main function
    public static void main(String[] args) throws Exception {
        // setting up a variable for the options
        String options;
        // setting up the list with the function ranArray
        double[] nums = ranArray();
        // making a while loop in case the user doesn't choose on of the options
        while (true){
            // showing the user all of the options and letting them choose what they want to see
            options = System.console().readLine("enter the objective you want to see:\n1. avrage\n2. maximum\n3. minimum\n4. summery\n5. median\n   ");
            // making a switch for all of the possible options that could happen
            switch(options){
                // case for avrage
                case "1", "avrage", "avr":
                    System.out.println(avr(nums));
                    break;
                // case for maximum
                case "2", "maximum", "max":
                    System.out.println(max(nums));
                    break;
                // case for minimum
                case "3", "minimum", "min":
                    System.out.println(min(nums));
                    break;
                // case for sum
                case "4", "summery", "sum":
                    System.out.println(sum(nums));
                    break;
                // case for median
                case "5", "median", "med":
                    System.out.println(med(nums));
                    break;
                // and a default case in case the user did not choose on of the options and start the while loop back
                default:
                    System.out.println("couldn\'t understand the answer please try again");
                    continue;
            }
            // break the while loop in case the user choose on of the options
            break;
        }
    }
}