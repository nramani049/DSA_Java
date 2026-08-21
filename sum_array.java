import java.util.*;

class sum_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for array: ");
        int n= sc.nextInt();
        String arr[]= new String[n];

        for(int i=0; i<n;i++){
            arr[i]= sc.next();
        }

        for(int i=0; i<n;i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}