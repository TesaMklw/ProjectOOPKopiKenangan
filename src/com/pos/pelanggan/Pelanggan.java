package com.pos.pelanggan;

public class Pelanggan {
    private String namaPelanggan;
    private String passwordPelanggan;
    private int noHp;

        //constructor 1
        public Pelanggan(String namaPelanggan) {
            this.namaPelanggan = namaPelanggan;
        }

        //constructor 2
        public Pelanggan() {

        }

        // setter, getter
        public void setNamaPelanggan(String namaPelanggan) {
            this.namaPelanggan = namaPelanggan;
        }
        public String getNamaPelanggan() {
            return namaPelanggan;
        }

        public void setPasswordPelanggan(String passwordPelanggan) {
            this.passwordPelanggan = passwordPelanggan;
        }
        public String getpasswordPelanggan() {
            return passwordPelanggan;
        }

        public void setNoHp(int noHp) {
            this.noHp = noHp;
        }
        public int getNoHp()  {
            return noHp;
        }
}
