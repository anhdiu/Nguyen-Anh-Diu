package entity;

import constant.TrinhDo;

import java.util.Scanner;

public class LaiXe {
    private static int maLaiXe_Id = 10000;
    private String hoTen;
    private String diaChi;
    private int sdt;
    private String trinhDo;

    public LaiXe(int maLaiXe, String hoTen, String diaChi, int sdt, String trinhDo) {
        this.hoTen = hoTen;
        diaChi = diaChi;
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


    public String hoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String DiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        diaChi = diaChi;
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
                ", DiaChi='" + diaChi + '\'' +
                ", sdt=" + sdt +
                ", trinhDo='" + trinhDo + '\'' +
                '}';
    }

    public void inputInfo() {
        this.maLaiXe_Id = maLaiXe_Id++;
        System.out.println("Nhập họ tên lái xe:");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ:");
        this.diaChi = new Scanner(System.in).nextLine();
        System.out.println("Nhập sdt:");
        this.sdt = new Scanner(System.in).nextInt();
        System.out.println("Nhập trình độ:");
        this.themTrinhDo();


    }

    private void themTrinhDo() {
        System.out.println("Nhập vào lựa chọn dưới đây");
        System.out.println("1. Loại A");
        System.out.println("2. Loại B");
        System.out.println("3. Loại C");
        System.out.println("4. Loại D");
        System.out.println("5. Loại E");
        System.out.println("6. Loại F");
        int trinhDo = 0;
        do {
            trinhDo = new Scanner(System.in).nextInt();
            if (trinhDo >= 1 && trinhDo <= 6) {
                break;
            }
            System.out.println("Lựa chọn không hợp lệ, vui lòng lựa chọn lại");
        } while (true);
        switch (trinhDo) {
            case 1:
                this.setTrinhDo(String.valueOf(TrinhDo.LOAI_A));
            case 2:
                this.setTrinhDo(String.valueOf(TrinhDo.LOAI_B));
            case 3:
                this.setTrinhDo(String.valueOf(TrinhDo.LOAI_C));
            case 4:
                this.setTrinhDo(String.valueOf(TrinhDo.LOAI_D));
            case 5:
                this.setTrinhDo(String.valueOf(TrinhDo.LOAI_E));
            case 6:
                this.setTrinhDo(String.valueOf(TrinhDo.LOAI_F));
                break;
        }
    }

    public int CompareTo(LaiXe laiXe) {
        if (this.maLaiXe_Id > laiXe.maLaiXe_Id()) {
            return 1;
        } else if (this.maLaiXe_Id < laiXe.maLaiXe_Id()) {
            return -1;
        }
        return 0;
    }

    public void themLaiXe() {
        this.maLaiXe_Id = maLaiXe_Id++;
        System.out.println("Nhập họ tên lái xe:");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ:");
        this.diaChi = new Scanner(System.in).nextLine();
        System.out.println("Nhập sdt:");
        this.sdt = new Scanner(System.in).nextInt();
        System.out.println("Nhập trình độ:");
        this.themTrinhDo();

    }
}




