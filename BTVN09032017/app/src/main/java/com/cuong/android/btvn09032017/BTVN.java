package com.cuong.android.btvn09032017;

import java.util.Scanner;

/**
 * Created by Admin on 12/3/2017.
 */

public class BTVN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BTVN bt = new BTVN();
        int n = 0;
        System.out.println("Nhập n: ");
        n = scanner.nextInt();
        System.out.println("Tích từ 1 đến " + n + " = " + bt.tichTu1DenN(n));
        String ketQuaNT = "";
        ketQuaNT = (bt.kiemTraNguyenTo(n)) ? " là số nguyên tố" : " không là số nguyên tố";
        System.out.println(n + ketQuaNT);
        System.out.println("Số nguyên tố thứ " + n + " là: " + bt.soNguyenToThuN(n));
    }

    private int tichTu1DenN(int n) {
        int ketQua = 1;
        for (int i=1; i<=n; i++) {
            ketQua*=i;
        }
        return ketQua;
    }

    private boolean kiemTraNguyenTo(int n) {
        int soUoc = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) {
                soUoc++;
            }
        }
        if (soUoc == 2) return true;
        else return false;
    }

    private int soNguyenToThuN(int n) {
        int thuTu = 0;
        int so = 0;
        do {
            so++;
            if (kiemTraNguyenTo(so)) {
                thuTu++;
                if (thuTu == n)
                    return so;
            }
        } while (thuTu < n);
        return so;
    }
}
