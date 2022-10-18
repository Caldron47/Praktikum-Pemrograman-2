/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK203_2110817310013_Muhammad_Andra_Fadhillah;

/**
 *
 * @author DELL
 */
//Pada baris ini terjadi error karena nama kelas tidak sesuai dengan nama file
//public class Employee {
public class Pegawai {
 public String nama;
 //Tipe data pada baris ini harus diganti menjadi String karena atribut asal tidak bisa hanya berisi satu karakter saja
 //public char asal;
 public String asal;
 public String jabatan;
 public int umur;
 public String getNama() {
 return nama;
 }
 public String getAsal() {
 return asal;
 }
 //Pada baris ini terjadi error karena tidak adanya parameter untuk mengambil data jabatan
 //public void setJabatan() {
 public void setJabatan(String j) {
 this.jabatan = j;
 }
 }

