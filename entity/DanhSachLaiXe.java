package entity;

import java.util.ArrayList;

public class DanhSachLaiXe {
    private ArrayList<LaiXe> danhSach;


    public DanhSachLaiXe() {
        this.danhSach = new ArrayList<>();
    }

    public DanhSachLaiXe(ArrayList<LaiXe> danhSach) {
        this.danhSach = danhSach;
    }
    public void themLaiXe(LaiXe lx) {
        this.danhSach.add(lx);

    }
    public void printDanhSachLaiXe() {
        for(LaiXe laiXe : danhSach) {
            System.out.println(laiXe);

        }
    }
}
