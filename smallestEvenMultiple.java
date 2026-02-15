import java.util.Scanner;

public class smallestEvenMultiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        for(int i=1;i<=500;i++){
             if(i%2==0 && i%n==0){
                 System.out.println(i);
		 return ;
            }
        }
        
        System.out.println(-1);
    }
}