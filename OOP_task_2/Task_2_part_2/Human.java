import java.util.ArrayList;

public class Human extends People implements ActionInterface {

    public Human(String fullName) {
        super(fullName);

    }

    @Override
    public void pull(Closet Closet) {
        try {
            ArrayList<String> tmp = Closet.getItems();
            System.out.println("Взята вешь " + tmp.get(0));
            tmp.remove(0);
            int count = Closet.getCapacity() - Closet.getItems().size();
            System.out.println("свободного места " + String.valueOf(count));
            Closet.setElement(tmp);
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
        ;
    }

    @Override
    public void get_access(Closet closet) {
        if (closet.getStatusDoor() == StatusDoor.open) {
            System.out.println("действие удачно.дверь уже открыта");
        } else {
            closet.setStatusDoor(StatusDoor.open);
            System.out.println("действие удачно.дверь открыта");
        }
    }

    @Override
    public void terminate_access(Closet closet) {
        if (closet.getStatusDoor() != StatusDoor.open) {
            System.out.println("действие невозможно.дверь уже закрыта");
        } else {
            System.out.println("действие удачно.дверь закрыта");
            closet.setStatusDoor(StatusDoor.closet);
        }
    }
}