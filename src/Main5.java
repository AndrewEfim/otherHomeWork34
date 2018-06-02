import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        int a = 12345;
        int b = a;
        //узнаем размер массива
        int n = (int) Math.log10(a) + 1;
        int[] number = new int[n];
        //заполнили массив
        for (int i = 0; i < n; i++){ 
            int e = (b % 10);
            b /= 10;
            number[i] = e;}
        for (int i = number.length - 1; i > 0; i--) { // сортировка
            for (int j = 0; j < i; j++) {
                if (number[j] > number[j + 1]) {
                    int t = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = t;
                }
            }
        }
    int k=0;
      for (int i = 0; i < number.length-1; i++) {
          k++;
          if(number[0]==number[i+1]-k){
            System.out.println(a +" - образуют");break;}
            else{
            System.out.println(a +" - не образуют");break;
          }     
      }  
          
      }
    }