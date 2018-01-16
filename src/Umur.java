import java.util.*;
public class Umur {
public static void main(String args[]){
    
    int umur;
    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan Umur anda = ");
    umur = input.nextInt();
    
    if(umur<46){
        System.out.println("Anda masih muda dan cantik");
    }else{
        System.out.println("Anda sudah tua dan perlukan rehat");
    }
}
}