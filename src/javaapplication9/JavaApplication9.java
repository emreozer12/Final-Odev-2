
package javaapplication9;


public class JavaApplication9 {
    
 static int rasgelesayi = (int)(Math.random()*(1000));
  //0 ile 1000 arasında sayı belirledik
 public static void main(String[] args) {  
  System.out.println("rasgele sayi: " + rasgelesayi); 
//üretilen sayıyı ekrana yazdırdık
        int birler = rasgelesayi %10;
 //çıkan rasgele sayının birler basamağını alıyor      
        rasgelesayi = rasgelesayi /10;  
        int onlar = rasgelesayi %10;
         //çıkan rasgele sayının onlar basamağını alıyor  
        int yuzler = rasgelesayi /10; 
 //çıkan rasgele sayının yüzler basamağını alıyor      
        System.out.println("Toplamları ="+(birler+onlar+yuzler));
// ekrana birler, onlar ve yüzler basamağını toplayıp yazdırıyor.
    }
    
}
