// This program demonstrates nested while loops in Java.
class loop {
    public static void main(String[] args) {
        int n = 1;  // Initialize the outer loop counter
        // Outer while loop iterating from n=1 to n=5
        while (n <= 5) {
            System.out.println("hi" + n);  // Print "hi" followed by the current value of n
            int j = 1;  // Initialize the inner loop counter
            // Inner while loop iterating from j=1 to j=3
            while (j <= 3) {
                System.out.println("bye" + j);  // Print "bye" followed by the current value of j
                j++;  // Increment the inner loop counter
            }
            n++;  // Increment the outer loop counter
        }
    }
}