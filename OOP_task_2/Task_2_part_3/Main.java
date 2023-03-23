/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Human Ivan = new Human("Иван");
        Cat Barsik = new Cat("Барсик");
        System.out.println(Barsik.getName());

        Barsik.setName("null");
        System.out.println(Barsik.getName());
        Barsik.setName("Барс");
        Barsik.setCommand(command.giveFood, Ivan);
        while (true) {
            Barsik.setCommand(command.pat, Ivan); // пример,как запретить выполнение
            // команды по таймеру
            if (Barsik.validStatus) {
                break;
            }
        }
        Barsik.setCommand(command.call, Ivan);
        while (true) {
            Barsik.setCommand(command.command_voice, Ivan);
            if (Barsik.validStatus) {
                break;
            }
        }
        Barsik.setCommand(command.command_voice, Ivan);

    }
}