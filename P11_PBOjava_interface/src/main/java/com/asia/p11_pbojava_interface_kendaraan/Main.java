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
public class Main {

    public static void main(String[] args) {
        MobilBaru mobilBaru = new MobilBaru("Toyota", "Avanza", "3 tahun");
        MobilBekas mobilBekas = new MobilBekas("Honda", "Civic", 2018,
                200000000);
        Dealer dealer = new Dealer("Mobil Indonesia", mobilBaru, mobilBekas);
        dealer.info();
    }
}
