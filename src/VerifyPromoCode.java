import java.util.Scanner;

public class VerifyPromoCode {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the promo code to verify: ");
        String inpt= sc.nextLine();
        if (inpt.length()==5){
            char a =inpt.charAt(0);
            char b =inpt.charAt(1);
            char c =inpt.charAt(2);
            char d =inpt.charAt(3);
            char e =inpt.charAt(4);
            int t,u,v,w,x;
            t=a;
            u=b;
            v=c;
            w=d;
            x=e;
            int check_digit= ((t+2*u+v+2*w)%26)+65;
            if ((b=='A'||b=='E'||b=='I'||b=='O'||b=='U')&&check_digit==x){
                System.out.println("This is a valid promo code");
            }
            else{
                System.out.println("This is not a valid promo code");
            }
        }
        else{
            System.out.println("This is not a valid promo code");
        }
    }
}
