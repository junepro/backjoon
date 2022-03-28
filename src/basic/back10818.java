package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class back10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[n - 1]);
    }
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    int n = Integer.parseInt(br.readLine());
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//    int[] box = new int[n];
//
//        for (int i = 0; i < n; i++) {
//        box[i] = Integer.parseInt(st.nextToken());
//        //  System.out.print(box[i]+" ");
//    }
//        Arrays.sort(box);
//
//        System.out.println(box[0] + " " + box[n - 1]);;
}
