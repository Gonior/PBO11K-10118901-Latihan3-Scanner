/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan3.scanner;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA         : Dedi Cahya
 * KELAS        : IF-11-K
 * NIM          : 10118901
 * DESKRIPSI    : Memasukan nilai dari keyboard
 */
public class PBO11K10118901Latihan3Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+ nama);
                
    }
    
}
