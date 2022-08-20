package entity;

import java.util.Arrays;

public class PhanCong {
    private LaiXe laiXe;
    private ChiTietPhanCong[] ChiTietPhanCong;

    public PhanCong(LaiXe laiXe, entity.ChiTietPhanCong[] chiTietPhanCong) {
        this.laiXe = laiXe;
        ChiTietPhanCong = chiTietPhanCong;
    }

    public LaiXe laiXe() {
        return laiXe;
    }

    public void setLaiXe(LaiXe laiXe) {
        this.laiXe = laiXe;
    }

    public entity.ChiTietPhanCong[] ChiTietPhanCong() {
        return ChiTietPhanCong;
    }

    public void setChiTietPhanCong(entity.ChiTietPhanCong[] chiTietPhanCong) {
        ChiTietPhanCong = chiTietPhanCong;
    }

    @Override
    public String toString() {
        return "PhanCong{" +
                "laiXe=" + laiXe +
                ", ChiTietPhanCong=" + Arrays.toString(ChiTietPhanCong) +
                '}';
    }
}




