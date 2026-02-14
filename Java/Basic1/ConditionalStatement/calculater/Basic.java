import java.util.*;
public class Basic {
    public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a: ");
       int a = sc.nextInt();
       System.out.println("Enter b: ");
       int b = sc.nextInt();
       System.out.println("Operation: ");
       char operate = sc.next().charAt(0);

       switch (operate){
          case '+' : System.out.println(a+b);
                     break;
          case '-' : System.out.println(a-b);
                       break;
          case '*' : System.out.println(a*b);
                      break;
          case '/' : System.out.println(a/b);
                      break;
          case '%' : System.out.println(a%b);
                       break;
           default : System.out.print("Operate is not match");
       }
                
    }
}