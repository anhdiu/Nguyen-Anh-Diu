package nhap;

import entity.Tuyen;

import java.util.ArrayList;

public class DanhSachTuyen {
    private ArrayList<Tuyen> danhSachTuyen;

    public DanhSachTuyen() {
        this.danhSachTuyen = new ArrayList<>();
    }

    public DanhSachTuyen(ArrayList<Tuyen> danhSachTuyen) {
        this.danhSachTuyen = danhSachTuyen;
    }
    public void themTuyen(Tuyen t) {
        this.danhSachTuyen.add(t);
    }
    public void printDanhSachTuyen() {
        for (Tuyen tuyen:danhSachTuyen) {
            System.out.println(tuyen);

        }
    }
}
