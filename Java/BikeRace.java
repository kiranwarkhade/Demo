
 import java.util.Scanner;


 public class BikeRace{
     public static void main (String[] args) {
         int r,pdeven=1,pdodd=1;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the distance travelled");
         int dist = sc.nextInt();
        if(dist<0)
         {
            System.out.println("Invalid Input");
        }
        else if(dist==0){
            System.out.println("Your bonus points is 0");
        }
        else{
            
            while(dist>0)
            {
             r= dist%10;
             pdeven*=r;
             dist/=10;
             if(dist>0){
                 r=dist%10;
                 pdodd*=r;
                 dist/=10;
             }
            }
            if(pdeven==pdodd){
                System.out.println("Your bonus points is "+(pdeven*2));
            }
            else if(pdeven>pdodd){
                System.out.println("Your bonus points is "+(pdeven));
            }
            else{
                System.out.println("Your bonus points is "+(pdodd));
            }
        }
     }
    }

