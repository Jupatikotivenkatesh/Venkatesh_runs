import java.util.Scanner;
class zigzag_conversion{
    public String convert(String s, int r){
        if(r == 1 || r >= s.length()){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[r];
        for( int i = 0; i< r; i++){
            rows[i] = new StringBuilder();
        }
        int row = 0, direction = 1;
        for(char a : s.toCharArray()){
            rows[row].append(a);
            if(row == 0){
                direction = 1;
            }else if(row == r - 1){
                direction = -1;
            }
            row += direction;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder ss : rows){
            res.append(ss);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        zigzag_conversion ob = new zigzag_conversion();
        String res = ob.convert(s, r);
        System.out.println("Conerted :" + res);
        sc.close();
    }
}