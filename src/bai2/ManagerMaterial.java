package bai2;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ManagerMaterial extends Material implements Discount {
    public Scanner scanner = new Scanner(System.in);
    ArrayList<Material> listMaterial = new ArrayList<>();
    private int idNumber = 10;

    public ManagerMaterial() {
        Material crispyFlour1 = new CrispyFlour("1","crispyFlour1", LocalDate.of(2023,7,16),10000,100);
        listMaterial.add(crispyFlour1);
        Material crispyFlour2 = new CrispyFlour("2","crispyFlour2", LocalDate.of(2023,7,16),15000,100);
        listMaterial.add(crispyFlour2);
        Material crispyFlour3 = new CrispyFlour("3","crispyFlour3", LocalDate.of(2023,7,16),20000,100);
        listMaterial.add(crispyFlour3);
        Material crispyFlour4 = new CrispyFlour("4","crispyFlour4", LocalDate.of(2023,7,16),25000,100);
        listMaterial.add(crispyFlour4);
        Material crispyFlour5 = new CrispyFlour("5","crispyFlour5", LocalDate.of(2023,7,16),30000,100);
        listMaterial.add(crispyFlour5);
        Material meat1 = new Meat("6","meat1",LocalDate.of(2023,7,16),100000,1);
        listMaterial.add(meat1);
        Material meat2 = new Meat("7","meat2",LocalDate.of(2023,7,16),150000,2);
        listMaterial.add(meat2);
        Material meat3 = new Meat("8","meat3",LocalDate.of(2023,7,16),200000,3);
        listMaterial.add(meat3);
        Material meat4 = new Meat("9","meat4",LocalDate.of(2023,7,16),250000,4);
        listMaterial.add(meat4);
        Material meat5 = new Meat("10","meat5",LocalDate.of(2023,7,16),300000,5);
        listMaterial.add(meat5);

    }

       public void showListMaterial () {
        for (Material value :
                listMaterial) {
            System.out.println(value);
        }
    }
    public void addCrispyFlour() {
        idNumber++;
        System.out.println("nhập tên: ");
        String newName = scanner.nextLine();
        System.out.println("nhập ngày sản xuất");
        int newDay = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tháng sản xuất");
        int newMonth = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập năm sản xuất");
        int newYear = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá");
        int newCost = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số lượng");
        int newQuantity =  Integer.parseInt(scanner.nextLine());
        listMaterial.add(new CrispyFlour(idNumber+"", newName, LocalDate.of(newYear, newMonth, newDay), newCost, newQuantity));
        System.out.println("đã thêm thành công");
        System.out.println("danh sách sản phẩm mới là :");
        showListMaterial();
    }
    public void addMeat() {
        idNumber++;
        System.out.println("nhập tên: ");
        String newName = scanner.nextLine();

        System.out.println("nhập ngày sản xuất");
        int newDay =  Integer.parseInt(scanner.nextLine());

        System.out.println("nhập tháng sản xuất");
        int newMonth =  Integer.parseInt(scanner.nextLine());

        System.out.println("nhập năm sản xuất");
        int newYear =  Integer.parseInt(scanner.nextLine());

        System.out.println("nhập giá");
        int newCost =  Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số lượng");
        double newWeight = Integer.parseInt(scanner.nextLine());

        listMaterial.add(new Meat(idNumber+"", newName, LocalDate.of(newYear, newMonth, newDay), newCost, newWeight));
        System.out.println("đã thêm thành công");
        System.out.println("danh sách sản phẩm mới là :");
        showListMaterial();
    }
    public void repairMaterial() {
        System.out.println("nhập id cần sửa");
        String count = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < listMaterial.size(); i++) {
            if (listMaterial.get(i).getId().equals(count)) {
                System.out.println("nhập tên sửa lại");
                listMaterial.get(i).setName(scanner.nextLine());

                System.out.println("nhập ngày sản xuất sửa lại");
                int newDay =  Integer.parseInt(scanner.nextLine());

                System.out.println("nhập tháng sản xuất sửa lại ");
                int newMonth =  Integer.parseInt(scanner.nextLine());

                System.out.println("nhập năm sản xuất sửa lại");
                int newYear =  Integer.parseInt(scanner.nextLine());

                listMaterial.get(i).setManufacturingDate(LocalDate.of(newYear, newMonth, newDay));

                System.out.println("nhập giá sửa lại");
                listMaterial.get(i).setCost( Integer.parseInt(scanner.nextLine()));

                if (listMaterial.get(i) instanceof CrispyFlour) {
                    System.out.println("nhập số lượng sửa lại");
                    ((CrispyFlour) listMaterial.get(i)).setQuantity( Integer.parseInt(scanner.nextLine()));
                } else if (listMaterial.get(i) instanceof Meat) {
                    System.out.println("nhập số cân sửa lại");
                    ((Meat) listMaterial.get(i)).setWeight( Integer.parseInt(scanner.nextLine()));
                }
                flag = false;
                System.out.println("danh sách sản phẩm mới là :");
                showListMaterial();
            }
        }
        if (flag) {
            System.out.println("không có sản phẩm nào có id vừa nhập");
        }
    }

    public void removeMaterial() {
        System.out.println("nhập id cần xóa");
        String count = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < listMaterial.size(); i++) {
            if (listMaterial.get(i).getId().equals(count)) {
                listMaterial.remove(i);
                System.out.println("đã xóa thành công ");
                flag = false;
                System.out.println("danh sách sản phẩm mới là :");
                showListMaterial();
            }
        }
        if (flag){
            System.out.println("id vừa nhập k có trong danh sách");
        }

    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public LocalDate getExpiryDate() {
        return null;
    }

    @Override
    public double getRealMoney() {
        double realMoney ;
        for (Material product : listMaterial) {
            if(product instanceof Meat){
                System.out.println(product);
                System.out.println("giá trước chiết khấu là :" + product.getAmount());
                if ( ChronoUnit.DAYS.between(LocalDate.now() , product.getExpiryDate()) <=5) {
                    realMoney = product.getAmount() * 0.7 ;
                    System.out.println("giá sau chiết khấu là :" + realMoney);
                }else {
                    realMoney = product.getAmount() * 0.9 ;
                    System.out.println("giá sau chiết khấu là:" + realMoney);
                }

            }
            if(product instanceof CrispyFlour){
                System.out.println(product);
                System.out.println("giá trước chiết khấu là :" + product.getAmount());
                if ( ChronoUnit.MONTHS.between(LocalDate.now() , product.getExpiryDate()) <=2) {
                    realMoney = product.getAmount() * 0.6 ;
                    System.out.println("giá sau chiết khấu là :" + realMoney);
                }else if( ChronoUnit.MONTHS.between(LocalDate.now() , product.getExpiryDate()) <= 4) {
                    realMoney = product.getAmount() * 0.8 ;
                    System.out.println("giá sau chiết khấu là :" + realMoney);
                }else {
                    realMoney = product.getAmount() * 0.95 ;
                    System.out.println("giá sau chiết khấu là :" + realMoney);
                }

            }

        }
        return 0;
    }



}
