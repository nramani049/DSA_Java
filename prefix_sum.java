import java.util.*;

class prefix_sum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.io);
        System.out.println("Enter array size:");
        int n=sc.nextInt();

        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int[] prefix_sum=new int[n];
        prefix_sum[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix_sum[i]=prefix_sum[i-1]+arr[i];
        }

        System.out.println("Prefix sum array:");
        for(int i=0;i<n;i++){
            System.out.print(prefix_sum[i]+" ");
        }
        sc.close();
    }
}