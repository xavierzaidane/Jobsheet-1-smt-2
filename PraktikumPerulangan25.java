import java.util.Scanner;

public class PraktikumPerulangan25 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukkan 2 digit terkahir nim anda");
    int nim = scan.nextInt();
    //int n = 10;
    if(nim < 10){
         nim +=10;
    }
    for(int i = 1;i<=nim;i++){
        if (i == 6 || i == 10) {
            continue;
        }
        else if (i % 2 == 0){
        System.out.print(i);
        }
        else {
        System.out.print("*");
        }
        

    }
    //System.out.print(nim);
    }
}