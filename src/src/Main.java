package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int bakiye=1000;
        boolean continueMenu=true;
        while(continueMenu==true) {
            System.out.println("------Atm Menüsü------");
            System.out.println("|1-)Bayiye Görüntüle. |");
            System.out.println("|2-)Para Yatıma.      |");
            System.out.println("|3-)Para Çekme.       |");
            System.out.println("|4-)Sistemden Çıkış.  |");
            System.out.println("-----------------------");

            System.out.println("lütfen yapmak istediğiniz işlemi seçiniz.");
            int sayi=scan.nextInt();
            switch(sayi) {
                case 1:
                    System.out.println("toplam bakiyeniz: "+bakiye+" tl");

                    break;
                case 2:
                    System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz:");
                    int yatirilanpara=scan.nextInt();
                    bakiye=bakiye+yatirilanpara;
                    System.out.println("Son Bakiyeniz: "+bakiye+"tl");
                    break;
                case 3:
                    System.out.println("Çekmek istedğiniz para miktarını giriniz:");
                    int cekilenpara=scan.nextInt();
                    if(cekilenpara<=bakiye) {
                        System.out.println("işleminiz başarı ile gerçekleştirilmiştir.");
                        bakiye=bakiye-cekilenpara;
                        break;
                    }
                    else {
                        System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır.");
                    }
                    break;
                case 4:
                    System.out.println("Atm menüsünden ayrılıyorsunuz iyi günler dileriz.");
                    continueMenu=false;
                    break;
                default:
                    System.out.println("Yanlış işlem yaptınız. Lütfen tekrar deneyiniz");
            }

        }
    }

}
