package animals;
import java.util.ArrayList;

public class pets extends animal{

    String name;
    Integer age;
    // String type;
    ArrayList<String> commands;

    protected pets(String name, Integer age) {
       super(name, age);
    }
}


class cat extends pets {
    protected cat(String name, Integer age) {
        super(name, age);
     }
}

class dog extends pets {
    protected dog(String name, Integer age) {
        super(name, age);
     }
}

class hamster extends pets {
    protected hamster(String name, Integer age) {
        super(name, age);
     }
}

class guineaPig extends pets {
    protected guineaPig(String name, Integer age) {
        super(name, age);
     }
}

class fish extends pets {
    protected fish(String name, Integer age) {
        super(name, age);
     }
}


