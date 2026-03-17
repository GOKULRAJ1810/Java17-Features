//class Person{
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}

record Person(String name,int age){}

public class Record {
    public static void main(String[] args) {
        Person person=new Person("ram",22);
        System.out.println(person.name());
        System.out.println(person.age());
    }
}
