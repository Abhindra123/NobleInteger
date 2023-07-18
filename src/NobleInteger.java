import java.util.Scanner;


public class NobleInteger {

        public static int nobleInteger(int arr[]){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    int temp=0;
                    if(arr[i]>arr[j]){
                        temp=arr[j];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            int count=0;
            int n=arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]==n-1-i){
                    count=count+1;
                }
            }
            if(count<=0){
                return -1;
            }
            return count;


        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int val=nobleInteger(arr);
        System.out.println("The value is : "+val);

    }
}