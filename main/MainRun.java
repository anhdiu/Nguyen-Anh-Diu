package main;

import entity.DanhSachLaiXe;
import entity.DanhSachTuyen;
import entity.LaiXe;
import entity.Tuyen;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachLaiXe dslx = new DanhSachLaiXe();
        DanhSachTuyen dst = new DanhSachTuyen();
        int luaChon = 0;
        do {
            System.out.println("---MENU---");
            System.out.println("vui lòng lựa chọn chương trình");
            System.out.println("1. Nhập lái xe mới .");
            System.out.println("2. In ra danh sách lái xe.");
            System.out.println("3. Nhập tuyến mới.");
            System.out.println("4.In ra danh sách các tuyến.");
            System.out.println("5. Nhập danh sách phân công cho lái xe.");
            System.out.println("6. In danh sách phân công ra màn hình.");
            System.out.println("7. Sắp xếp danh sách phân công theo Họ và tên.");
            System.out.println("8. Sắp xếp danh sách phân công theo số lượng .");
            System.out.println("9. kê tổng khoảng cách xe chạy của lái xe.");
            System.out.println("10. thoát chương trình");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("nhập mã lái xe:");
                int maLaiXe = new Scanner(System.in).nextInt();
                System.out.println("nhập họ tên:");
                String hoTen = new Scanner(System.in).nextLine();
                System.out.println("nhập địa chỉ:");
                String diaChi = new Scanner(System.in).nextLine();
                System.out.println("nhập số điện thoại:");
                int sdt = new Scanner(System.in).nextInt();
                System.out.println("nhập trình độ:");
                String trinhDo = new Scanner(System.in).nextLine();
                LaiXe lx = new LaiXe(maLaiXe, hoTen, diaChi, sdt, trinhDo);
                dslx.themLaiXe(lx);

            } else if (luaChon == 2) {
                dslx.printDanhSachLaiXe();


            } else if (luaChon == 3) {
                System.out.println("nhập mã tuyến:");
                int maTuyen = new Scanner(System.in).nextInt();
                System.out.println("nhập khoảng cách:");
                double khoangCach = new Scanner(System.in).nextDouble();
                System.out.println("nhập số điểm dừng:");
                int soDiemDung = new Scanner(System.in).nextInt();
                Tuyen t = new Tuyen(maTuyen, khoangCach, soDiemDung);
                dst.themTuyen(t);


            } else if (luaChon == 4) {
                dst.printDanhSachTuyen();

            } else if (luaChon == 5) {
                System.out.println("lái xe:"+ dslx);
                System.out.println("tuyến:" + dst);

            } else if (luaChon == 6) {
            } else if (luaChon == 7) {

            } else if (luaChon == 8) {

            } else if (luaChon == 9) {

            }

        }while(luaChon != 0) ;
    }
}









