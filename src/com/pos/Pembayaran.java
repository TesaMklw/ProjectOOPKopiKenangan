package com.pos;

import java.util.Scanner;

public class Pembayaran {
    private String metodePembayaran;

    Scanner inputUser = new Scanner(System.in);

    public Pembayaran(String metodePembayaran){
        this.metodePembayaran = metodePembayaran;
    }

    public Pembayaran(){
        System.out.print("Metode Pembayaran = ");
        String metodePembayaran = inputUser.nextLine(); 
        setMetodePembayaran(metodePembayaran);
    }

    // setters dan getters
    public void setMetodePembayaran(Pembayaran metodePembayaran){
        this.metodePembayaran = metodePembayaran;
    }

    public void getMetodePembayaran(){
        return metodePembayaran;
    }
}
