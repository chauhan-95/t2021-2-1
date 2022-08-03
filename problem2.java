import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  a=sc.nextInt();
        int i=1;
        int count=0;
        while(count<a){
            if(i%2==1){
                count++;
                System.out.print(i+" ");

            }
            i++;
        }
        System.out.println();
    }
}
