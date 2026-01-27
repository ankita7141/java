import java.util.Scanner;

class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
    }
}
