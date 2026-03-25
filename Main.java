import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ievadi dati");
        String input = sc.nextLine();
//        String input = "22.08.2008";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = LocalDate.parse(input,formatter);
        LocalDate now = LocalDate.now();
        Period p = Period.between(birthDate,now);
        System.out.println(p.getYears()+" "+p.getMonths());
    }
}