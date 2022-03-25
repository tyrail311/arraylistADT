import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayListADT test = new ArrayListADT();
        Scanner scan = new Scanner(System.in);

        String ans = "y";
        int firstLast = 0;
        while (ans.equalsIgnoreCase("y")&& (firstLast <= 2 && firstLast >= 0)) {
            int number;
            System.out.println("Would you like to add a number to the list?");
            ans = scan.next();
            if(ans.equalsIgnoreCase("y")) {
                System.out.println("Please enter the number you would like to enter into the list:");
                number = scan.nextInt();
                System.out.println("Would you like to add in the front (1) or at the end (2)?");
                firstLast = scan.nextInt();
                if(firstLast == 1)
                    test.addFirst(number);
                else
                    test.addLast(number);
                test.display();
            }
            else
            {
                System.out.println("Would you like to remove a number from the list?");
                ans = scan.next();
                if(ans.equalsIgnoreCase("y")){
                    test.delete();
                    test.display();
                }
            }
        }
    }
}
