import java.util.*;

class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            if(arr[start]!=arr[end]){
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
}