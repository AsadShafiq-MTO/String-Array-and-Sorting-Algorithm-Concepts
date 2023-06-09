package problem1;


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
      // porpostion  of positive numbers 
        // porpostion of negative  numbers
        // zeros
        int positive_numbers=0;
        int negative_numbers=0;
        int zero_numbers=0;
        int total_numbers=arr.size();
        
        for(Integer var: arr) {
             if(var ==0) {
                 zero_numbers=zero_numbers+1;
             }
             else if(var <0) {
                 negative_numbers=negative_numbers+1;
             }else {
                 positive_numbers=positive_numbers+1;
             }
         }
     double positive=(double)positive_numbers/total_numbers; 
     double negative=(double)negative_numbers/total_numbers; 
     double zeros=(double)zero_numbers/total_numbers; 
     
     System.out.println(String.format("%.6f",positive));
     System.out.println(String.format("%.6f",negative));
     System.out.println(String.format("%.6f",zeros));
      

    }

}

public class problem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine() 
            .replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
