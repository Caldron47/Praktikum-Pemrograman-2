/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK203_2110817310013_Muhammad_Andra_Fadhillah;

/**
 *
 * @author DELL
 */
public class Soal3Main {
 public static void main(String[] args) {
 Pegawai p1 = new Pegawai();
 //p1.nama = "Roi"
 p1.nama = "Roi";
 p1.asal = "Kingdom of Orvel";
 p1.setJabatan("Assasin");
 p1.umur = 17;
 System.out.println("Nama Pegawai: " + p1.getNama());
 System.out.println("Asal: " + p1.getAsal());
 System.out.println("Jabatan: " + p1.jabatan);
 System.out.println("Umur: " + p1.umur);
 }
 }