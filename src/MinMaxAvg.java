import java.util.Arrays;

public class MinMaxAvg {

    // A function that takes a string array of elements which can be converted to doubles
    // (for example, doubles given in the command line parameter array).
    // It converts them to doubles, finds the average, minimum, and maximum of the double array,
    // and prints min, max, and average in the terminal.
    static void printMinMaxAvg(String[] inputArgs) {
        // Initialize double array (same size as input string array)
        double[] data = new double[inputArgs.length];
        // Change initial array values to input array values converted to strings
        // NOTE: no exceptions are handled in this step. Illegal values will raise NumberFormatException
        // and terminate the program.
        for (int i = 0; i < inputArgs.length; i++) {
            data[i] = Double.parseDouble(inputArgs[i]);
        }
        // Calculate a sum of double array elements.
        double sum = 0;
        for (double i :
                data) {
            sum += i;
        }
        // Calculate a mean of double array elements.
        double avg = sum / data.length;
        // Use sorting function to sort in ascending order.
        Arrays.sort(data);
        // Get smallest element in the double array
        double min = data[0];
        // Get largest element in the double array
        double max = data[data.length - 1];

        // Print min, max, and avg
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + avg);
    }

    public static void main(String[] args) {
        printMinMaxAvg(args);
    }
}
