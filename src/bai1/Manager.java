package bai1;

public class Manager {
    Book programmingBook1 = new ProgrammingBook(1,"Tôi đi code dạo",80000,"Hoàng","Tiếng việt","Thư viện tiếng việt");
    Book programmingBook2 = new ProgrammingBook(2,"Trí tuệ do thái",180000,"Việt Anh","Tiếng việt","Thư viện tiếng việt");
    Book programmingBook3 = new ProgrammingBook(3,"Người chăn cừu",100000,"Azskan","Tiếng việt","Thư viện tiếng việt");
    Book programmingBook4 = new ProgrammingBook(4,"Nhà giả kim",250000,"Brensky","Tiếng việt","Thư viện tiếng việt");
    Book programmingBook5 = new ProgrammingBook(5,"Đắc nhân tâm",80000,"Quên rồi","Tiếng việt","Thư viện tiếng việt");
    Book fictionBook1 = new FictionBook(6,"Cha giàu cha nghèo",270000,"Trensky","Viễn tưởng 1");
    Book fictionBook2 = new FictionBook(7,"Bến thượng hải",570000,"Rensky","Viễn tưởng 1");
    Book fictionBook3 = new FictionBook(8,"Nuôi dạy con",180000,"Wliam","Viễn tưởng 2");
    Book fictionBook4 = new FictionBook(9,"Mùa hè không mưa",30000,"Master Wiliam","Viễn tưởng 3");
    Book fictionBook5 = new FictionBook(10,"Bí quyết làm giàu",70000,"Renskyyyy","Viễn tưởng 2");
    Book[]listBook = {programmingBook1,programmingBook2,programmingBook3,programmingBook4,programmingBook5,fictionBook1,fictionBook2,fictionBook3,fictionBook4,fictionBook5};
    public void totalMoney() {
        double total = 0;
        for (Book a:listBook
             ) {
            total += a.getPrice();
        }
        System.out.println("Tổng tiền: "+ total);
    }
    public void countCategory() {
        int count = 0;
        for (int i = 0; i < listBook.length;i++) {
            if (listBook[i] instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) listBook[i];
                fictionBook.getCategory();
                if (((FictionBook) listBook[i]).getCategory().equals("Viễn tưởng 1")) {
                    count ++;
                }
            }
        }
        System.out.println("Số sách thể loại Viễn tưởng 1 là: "+count);
    }
    public void countPrice() {
        int count2 = 0;
        for (int i = 0;i < listBook.length;i++) {
            if ((listBook[i]).getPrice() < 90000) {
                count2++;
            }
        }
        System.out.println("Số sách có giá nhở hơn 90000 là : "+count2);
    }
}
