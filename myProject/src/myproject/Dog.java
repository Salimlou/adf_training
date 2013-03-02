package myproject;

public class Dog implements IntAnimal {
    String name = "Rex";
    int age;

    public Dog() {
        super();
    }

    public Dog(int age) {
        super();
        this.age = age;
    }

    public String sayHowDoYouDo(String p_sName) {
        return " woof " + p_sName;
    }

    public static void main(String... p_tabArgs) {
        //        Cat myCat = new Cat();
        //TODO create a Cat class
        Dog myDog = new Dog();
        for (int i = 0; i < 3; i++) {
            System.out.println(i + myDog.sayHowDoYouDo("Kate"));
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
