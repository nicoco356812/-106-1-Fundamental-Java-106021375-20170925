import java.util.Scanner;

public class nicoco2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x=scn.nextInt();
        System.out.println(Math.round(x*0.26418*10)/10f);
    }
}
