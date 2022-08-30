package HeighestProduct;

import java.util.Arrays;

/**
 * The type Product.
 */
public class Product {
    /**
     * Max product int.
     *
     * @param arr the arr
     * @param n   the n
     * @return the int
     */
    static int maxProduct(int arr[], int n) {

            if (n < 3) {
                return -1;
            }
            Arrays.sort(arr);
            return Math.max(arr[0] * arr[1] * arr[n - 1],
                    arr[n - 1] * arr[n - 2] * arr[n - 3]);
        }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
            int arr[] = {3,5,2,1,0};
            int n = arr.length;

            int max = maxProduct(arr, n);

            if (max == -1) {
                System.out.println("No Triplet Exists");
            } else {
                System.out.println("Maximum product is " + max);
            }

        }
    }



