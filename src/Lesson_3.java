import java.util.*;

public class Lesson_3 {
    public static void main(String[] args) {
        Client[] clients = new Client[]{
                new Client("Петрова Нина Сергеевна", "жен", 40),
                new Client("Иванов Иван Иванович", "муж", 35),
                new Client("Киселева Светлана Сергеевна", "жен", 50),
                new Client("Сидоров Роман Георгиевич", "муж", 63),
                new Client("Романов Михаил Олегович", "муж", 32),
                new Client("Иванова Любовь Федоровна", "жен", 44),
                new Client("Матроскин Олег Владимирович", "муж", 38),
                new Client("Федоров Петр Олегович", "муж", 42),
                new Client("Федоров Петр Олегович", "муж", 42),
                new Client("Федоров Петр Олегович", "муж", 42),
        };

        List<Client> list = new LinkedList<>();

        for (int i = 0; i < clients.length - 1; i++) {
            for (int j = clients.length - 1; j > i; j--) {
                if (clients[j - 1].getAge() > clients[j].getAge()) {
                    Client item = clients[j - 1];
                    clients[j - 1] = clients[j];
                    clients[j] = item;
                }
            }
        }
        for (int i = 0; i < clients.length - 2; i++) {
            if (!clients[i].equals(clients[i + 1])) {
                list.add(clients[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGender() == "муж") {
                System.out.print(list.get(i).getName() + " " + list.get(i).getGender() + " " + list.get(i).getAge());
                if ((i != list.size() - 1)) {
                    System.out.println();
                }
            }
        }
    }
}


