import java.util.Scanner;
public class sayi_tahmin {

  public static void main(String[] args) {
  Scanner girdi = new Scanner(System.in);
       
  int rastgeleSayi;
  rastgeleSayi = (0+ (int)(Math.random()*100));
       
  System.out.println("1-100 Arasında Tutulan Sayıyı Tahmin Edin");
        
  int kackere = 0;
  for(int i =0; i< 100;i++){
   int tahmin;     
   tahmin = girdi.nextInt();
   int  kalan_hak = 8;
   int izin  =  kalan_hak - kackere;

  if (izin == 0){
   System.out.println("Deneme Hakkınız Kalmadı!!");
   break;
  }
        
  kackere += 1;

  if (tahmin > 100 || tahmin < 0){
    System.out.println("Girdiğiniz sayı 1-100 aralığında değil!\n Lütfen yeni bir değer girin:");
  }
           
  else if (tahmin == rastgeleSayi){
   System.out.println("Tebrikler doğru bildiniz.");
   System.out.println(kackere + " kere denediniz.");
   break;
  }
        
  else if (tahmin < rastgeleSayi){
   System.out.println("**Yanlış** Değeri Yükseltin!\n Kalan Hak: "+izin);
  }
  
  else if (tahmin > rastgeleSayi){
   System.out.println("**Yanlış** Değeri Azaltın!\n Kalan Hak: " + izin);
  }

    }   
	}
}
    
