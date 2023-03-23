
public class Main {
    public static void main(String[] args) {
        byte capacity = 30;
        Closet myCloset = new Closet(capacity);
        Human myHuman = new Human("тестовый человек");
        Сhild myHumanChild = new Сhild("тестовый ребенок");
        myHuman.get_access(myCloset);
        myHuman.get_access(myCloset);

        for (int i = 0; i < 31; i++) {
            myHuman.put(myCloset);
        }

        for (int i = 0; i < 35; i++) {
            myHuman.pull(myCloset);
        }
        for (int i = 0; i < 10; i++) {
            myHuman.put(myCloset);
        }
        myHuman.terminate_access(myCloset);
        myHumanChild.get_access(myCloset);
        myHuman.get_access(myCloset);
        myHumanChild.get_access(myCloset);
        for (int i = 0; i < 31; i++) {
            myHumanChild.put(myCloset);
        }
        for (int i = 0; i < 10; i++) {
            myHuman.pull(myCloset);
        }
    }
}