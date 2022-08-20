package entity;

import java.util.ArrayList;

public class DanhSachPhanCong {
    private ArrayList<PhanCong> DanhSachPhanCong;
    public DanhSachPhanCong() {
        this.DanhSachPhanCong = new ArrayList<>();
    }

    public DanhSachPhanCong(ArrayList<PhanCong> danhSachPhanCong) {
        DanhSachPhanCong = danhSachPhanCong;
    }
    public void themPhanCong(PhanCong pc){
        this.DanhSachPhanCong.add(pc);
    }
    public void printDanhSachPhanCong(){
        for (PhanCong phanCong:DanhSachPhanCong) {
            System.out.println(phanCong);


        }
    }
}
