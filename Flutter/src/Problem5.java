import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int k =0;k <t;k++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int otv = n - 1;
            ArrayList<int[]> action = new ArrayList<int[]>();
            permute(a, action);
            for (int i = 0; i < action.size(); i++) {
                for (int j = 0; j < n; j++) {
                    if (n == 2) {
                        if (action.get(i)[j] == action.get(i)[j + 1]) {
                            otv = Math.min(otv, 0);
                            break;
                        } else {
                            otv = Math.min(otv, 1);
                            break;
                        }
                    }
                    if (n == 3) {
                        if (action.get(i)[0] == action.get(i)[1] && action.get(i)[1] == action.get(i)[2]) {
                            otv = Math.min(otv, 0);
                            break;
                        }
                        if (action.get(i)[1] - action.get(i)[0] == action.get(i)[2] - action.get(i)[1]) {
                            otv = Math.min(otv, 1);
                            break;
                        }
                    }
                    if (n == 4) {
                        if (action.get(i)[0] == action.get(i)[1] && action.get(i)[1] == action.get(i)[2] && action.get(i)[2] == action.get(i)[3]) {
                            otv = Math.min(otv, 0);
                            break;
                        }
                        if (action.get(i)[1] - action.get(i)[0] == action.get(i)[2] - action.get(i)[1] && action.get(i)[2] - action.get(i)[1] == action.get(i)[3] - action.get(i)[2]) {
                            otv = Math.min(otv, 1);
                            break;
                        }
                        if (action.get(i)[2] - action.get(i)[1] * 2 + action.get(i)[0] == action.get(i)[3] - action.get(i)[2] * 2 + action.get(i)[1]) {
                            otv = Math.min(otv, 2);
                            break;
                        }
                    }
                    if (n == 5) {
                        if (action.get(i)[0] == action.get(i)[1] && action.get(i)[1] == action.get(i)[2] && action.get(i)[2] == action.get(i)[3] && action.get(i)[3] == action.get(i)[4]) {
                            otv = Math.min(otv, 0);
                            break;
                        }
                        if (action.get(i)[1] - action.get(i)[0] == action.get(i)[2] - action.get(i)[1] && action.get(i)[2] - action.get(i)[1] == action.get(i)[3] - action.get(i)[2] && action.get(i)[4] - action.get(i)[3] == action.get(i)[3] - action.get(i)[2]) {
                            otv = Math.min(otv, 1);
                            break;
                        }
                        if (action.get(i)[2] - action.get(i)[1] * 2 + action.get(i)[0] == action.get(i)[3] - action.get(i)[2] * 2 + action.get(i)[1] && action.get(i)[3] - action.get(i)[2] * 2 + action.get(i)[1] == action.get(i)[4] - action.get(i)[3] * 2 + action.get(i)[2]) {
                            otv = Math.min(otv, 2);
                            break;
                        }
                        if (action.get(i)[3] - action.get(i)[2] * 3 + 3 * action.get(i)[1] - action.get(i)[0] == action.get(i)[4] - action.get(i)[3] * 3 + 3 * action.get(i)[2] - action.get(i)[1]) {
                            otv = Math.min(otv, 3);
                            break;
                        }
                    }
                    if (n == 6) {
                        if (action.get(i)[0] == action.get(i)[1] && action.get(i)[1] == action.get(i)[2] && action.get(i)[2] == action.get(i)[3] && action.get(i)[3] == action.get(i)[4] && action.get(i)[4] == action.get(i)[5]) {
                            otv = Math.min(otv, 0);
                            break;
                        }
                        if (action.get(i)[1] - action.get(i)[0] == action.get(i)[2] - action.get(i)[1] && action.get(i)[2] - action.get(i)[1] == action.get(i)[3] - action.get(i)[2] && action.get(i)[4] - action.get(i)[3] == action.get(i)[3] - action.get(i)[2] && action.get(i)[4] - action.get(i)[3] == action.get(i)[5] - action.get(i)[4]) {
                            otv = Math.min(otv, 1);
                            break;
                        }
                        if (action.get(i)[2] - action.get(i)[1] * 2 + action.get(i)[0] == action.get(i)[3] - action.get(i)[2] * 2 + action.get(i)[1] && action.get(i)[3] - action.get(i)[2] * 2 + action.get(i)[1] == action.get(i)[4] - action.get(i)[3] * 2 + action.get(i)[2] && action.get(i)[4] - action.get(i)[3] * 2 + action.get(i)[2] == action.get(i)[5] - action.get(i)[4] * 2 + action.get(i)[3]) {
                            otv = Math.min(otv, 2);
                            break;
                        }
                        if (action.get(i)[3] - action.get(i)[2] * 3 + 3 * action.get(i)[1] - action.get(i)[0] == action.get(i)[4] - action.get(i)[3] * 3 + 3 * action.get(i)[2] - action.get(i)[1] && action.get(i)[4] - action.get(i)[3] * 3 + 3 * action.get(i)[2] - action.get(i)[1] == action.get(i)[5] - action.get(i)[4] * 3 + 3 * action.get(i)[3] - action.get(i)[2]) {
                            otv = Math.min(otv, 3);
                            break;
                        }
                        if (action.get(i)[4] - 4 * action.get(i)[3] + 6 * action.get(i)[2] - 4 * action.get(i)[1] + action.get(i)[0] == action.get(i)[5] - 4 * action.get(i)[4] + 6 * action.get(i)[3] - 4 * action.get(i)[2] + action.get(i)[1]) {
                            otv = Math.min(otv, 4);
                            break;
                        }
                    }
                }
            }

            out.println(otv);
        }
        out.flush();
        out.close();

    }

    public static void permute(int[] arr, ArrayList<int[]> action) {
        permuteHelper(arr, 0, action);
    }

    private static void permuteHelper(int[] arr, int index, ArrayList<int[]> action) {

        if (index >= arr.length - 1) { //If we are at the last element - nothing left to permute
            int[] narr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                narr[i] = arr[i];
            }
            action.add(narr);
        }

        for (int i = index; i < arr.length; i++) { //For each index in the sub array arr[index...end]

            //Swap the elements at indices index and i
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;

            //Recurse on the sub array arr[index+1...end]
            permuteHelper(arr, index + 1, action);

            //Swap the elements back
            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }


}


