

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class bai2_lab5 {

    private static ArrayList<String> arrhovaten = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("------------menu------------");
            System.out.println("1. Nhap danh sach va ho ten");
            System.out.println("2. Xuat danh sach vua nhap");
            System.out.println("3. xuat danh sach ngau nhien");
            System.out.println("4. Sap xep giam dan va xuat danh sach");
            System.out.println("5. Tim va xoa ho ten vua nhap tu ban phim");
            System.out.println("6. Thoat");
            System.out.println("Hay chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    nhapten();
                    break;
                case 2:
                    xuatten();
                    break;
                case 3:
                    danhsachrandom();
                    break;
                case 4:
                    sapxepvaxuat();
                    break;
                case 5:
                    xoaten();
                    break;
                case 6:
                    System.out.println("Ket thuc cau chuyen that roi.");
                    return;
                default:
                    System.out.println("Lua chon ko hop le.");
                    break;
            }
        }
    }

    private static void nhapten() {
        System.out.print("Nhap so luong ho va ten: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho va ten thu " + (i + 1) + " : ");
            String name = scanner.nextLine();
            arrhovaten.add(name);
        }
    }

    private static void xuatten() {
        System.out.println("Danh sach ho va ten:");
        for (String name : arrhovaten) {
            System.out.println(name);
        }
    }

    private static void danhsachrandom() {
        Collections.shuffle(arrhovaten, new Random());
        System.out.println("Danh sach sap xep ngau nhien:");
        for (String name : arrhovaten) {
            System.out.println(name);
        }
    }

    private static void sapxepvaxuat() {
        arrhovaten.sort(Collections.reverseOrder());
        System.out.println("Danh sach ho va ten giam dan:");
        for (String name : arrhovaten) {
            System.out.println(name);
        }
    }

    private static void xoaten() {
        System.out.print("Nhap ho va ten can xoa: ");
        String tenxoa = scanner.nextLine();
        if (arrhovaten.remove(tenxoa)) {
            System.out.println("Da xoa: " + tenxoa);
        } else {
            System.out.println("Khong tim thay: " + tenxoa);
        }
    }
}


