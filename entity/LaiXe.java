package entity;

public abstract class LaiXe {
    private static int maLaiXe_Id = 10000;
    private String hoTen;
    private String DiaChi;
    private int sdt;
    private String trinhDo;

    public LaiXe(int maLaiXe, String hoTen, String diaChi, int sdt, String trinhDo) {
        this.hoTen = hoTen;
        DiaChi = diaChi;
        this.sdt = sdt;
        this.trinhDo = trinhDo;
    }

    public LaiXe() {

    }

    public static int maLaiXe_Id() {
        return maLaiXe_Id;
    }

    public static void setMaLaiXe_Id(int maLaiXe_Id) {
        LaiXe.maLaiXe_Id = maLaiXe_Id;
    }

    protected static void inputInfo() {
    }

    public String hoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String DiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int sdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String trinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "LaiXe{" +
                "hoTen='" + hoTen + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", sdt=" + sdt +
                ", trinhDo='" + trinhDo + '\'' +
                '}';
    }
    public int CompareTo(LaiXe laiXe) {
        if(this.maLaiXe_Id>laiXe.maLaiXe_Id()) {
            return 1;
        }else if (this.maLaiXe_Id<laiXe.maLaiXe_Id()) {
            return -1;
        }
        return 0;
    }


}
