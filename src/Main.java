//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("20", "Kirill", "D", "12345");
        Employee employee = new Employee("And", "ERTY", "67890");

        // Вывод информации о студенте и сотруднике
        System.out.println(student.getInfo());
        System.out.println(employee.getInfo());
        }
    }
