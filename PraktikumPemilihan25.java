import java.util.Scanner;

public class PraktikumPemilihan25 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukkan nilai tugas : ");
    int tugas = scan.nextInt();
    System.out.println("Masukkan nilai kuis : ");
    int kuis = scan.nextInt();
    System.out.println("Masukkan nilai UTS");
    int uts=scan.nextInt();
    System.out.println("Masukkan nilai UAS");
    int uas=scan.nextInt();
    System.out.println("-------------");
    if(tugas>100 || kuis >100 || uts>100 || uas >100){
    System.out.println("Nilai Tidak Valid");
    }
    else{

        double tugasfix = tugas*0.1;
        double kuisfix = kuis*0.2;
        double utsfix = uts*0.3;
        double uasfix=uas*0.4;
        double total = tugasfix+kuisfix+utsfix+uasfix;
        System.out.println("nilai akhir : "+total);
        if (total > 80 ) {
            System.out.println("Predikat : A");
            System.out.println("Anda lulus");
        }
        else if (total <= 80 && total > 73 ){
            System.out.println("Predikat : B+");
            System.out.println("Anda lulus");
        }
        else if(total <=73 && total > 65){
            System.out.println("Predikat : B");
            System.out.println("Anda lulus");
        }
        else if (total <= 65 && total > 60){
            System.out.println("Predikat : C+");
            System.out.println("Anda lulus");
        }
        else if (total <= 60 && total> 50) {
            System.out.println("Predikat : C ");
            System.out.println("Anda  lulus");
        }
        else if (total <= 50 && total > 39){
            System.out.println("Predikat D");
            System.out.println("Anda tidak lulus");
        }
        else if (total <= 39 ) {
            System.out.println("Predikat : E ");
            System.out.println("Anda tidak lulus");
        }
    }


    
    




    }
}