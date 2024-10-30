public class Employee implements person {
    String age;
    String name;
    String surname;


    public Employee(String age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void getinfo(){
        System.out.println("age" + age + "Name: " + name +  "surname" + surname);
    }
}


