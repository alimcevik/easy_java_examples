public class Math_Sinifi {
public static void main(String[] args) {
        
//Rastgele Sayı Üretelim
int x; 
x=  (1+ (int)(Math.random()*10));
System.out.println("\nRastgele Sayi (1...10): " + x );
System.out.println("\n-------");

//Trigonometrik İfadelerde radyan değerlerini kullanmalıyız          
double a = Math.toRadians(60);
double b = Math.cos(a);
double c = Math.sin(a);
double d = Math.tan(a);
double cot = 1/d;

System.out.println("Sin (60):" + c); //Yöntem 1

double sin = Math.sin((Math.PI / 3)); //Yöntem 2
System.out.println("Sin (60): " + sin);
System.out.println("Cos (60):" + b);
System.out.println("Tan (60):" + d);
System.out.println("Cot(60): "+cot);

//Math.asin(DERECE);
double w = 0.4;
System.out.println("ArcSinus: " + Math.asin(w)); 

System.out.println("\n-------");
System.out.println("Mutlak Deger:  " + Math.abs(-10.5));
       
System.out.println("\n-------");
System.out.println("10.5 i yuvarla: "+Math.round(10.5));
System.out.println("10.5 i floor ile alta yuvarla: "+Math.floor(10.5));
System.out.println("10.5 i ceil ile uste yuvarla: "+ Math.ceil(10.5));

System.out.println("\n-------");
System.out.println("1 ve 2 (max): "+Math.max(1,2));
System.out.println("1 ve 2 (min): "+Math.min(1,2));
    
System.out.println("\n-------");  
System.out.println("2 uzeri 5: " + Math.pow(2,5));

System.out.println("\n9 un karekoku: " +Math.sqrt(9));

System.out.println("\n-------");  
 // Pi Sayısı
double pi = Math.PI;
System.out.println("Pi Sayisi: " + pi);


double ustel = Math.exp(2); // e üzeri 2
System.out.println("e uzeri 2 : " + ustel);
double logaritma = Math.log(64) / Math.log(2);
System.out.println("Logaritma 2 tabaninda 64 : " + logaritma);
double logaritma10 = Math.log10(100);
System.out.println("Logaritma 100 :" + logaritma10);

 }
    
}