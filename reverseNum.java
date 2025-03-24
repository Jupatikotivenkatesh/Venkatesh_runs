import java.util.Scanner;

class reverseNum{
    static int reverse(int a){
        int reverse = 0;
        while(a != 0){
            int res = a % 10;
            if(reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE /10){
                return 0;
            }
            reverse = (reverse * 10) + res;
            a /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Reverse num:" + reverse(num));
    }
}