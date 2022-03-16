package main;
import java.util.Scanner;

import shapes1.Person;
import shapes1.PhuongTrinhBac2;
import shapes1.SinhVien;
public class App1603 {
  public static void  main(String args[]){
        Person ps = new Person();
        SinhVien sv = new SinhVien();
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2();
        ps.NhapThongTin();
        ps.InThongTin();
        System.out.println();
        sv.NhapThongTin();
        sv.InThongTin();
        System.out.println();
        ptb2.NhapCacHeSo();
        ptb2.GiaiPhuongTrinh();
      }
}
