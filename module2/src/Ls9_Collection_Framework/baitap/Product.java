package Ls9_Collection_Framework.baitap;

import java.util.Scanner;

public class Product {
    private int id;
    private String nameProduct;
    private double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose ;
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sủa thông tin ");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm");
        System.out.println("6. Sắp xếp tăng dần theo giá");
        System.out.println("7. Sắp xếp giảm dần theo giá");
        System.out.println("8. thoát");

        do {
            choose = scanner.nextInt();
            switch (choose) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:
                    System.exit(0);
                default:
                    System.out.println("Ban chon khong dung");
            }
        }while (choose != 8 && choose > 0);
    }
}
