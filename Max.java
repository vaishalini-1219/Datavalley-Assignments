import java.util.*;

public class Main{    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements one by one  :");
        int arr[] = new int[n+1];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println("Maximum element in the given array : " + arr[n-1]);
    }
    
}