import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Animal {
    private LocalDate birthDate;
    private String name;
    private char taxonomy;
    private double weight;
    private double age;
    private boolean healthStatus;
    public Animal(LocalDate birthDate, String name, char taxonomy, double weight, boolean healthStatus){
        this.birthDate=birthDate;
        this.name = name;
        this.taxonomy = taxonomy;
        this.weight  =weight;
    }
    public Animal(LocalDate birthDate, String name, char taxonomy, double weight, double age, boolean healthStatus){
        this.birthDate=birthDate;
        this.name = name;
        this.taxonomy = taxonomy;
        this.weight  =weight;
        this.age = age;
    }
    public void print(){
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(birthDate.format(dt)+""+healthStatus);
    }
}
