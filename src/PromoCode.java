import java.util.Random;
import java.util.Scanner;


public class PromoCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many codes do you want to generate: ");
        int inpt= sc.nextInt();
        Random rnd = new Random();
        for(int k=0;k<inpt;k++){
            char randomChar1;
            char randomChar2;
            char randomChar3;
            char randomChar4;
            while(true) {
                randomChar1 = (char) (65 + rnd.nextInt(24));

                if(randomChar1!='A'||randomChar1!='E'||randomChar1!='I'||randomChar1!='O'||randomChar1!='U'){
                    break;
                }
            }
            while(true) {
                randomChar2 = (char) ('A' + rnd.nextInt(25));

                if(randomChar2=='A'||randomChar2=='E'||randomChar2=='I'||randomChar2=='O'||randomChar2=='U'){
                    break;
                }
            }
            while(true) {
                randomChar3 = (char) ('A' + rnd.nextInt(25));

                if(!(randomChar3 == 'A' && randomChar3 == 'E' && randomChar3 == 'I' && randomChar3 == 'O' && randomChar3 == 'U')){
                    break;
                }
            }
            while(true) {
                randomChar4 = (char) ('A' + rnd.nextInt(26));

                if(randomChar4=='A'||randomChar4=='E'||randomChar4=='I'||randomChar4=='O'||randomChar4=='U'||randomChar4=='Y'){
                    break;
                }
            }
            int x, y , z,a,b;
            x= randomChar1;
            y=randomChar2;
            z=randomChar3;
            a=randomChar4;
            b= ((x+z+2*y+2*a)%26)+65;
            char randomchar5 = (char)b;

            System.out.println("  Promo Code is "+randomChar1+randomChar2+randomChar3+randomChar4+randomchar5);
        }
    }

}
