public class Student {
    String age;
     String name;
     String surname;
     String id;

    public Student(String age, String name, String surname, String id) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.id = id;
    }



    public void getinfo(){
        System.out.println("age" + age + "Name: " + name +  "surname" + surname + "id" + id);
    }
}
