import java.util.Scanner;

public class Home2 {

    public static void main(String[] args) {
        //2+3
        int c1,c2;
        char simbol;
        Scanner scanner =new Scanner(System.in);
        c1=scanner.nextInt();
        System.out.println("Enter math operator");
        simbol=scanner.next().charAt(0);
        System.out.println("Enre second digit");
        c2=scanner.nextInt();
        int result=0;
        if(simbol=='+'){
         result=c1+c2;
        }
        if (simbol=='-'){
            result = c1 - c2;
        }
        }
    }


