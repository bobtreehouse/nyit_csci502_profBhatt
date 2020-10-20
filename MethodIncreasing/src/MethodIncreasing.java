
class MethodIncreasing {
    // return true if each value in the given array is greater tha nthe one before it
	// false other wise
    static boolean isStrictlyIncreasing(double in[], int n)
    {
        // Array has one or no element or the
        // rest are already checked and approved.
        if (n == 1 || n == 0)
            return true;
 
        // Unsorted pair found (Equal values allowed)
        if (in[n - 1] < in[n - 2])
            return false;
 
        // Last pair was sorted
        // Keep on checking
        return isStrictlyIncreasing(in, n - 1);
    }
 
    // main function
    public static void main(String[] args)
    {
        double in[] = { 20.1, 23.4, 22.9, 45.5, 78.0, 88.9 };
        int n = in.length;
        if (isStrictlyIncreasing(in, n) != false)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
