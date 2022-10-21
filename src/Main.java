import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double n;
        double toplam=0;
        System.out.println("Harmonik serinin n değerini giriniz: ");
        n= inp.nextInt();

        for (;n>0;n--){
            double a=1/n;
            toplam=toplam+(a);
        }
        System.out.println(toplam);
    }
}