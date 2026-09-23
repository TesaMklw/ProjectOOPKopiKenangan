package com.pos;

import java.util.Scanner;

public class Transaksi {
    private String idTransaksi;
    private Gerai gerai;
    // - listProduk: ArrayList<Produk>
    private String subtotalTransaksi;
    private String totalTransaksi;
    private float uangKembali;
    private Pelanggan pelanggan;
    private String tanggalTransaksi;
    private Pembayaran pembayaran;

    Scanner inputUser = new Scanner(System.in);

    // Constructor 1
    public Transaksi (String idTransaksi, Gerai gerai, String subtotalTransaksi, String totalTransaksi, float uangKembali, Pelanggan pelanggan, String tanggalTransaksi, MetodePembayaran pembayaran){
        this.idTransaksi = idTransaksi;
        this.gerai = gerai;
        this.subtotalTransaksi = subtotalTransaksi;
        this.totalTransaksi = totalTransaksi;
        this.uangKembali = uangKembali;
        this.pelanggan = pelanggan;
        this.tanggalTransaksi = tanggalTransaksi;
        this.pembayaran = pembayaran;
    }

    // Constructor 2
    public Transaksi (){

    }

    // setters
    public void setIdTransaksi(String idTransaksi){
        this.idTransaksi = idTransaksi;
    }

    public void setGerai(Gerai gerai){
        this.gerai = gerai;
    }

    public void setSubtotalTransaksi(String subtotalTransaksi){
        this.subtotalTransaksi = subtotalTransaksi;
    }

    public void setTotalTransaksi(String totalTransaksi){
        this.totalTransaksi = totalTransaksi;
    }

    public void setUangKembali(float uangKembali){
        this.uangKembali = uangKembali;
    }

    public void setPelanggan(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }

    public void setTanggalTransaksi(String tanggalTransaksi){
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public void setPembayaran(Pembayaran pembayaran){
        this.pembayaran = pembayaran;
    }

    //  dan getters
    public void getIdTransaksi(){
        return idTransaksi;
    }

    public void getGerai(){
        return gerai;
    }

    public void getSubtotalTransaksi(){
        return subtotalTransaksi;
    }

    public void getTotalTransaksi(){
        return totalTransaksi;
    }

    public void getUangKembali(){
        return uangKembali;
    }

    public void getPelanggan(){
        return pelanggan;
    }

    public void getTanggalTransaksi(){
        return tanggalTransaksi;
    }

    public void getPembayaran( ){
        return pembayaran;
    }
}
