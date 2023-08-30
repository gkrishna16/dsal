//class Man {
//    int maxSpeed = 120;

//    void Message() {
//        System.out.println("The show function from the Man class.");
//    }

//}

//class Gopal extends Man {
//    int maxSpeed = 180;

//    void display() {
//        System.out.println("Maximum Speed: " + super.maxSpeed);
//        Message();
//        super.Message();
//    }

//    void Message() {
//        System.out.println("The show function from the Gopal class.");
//    }
//}

//public class Person {
//    public static void main(String[] args) {
//        Gopal gp = new Gopal();
//        gp.display();
//    }
//}

class Person1 {
    Person1() {
        System.out.println("Person class Constructor.");
    }
}

// subclass Student extending the person class
class Student extends Person1 {
    Student() {
        // invoke or call parent class constructor
        super();
        System.out.println("Student class constructor.");
    }
}

// Driver Program
class Person {
    public static void main(String[] main) {
        Student s = new Student();
    }
}