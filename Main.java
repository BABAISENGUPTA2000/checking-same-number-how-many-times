package same_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //   check how many times the same number is ---
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x = sc.nextInt();
        int count=0;
        while (n>0){
            int rem=n%10;
            if(rem==x){
                count++;
            }
            n=n/10;
        }

        System.out.println(count);
    }
}
