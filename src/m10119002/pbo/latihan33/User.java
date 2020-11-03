/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan33;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek User
 * 
 * 
 */
public class User {
    private static String username = "RizkiAdam";
    private static String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return (parUserName.equals(username))? 
                (parPassword.equals(password)) : false;
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        if(status) {
            System.out.println("******HALLO ".concat(parUserName.toUpperCase()).concat("******"));
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        hasilLogin(cekAkun(parUserName, parPassword), parUserName);
    }
}
