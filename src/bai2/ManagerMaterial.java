package bai2;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class ManagerMaterial {
    List<Material> listDiscount = new ArrayList<>();
    Material crispyFlour1 = new CrispyFlour("1","crispyFlour1", LocalDate.of(2023,7,16),10000,100);
    Material crispyFlour2 = new CrispyFlour("2","crispyFlour2", LocalDate.of(2023,7,16),15000,100);
    Material crispyFlour3 = new CrispyFlour("3","crispyFlour3", LocalDate.of(2023,7,16),20000,100);
    Material crispyFlour4 = new CrispyFlour("4","crispyFlour4", LocalDate.of(2023,7,16),25000,100);
    Material crispyFlour5 = new CrispyFlour("5","crispyFlour5", LocalDate.of(2023,7,16),30000,100);
    Material meat1 = new Meat("6","meat1",LocalDate.of(2023,7,16),100000,1);
    Material meat2 = new Meat("7","meat2",LocalDate.of(2023,7,16),150000,2);
    Material meat3 = new Meat("8","meat3",LocalDate.of(2023,7,16),200000,3);
    Material meat4 = new Meat("9","meat4",LocalDate.of(2023,7,16),250000,4);
    Material meat5 = new Meat("10","meat5",LocalDate.of(2023,7,16),300000,5);



}
