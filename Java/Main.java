import java.util.*;

class ParentClass {
    public boolean isTrue() {
        return true;
    }
}

class ChildClass extends ParentClass {
    public boolean isTrue() {
        // calls parent implementation of isTrue()
        boolean parentResult = super.isTrue();
        // negates the parent result
        return !parentResult;
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        // calls child implementation
        // of isTrue()
        boolean result = child.isTrue();

        // prints "false"
        System.out.println(result);
    }
}
