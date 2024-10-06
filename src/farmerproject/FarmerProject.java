
package farmerproject;
import java.util.ArrayList; 
import java.util.Scanner;
public class FarmerProject {

      
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
      hayvanlar hayvan1=new hayvanlar("dana", "TR65 238", "abdullah", 180, 3, 380);
      hayvanlar hayvan2=new hayvanlar("dana", "TR65 239", "abdullah", 170, 3, 350);
      hayvanlar hayvan3=new hayvanlar("dana", "TR65 240", "abdullah", 185, 3, 400);
       
      
      /*ArrayList<hayvanlar> hayvanListesi = new ArrayList<>();
       for (int i = 1; i <= 3; i++) {
            System.out.println(i + ". hayvan için sahibin adını girin: ");
            String sahip = scanner.nextLine();

            // Her hayvan için kimlik ve diğer bilgileri rastgele veriyoruz (örneğin)
            hayvanlar hayvan = new hayvanlar("dana", "TR65 24" + i, sahip, 180 + i, 3, 350 + (i * 10));

            // Hayvanı listeye ekliyoruz
            hayvanListesi.add(hayvan);
        }
        System.out.println(hayvanListesi);
      System.out.println("Hayvanlar Listesi:");
        for (hayvanlar h : hayvanListesi) {
            h.bilgileriGoster();  // Her hayvanın bilgilerini ekrana yazdırıyoruz
        }
       
         */
      String secimler="1. hayvanlari goster\n"+"2. hayvan ozelliklerini degistir\n"+"cıkıs icni b";
        
        
      while (true){
            System.out.println(secimler);
            System.out.println("bir işlem secin\n");
           String secim=scanner.nextLine();
      
          if (secim.equals("b")) {
              System.out.println("cikis yapiliyor");
              return;
          }
          if (secim.equals("1")) {
                   
              String hayvan="hayvan1 icin 1 \n"+"hayvan2 icin 2 \n"+"hayvan3 icin 3\n"+"bütün hayvanlar icin 4\n"+"cikis icin q";
             
              System.out.println("************************************");
             
              while (true) {   
                   System.out.println(hayvan);
                   System.out.println("bir işlem secin\n");
                   String secim1=scanner.nextLine();
                   if (secim1.equals("q")) {
                      System.out.println("cikis yapiliyor");
                       break;}
                   if (secim1.equals("1")) {
                      hayvan1.hayvanGoster();
                  }
                   
                     if (secim1.equals("2")) {
                      hayvan2.hayvanGoster();
                  }
                    if (secim1.equals("3")) {
                      hayvan3.hayvanGoster();
                  }
                     if (secim1.equals("4")) {
                      hayvan1.hayvanGoster();
                      hayvan2.hayvanGoster();
                      hayvan3.hayvanGoster();
                  }
                   
              }
             
          }
          if (secim.equals("2")) {
               String hayvani="hayvan1 icin 1 \n"+"hayvan2 icin 2 \n"+"hayvan3 icin 3\n"+"cikis icin q";
              
              System.out.println("************************************");
             
              while (true) {    
                  System.out.println(hayvani);
                  System.out.println("bir işlem secin\n");
                   String secim1=scanner.nextLine();
                   if (secim1.equals("q")) {
                      System.out.println("cikis yapiliyor");
                       break;
                  }
                   else if (secim1.equals("1")) {
                      hayvan1.hayvanÖzelikDegistir();
                  }
                   
                    else if (secim1.equals("2")) {
                      hayvan2.hayvanÖzelikDegistir();
                  }
                    else if (secim1.equals("3")) {
                      hayvan3.hayvanÖzelikDegistir();
                  }
                  
                    else{
                        System.out.println("yanlis bir deger girdin");
                    }
              }
          }
      }
    } 
}
    
    
    
    

