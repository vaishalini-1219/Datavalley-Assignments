import java.util.*;

public class Main{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the  Array size:");
     int n = sc.nextInt();
     System.out.println("Enter the Array Elements one by one :");
     int arr[] = new int[n+1];
     for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
     }
     System.out.println("Enter a number:");
     int ele = sc.nextInt();
     Arrays.sort(arr);
     System.out.println("The Sorted Array is :");
     for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
     }
     System.out.println();
     int cnt = 0;
     for(int i=0;i<n;i++){
        if(arr[i] > ele){
             break;
        }
        if(arr[i] == ele){
             cnt += 1;
        }
      }
      System.out.println("Number of occurences of the given element is :" + cnt);
    }
}