/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asia.p11_pbojava_interface_kendaraan;

/**
 *
 * @author A-1
 */
class Dealer {

    private String nama;
    private MobilBaru mobilBaru;
    private MobilBekas mobilBekas;

    public Dealer(String nama, MobilBaru mobilBaru, MobilBekas mobilBekas) {
        this.nama = nama;
        this.mobilBaru = mobilBaru;
        this.mobilBekas = mobilBekas;
    }

    public String getNama() {
        return nama;

    }

    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}
