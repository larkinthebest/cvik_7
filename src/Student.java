public class Student {
     int age;
     String name;
     String surname;
     String id;

    public Student(int age, String name, String surname, String id) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.id = id;
    }


    public void getInfo() {
        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Age: " + student.getAge());
        System.out.println("id: " + student.getid());
    }


}
