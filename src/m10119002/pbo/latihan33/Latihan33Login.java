/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan33;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program User Login
 * (OBJECT ORIENTED)
 * 
 */
public class Latihan33Login {
    private static String usName, passWord;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.print("Masukkan Username = ");
        input = scanner.nextLine();
        usName = input;
        
        System.out.print("Masukkan Password = ");
        input = scanner.nextLine();
        passWord = input;
        
        System.out.println("");
        User user = new User();
        user.pengecekkanLogin(usName, passWord);
    }
    
}
