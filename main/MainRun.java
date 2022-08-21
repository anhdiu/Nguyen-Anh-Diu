package main;

import entity.*;
import hamlogic.QuanLyLaiXe;
import hamlogic.QuanLyPhanCong;
import hamlogic.QuanLyTuyen;

import java.util.Scanner;

public class MainRun {
    public static LaiXe[] LAIXE = new LaiXe[100];
    public static Tuyen[] TUYEN = new Tuyen[100];
    public static PhanCong[] PHANCONG = new PhanCong[100];

    public static void main(String[] args) {

        String name = "Nguyen Van Trường";
        System.out.println(name);
        Menu();
    }

    private static void Menu() {
        boolean isExit = false;
        do {
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1:
                    QuanLyLaiXe.themLaiXeMoi();
                    break;
                case 2:
                    QuanLyLaiXe.inLaiXe();
                    break;
                case 3:
                    QuanLyTuyen.themTuyenMoi();
                    break;
                case 4:
                    QuanLyTuyen.intuyen();
                    break;
                case 5:
                    QuanLyPhanCong.phanCong();
                    break;
                case 6:
                    QuanLyPhanCong.inPhanCong();
                    break;
                case 7:
                    QuanLyPhanCong.sapXepPhanCong();
                    break;
                case 8:
//
                    isExit = true;
            }
        } while (!isExit);
    }

    private static int functionChoice() {
        showMenu();


        System.out.print("Xin mời chọn chức năng: ");
        int luaChon = 0;
        do {
            luaChon = new Scanner(System.in).nextInt();
            if (luaChon >= 1 && luaChon <= 8) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return luaChon;
    }

    private static void showMenu() {

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
    }
}











