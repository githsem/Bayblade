
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("Cikis icin q'ya basiniz...");
        
        Scanner scanner = new Scanner(System.in); 
        while(true){
            System.out.println("Hangi Beyblade' i Uretmek Istiyorsunuz?");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if (beyblade == null){
                    System.out.println("Lutfen Gecerli Bir Beyblade Ismi Girin");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
            
            
            
        }
        
    }
    
}
