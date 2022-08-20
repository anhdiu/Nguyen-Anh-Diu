package entity;

import java.util.Scanner;

public abstract class Tuyen {
    int maTuyen = 100;
    double khoangCach;
    int soDiemDung;

    public Tuyen(int maTuyen, double khoangCach, int soDiemDung) {
        this.maTuyen = maTuyen;
        this.khoangCach = khoangCach;
        this.soDiemDung = soDiemDung;
    }

    public Tuyen() {

    }

    public int maTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(int maTuyen) {
        this.maTuyen = maTuyen;
    }

    public double khoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(double khoangCach) {
        this.khoangCach = khoangCach;
    }

    public int soDiemDung() {
        return soDiemDung;
    }

    public void setSoDiemDung(int soDiemDung) {
        this.soDiemDung = soDiemDung;
    }

    @Override
    public String toString() {
        return "Tuyen{" +
                "maTuyen=" + maTuyen +
                ", khoangCach=" + khoangCach +
                ", soDiemDung=" + soDiemDung +
                '}';
    }




    public void InputInfo() {
        this.maTuyen = maTuyen++;
        System.out.print("Nhập khoảng cách : ");
        this.khoangCach = new Scanner(System.in).nextInt();
        System.out.print("Nhập số điểm dừng: ");
        this.soDiemDung = new Scanner(System.in).nextInt();

    }

    public abstract void InpuInfo();

    public abstract void InputTrinhDo();

    public abstract int compareTo(LaiXe laiXe);

}

