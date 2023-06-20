import java.util.Scanner;

public class BirthMonth {

    public static void main(String[] args) {
        int birthMonth;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your birth month (1-12):");
        birthMonth= in.nextInt();

        if ((birthMonth >= 1) && (birthMonth<=12)) {
            System.out.println("Your birth month is: "+birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: "+birthMonth);
        }

    }
}
