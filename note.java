package Day6problems;
import java.util.Scanner;
public class note {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the amount to get change:");
        n = obj.nextInt();
        System.out.print("which change to provide in  Rs:1,2,5,10,50,100,500,1000");
        int[] notes = {1, 2, 5, 10, 50, 100, 500, 1000};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the amount to be paid:");
        int amountToBePaid = sc.nextInt();
        System.out.print("Enter the amount given by the customer:");
        int amountGivenByCustomer = sc.nextInt();
        sc.close();
        int change = amountGivenByCustomer - amountToBePaid;
        int[] numberOfNotes = new int[notes.length];
        int totalNumberOfNotes = 0;
        for (int i = 0; i < notes.length; i++) {
            if (change >= notes[i]) {
                numberOfNotes[i] = change / notes[i];
                change -= numberOfNotes[i] * notes[i];
                totalNumberOfNotes += numberOfNotes[i];

            }
        }
        System.out.println("The minimum number of notes to be retured is" + totalNumberOfNotes);
        System.out.println("Denomination of notes");
        for (int i = 0; i < notes.length; i++) {
            if (numberOfNotes[i] != 0) {
                System.out.println(notes[i] + "x" + numberOfNotes[i]);
            }
        }


    }
}
