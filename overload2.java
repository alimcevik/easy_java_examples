public class Foo{
    public static void urunler(String isim, int fiyat){
        System.out.println("Ürün Adı: " + isim + " " + ",Fiyatı: "+ fiyat);
    }
    
    public static void urunler(String isim){
         System.out.println("Ürün Adı: " + isim);
    }
    
      
    public static void urunler(int fiyat){
         System.out.println("Fiyatı: " +fiyat);
    }
    
    public static void main(String[] args) {
       urunler("Elma",5);
       urunler("Armut");
       urunler(13);
    }
}
