import java.util.Scanner;
class Lab4T3{

    public static void main(String[] args) {

        int num, count, total = 0;
        System.out.println("Enter the value of n:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.close();
        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of N "+num+" is: "+total);
    }
}