import java.util.Scanner;
public class sayilariSiralamaOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("ilk sayıyı giriniz :");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        b= input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz :");
        c=input.nextInt();
        if((a<b) && (b<c)){
            if (b<c){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        } else if ((b<a) && (b<c)){
          if (a<c){
              System.out.println("b<a<c");
          }else {
              System.out.println("b<c<a");
          }
        }else {
            if((c<a) && (a<b)){
                System.out.println("c<a<b");
            }else{
                if ((c<b) && (b<a)) {
                    System.out.println("c<b<a");
                }

            }

        }












            /*
            else if ((b<a) && (a<c)){
            System.out.println("b<a<c");
        }else if ((c<b) && (b<a)){
            System.out.println("c<b<a");
        }else if ((a<b) && (c<b)){
            System.out.println("a<c<b");
        }else if ((b<c) && (c<a)){
            System.out.println("b<c<a");
        }else if ((c<a) && (a<b)){
            System.out.println("c<a<b");
        }
             */

    }
}
