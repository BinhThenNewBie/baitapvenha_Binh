

package lab_madebybinh;
import java.util.Scanner;

public class baitapjava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int S = 0;
        System.out.println("Hay nhap gia tri cho n");
        n = scan.nextInt();
            System.out.println("Cac so le tu 1 den " + n + " la: ");
        
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                System.out.printf(" " + i);
                S += i++;
            }
        }
        System.out.println("\nTong gia tri cac so le tu 1 den " + n + " la: " + S);
        int chia;
        chia = S % 3;
        if (chia == 0) {
            System.out.println("so "+ S + " chia het cho 3");
            }else{
            System.out.println("So S sau khi tru 10 = " + (S - 10)  );
        }
            }
        
         
    }
    

