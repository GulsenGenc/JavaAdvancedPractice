package _03_IfStatement_TernaryOperator;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class QQ2 {
    public static void main(String[] args) {
       /* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.

        System.out.println("boyunuzu cm giriniz : ");
        double boy=scan.nextDouble();

        System.out.println("kilonuzu  kg giriniz : ");
        double kilo=scan.nextDouble();

        double bmi=kilo/((boy/100)*(boy/100));

        if (bmi<=20){
            System.out.println("vucut kitle indeksini "+ bmi+ " oldukca zayıfsınız");
        } else if (bmi>20 && bmi<=25){
            System.out.println("vucut kitle indeksini "+ bmi+  " normal sınırlardasınız");
        } else if (bmi>25 && bmi<=30){
            System.out.println("vucut kitle indeksini "+ bmi+ " şişman kategorisindesiniz");
        } else  if (bmi>30){
            System.out.println("vucut kitle indeksini "+ bmi+ " obez grubundasınız");
        }
    }
}