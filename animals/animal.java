package animals;

import java.util.ArrayList;
/**
 * animals
 */
abstract class animal {
    String name;
    Integer age;
    // String type;
    ArrayList<String> commands;

    protected animal(String name, Integer age) {
        this.name = name;
        this.age = age;
        // this.type = type;
        commands = new ArrayList<String>();
    }
    


public void addCommad(String cmd) {
    commands.add(cmd);
}

public String getCommands() {
    String getCommands = "";
    for (int i=0; i<commands.size(); i++){
        String comm = commands.get(i);
        getCommands = getCommands + ", " + comm;
    }
    return getCommands;
}

// public String getType(){
//     return type;
// }


public String getName() {
    return name;
}

public String getInfo() {
    return String.format("Имя: %s; Возраст:%d; Список команд:%s", name, age, getCommands());
}

}