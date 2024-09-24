import java.util.Scanner;
public class Main {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
       squaretest();		
     }

  public static void squaretest() {
      System.out.println("Enter side length");
      int l = sc.nextInt();
      Square s = new Square(l);
      int area = s.getarea();
      System.out.println(area);
      }


}
