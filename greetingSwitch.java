
import java.util.Scanner;

class greetingSwitch{
    public static void main(String[] args) {
        
        System.out.println("enter button (1-3) for greeting ");
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1:
                System.out.println("good morning!");
                break;
                case 2:
                    System.out.println("ohayo gozaimasu!");
                    break;
                    case 3:
                        System.out.println("zao shang hao!");
                        break;
                        default:
                            System.out.println("please enter valid input!");
        }
    }
}