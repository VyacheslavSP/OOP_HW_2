import java.util.ArrayList;

public class Сhild extends People implements ActionInterface {

    public Сhild(String fullName) {
        super(fullName);
    }

    @Override // вероятно правильно не копипастить это а в интерфейсе расписать действия, а
              // переопределять только отличающиюся действия
    public void pull(Closet closet) {
        try {
            ArrayList<String> tmp = closet.getItems();
            System.out.println("Взята вешь " + tmp.get(0));
            tmp.remove(0);
            int count = closet.getCapacity() - closet.getItems().size();
            System.out.println("свободного места " + String.valueOf(count));
            closet.setElement(tmp);
        } catch (Exception e) {
            System.out.println("действие невозможно.шкаф пуст");
        }
    }

    @Override
    public void put(Closet closet) {
        if (closet.getStatusDoor() == StatusDoor.open) {
            int count = closet.getCapacity() - closet.getItems().size();
            System.out.println("свободного места " + String.valueOf(count));
            if (count > 0) {
                ArrayList<String> tmp = closet.getItems();
                tmp.add("Вещь");
                closet.setElement(tmp);
                System.out.println("Действие удачно вещь добавлена");
            } else {
                System.out.println("действие невозможно. кончилось место");
            }
        } else {
            System.out.println("действие невозможно.дверь закрыта");
        }
    }

    @Override
    public void get_access(Closet closet) {
        if (closet.getStatusDoor() == StatusDoor.open) {
            System.out.println("действие удачно.дверь уже была открыта");
        } else {
            System.out.println("действие невозможно. шкаф закрыт для детей");
        }
    }

    @Override
    public void terminate_access(Closet closet) {
        if (closet.getStatusDoor() != StatusDoor.open) {
            System.out.println("действие невозможно.дверь уже закрыта");
        } else {
            System.out.println("действие невозможно.у детей нет ключа");
        }
    }
}
