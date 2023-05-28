import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        String horoScope = "";
        Scanner input = new Scanner(System.in);
        boolean isError = false;

        System.out.print("Doğum Yılınızı Girin: ");
        year = input.nextInt();

        if (year < 0){
            isError = true;
        }

        switch (year%12){
            case 0:
                horoScope = "Mayamun";
                break;
            case 1:
                horoScope = "Horoz";
                break;
            case 2:
                horoScope = "Köpek";
                break;
            case 3:
                horoScope = "Domuz";
                break;
            case 4:
                horoScope = "Fare";
                break;
            case 5:
                horoScope = "Öküz";
                break;
            case 6:
                horoScope = "Kaplan";
                break;
            case 7:
                horoScope = "Tavşan";
                break;
            case 8:
                horoScope = "Ejderha";
                break;
            case 9:
                horoScope = "Yılan";
                break;
            case 10:
                horoScope = "At";
                break;
            case 11:
                horoScope = "Koyun";
                break;
            default:
                isError = true;
        }

        if (isError){
            System.out.println("Hatalı Bilgi Girişi. Tekrar Deneyiniz.");
        }else {
            System.out.println("Çin Zodyağı Burcunuz: " + horoScope);
        }

    }
}
