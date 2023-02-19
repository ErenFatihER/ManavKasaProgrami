import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c,d,e,toplam;
        System.out.print("Armut kaç kilo=");
        a=input.nextDouble();
        System.out.print("Elma kaç kilo=");
        b=input.nextDouble();
        System.out.print("Domates kaç kilo=");
        c=input.nextDouble();
        System.out.print("Muz kaç kilo=");
        d=input.nextDouble();
        System.out.print("Patlıcan kaç kilo=");
        e=input.nextDouble();
        toplam=a*2.14+b*3.67+c*1.1+d*0.95+e*5;
        System.out.print("Toplam Tutar="+toplam);



    }
}