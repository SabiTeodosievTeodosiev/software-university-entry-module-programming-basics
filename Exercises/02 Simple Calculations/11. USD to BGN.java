// АКО ПРЕПИСВАТЕ ДРАГНЕТЕ ФАЙЛА В JUDJE (Java code)
import java.util.Scanner;

public class UsdToBgn {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        double usd = Double.parseDouble(console.nextLine());
        double bgn = usd*1.79549;
        System.out.printf("%.2f", bgn);
    }
}