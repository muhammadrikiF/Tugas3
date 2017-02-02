public class NilaiMax {
public static void main(String[]args){
int a = 87, b = 17, c = 64;
int max = 0;
 
 System.out.println("number 1 = "+a);
 System.out.println("number 2 = "+b);
 System.out.println("number 3 = "+c);
 
 //mencari nilai tertinggi dengan operator kondisi
 max = a >= max ? a : max;
 max = b >= max ? b : max;
 max = c >= max ? c : max;

 System.out.println("Nilai Tertingginya adalah angka = "+max);
	}
}
