/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpbogit28;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PROJECTpboGIT28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

        System.out.print("Ganti Kata: ");
        String kataLama = input.nextLine();

        System.out.print("Menjadi Kata: ");
        String kataBaru = input.nextLine();

        String kalimatHasil = kalimat.replaceAll(kataLama, kataBaru);

        System.out.println("Kalimat setelah penggantian: " + kalimatHasil);
    }
    
}
