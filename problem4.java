import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],0);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<n;j++){
                if(input[j]%arr[i]==0){
                    h.put(arr[i],h.getOrDefault(arr[i],0)+1);
                }
            }
        }
        System.out.println(h);
    }
}
