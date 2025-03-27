package week2;

public class Employee {

    // Nitelikler
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi Hesaplama Metodu
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;  // Maaşın %3'ü kadar vergi uygulanır
        }
    }

    // Bonus Hesaplama Metodu
    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;  // Fazla mesai saatleri için 30 TL ödeme yapılır
        } else {
            return 0;
        }
    }

    // Maaş Artışı Hesaplama Metodu
    public void raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) {
            salary += salary * 0.05;  // %5 zam yapılır
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            salary += salary * 0.10;  // %10 zam yapılır
        } else {
            salary += salary * 0.15;  // %15 zam yapılır
        }
    }

    // Çalışan Bilgileri Metodu
    public String toString() {
        return "Çalışan Adı: " + name + "\n" +
                "Maaş: " + salary + "\n" +
                "Haftalık Çalışma Saati: " + workHours + "\n" +
                "İşe Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n";
    }


    public static void main(String[] args) {
        Employee employee = new Employee("Gülgen Demir", 50000, 64, 2020);
        System.out.println(employee.toString());

        // Maaş artışı yapılır
        employee.raiseSalary();


        System.out.println("Maaş Artışı Sonrası Bilgiler:");
        System.out.println(employee.toString());
    }
}