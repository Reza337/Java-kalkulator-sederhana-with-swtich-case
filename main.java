
import java.util.*;
public class main {
    
    public static void main (String[] args){

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next();
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        switch(operator){
            case "+":
                //Penjumlahan
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-":
                //Pengurangan
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "*":
                //Perkalian
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case "/":
                //Pembagian
                hasil = a / b;
                System.out.println("hasil = " + hasil);
                break;
            default:
                System.out.println("Operator" + operator + "Tidak ditemukan");
        }

    }

}
