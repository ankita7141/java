import java.util.Scanner;

public class string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

        
            if ((i > 0 && str.charAt(i) == str.charAt(i - 1)) ||
                (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1))) {

                continue;
            }

            result = result + str.charAt(i);
        }

        System.out.println("Output: " + result);
    }
}