
package farmerproject;

import java.util.Scanner;
public class hayvanlar {
    Scanner scanner=new Scanner(System.in);
    private String type;
     private String no;
     private String bakici;
     private  int boy;
    private int yas;
    private int kilo;

    public hayvanlar(String type, String no, String bakici, int boy, int yas, int kilo) {
        this.type = type;
        this.no = no;
        this.bakici = bakici;
        this.boy = boy;
        this.yas = yas;
        this.kilo = kilo;
    }
    
      public void bilgileriGoster() {
        System.out.println("Tür: " +getType());
        System.out.println("Kimlik: " +getNo());
        System.out.println("Sahibi: " + getBakici());
        System.out.println("Boy: " + getBoy());
        System.out.println("Yaş: " + getYas());
        System.out.println("Ağırlık: " + getKilo());
        System.out.println("----------------------");
    }
    public void hayvanOzellikGoster(){
        System.out.println(getBakici()+"\n"+getNo()+"\n"+getType()+"\n"+getBoy()+"\n"+getKilo()+"\n"+getYas()+"\n");
    }
    
    public void hayvanÖzelikDegistir(){
        
          String islemler="1. kilo\n"
        +"2. boy\n" +"3. yas\n"+"bakici\n"+"cikis icin q";
        System.out.println("************************");
        System.out.println(islemler);
         System.out.println("************************");
        while(true){
         
        
       
             System.out.println("bir islem secin");
        String islem=scanner.nextLine();
        
            if (islem.equals("q")) {
                break;
            }
            if (islem.equals("1")) {
                System.out.println("yeni kilo gir");
                      int kilo=scanner.nextInt();
                      scanner.nextLine();
                      kiloDegistir(kilo);
                      
            }
                    
            if (islem.equals("2")) {
                System.out.println("yeni boy gir");
                      int boy=scanner.nextInt();
                      boyDegistir(boy);
            }
                      
            if (islem.equals("3")) {
                System.out.println("yeni yas gir");
                      int yas=scanner.nextInt();
                      yasDegistir(yas);
            }
                      
            if (islem.equals("4")) {
                  System.out.println("yeni bakici gir");
                      String bakici=scanner.nextLine();
                      bakiciDegistir(bakici);
            }
            
        }
    
    }
    public void kiloDegistir(int kilo){
        
        if (kilo<=0) {
            System.out.println("yanlıs deger girdiniz");
            
        }
        else{
            this.kilo=kilo;
        System.out.println("yeni kilosu = "+getKilo());
        }
    }
    public void boyDegistir(int boy){
        
        if (boy<=0) {
            System.out.println("yanlıs deger girdiniz");
            
        }
        if (boy<=getBoy()) {
            System.out.println("gecersiz boy");
        }
        else{
            this.boy=boy;
        System.out.println("yeni boyu = "+getBoy());
        }
    }
    public void yasDegistir(int yas){
        
        if (yas<=0) {
            System.out.println("yanlıs deger girdiniz");
            
        }
         if (yas<=getYas()|| yas>=(getYas()+2)) {
            System.out.println("gecersiz yas");
          
        }
        else{
            this.yas=yas;
        System.out.println("yeni yasi = "+getYas());
        }
    }
    public void bakiciDegistir(String bakici){
        setBakici(bakici);
        System.out.println("yeni bakici : "+getBakici());
    }
    
    public void hayvanGoster(){
        System.out.println(getBakici()+"\t"+getNo()+"\t"+getType()+"\t"+getBoy()+"\t"+getKilo()+"\t"+getYas());
        
    }
    
    
public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBakici() {
        return bakici;
    }

    public void setBakici(String bakici) {
        this.bakici = bakici;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
    
    
    
    
}
