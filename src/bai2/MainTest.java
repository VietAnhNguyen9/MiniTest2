package bai2;
import java.util.Scanner;
public class MainTest {
    public static void main(String[] args) {
        ManagerMaterial managerMaterial = new ManagerMaterial();
        Scanner scanner = new Scanner(System.in);
        int index ;
        do{
            System.out.println("nhập 1 để hiển thị ");
            System.out.println("nhập 2 để thêm ");
            System.out.println("nhập 3 để sửa ");
            System.out.println("nhập 4 để xóa ");
            System.out.println("nhập 5 để kiểm tra chiết khấu");
            System.out.println("nhập 0 để out");
            index = scanner.nextInt();
            switch (index) {
                case 1 :
                    managerMaterial.showListMaterial();
                    break;
                case 2 :
                    int count;
                    System.out.println("nhập 1 để thêm bột ");
                    System.out.println("nhập 2 để thêm thịt");
                    System.out.println("nhập kí tự bất kì để quay lại");
                    count = scanner.nextInt();
                    if (count == 1) {
                        managerMaterial.addCrispyFlour();
                    }else if (count == 2 ) {
                        managerMaterial.addMeat();
                    }
                    break;
                case 3 :
                    managerMaterial.repairMaterial();
                    break;
                case 4 :
                    managerMaterial.removeMaterial();
                    break;
                case 5:
                    managerMaterial.getRealMoney();
                    break;
            }
        }while (index != 0) ;

    }

}
