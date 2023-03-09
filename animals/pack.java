package animals;
import java.util.ArrayList;

class pack extends animal{
    String name;
    Integer age;
    // String type;
    ArrayList<String> commands;

    protected pack (String name, Integer age) {
        super(name, age);
    }
}
class horse extends pack {
    protected horse(String name, Integer age) {
        super(name, age);
     }
}
class mule extends pack {
    protected mule (String name, Integer age) {
        super(name, age);
     }
}
class donkey extends pack {
    protected donkey (String name, Integer age) {
        super(name, age);
     }
}
class camel extends pack {
    protected camel (String name, Integer age) {
        super(name, age);
     }
}
