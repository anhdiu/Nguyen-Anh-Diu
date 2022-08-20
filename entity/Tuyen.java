package entity;

public class Tuyen {
    int maTuyen = 10000;
    double khoangCach;
    int soDiemDung;

    public Tuyen(int maTuyen, double khoangCach, int soDiemDung) {
        this.maTuyen = maTuyen;
        this.khoangCach = khoangCach;
        this.soDiemDung = soDiemDung;
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
}

