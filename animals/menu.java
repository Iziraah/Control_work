package animals;
import java.util.Scanner;

public class menu {
    Scanner in;
    
    public void Menu(){
        try (Scanner in = new Scanner(System.in)) {
            model m = new model();
            System.out.println("Здравствуйте! Что мы сегодня будем делать?");
            System.out.println("Введите номер желаемой операции:\n" + 
            "0 - Добавить новое животное;\n" + 
            "1 - Посмотреть умения животного;\n" +
            "2 - Желаете обучить животное новым командам?");
            int wish = in.nextInt();
            // System.out.println(wish);
            if (wish == 0){            
                m.addAnimal();
            }
            if(wish == 1){
                m.showComm();
            }
            if(wish == 2){
                m.addNewComm();
            }
            else {
                System.out.println("Такого пункта в меню нет, бро. Давай, еще раз");
            }
        }
    }
}
