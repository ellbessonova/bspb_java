public class Lesson_2 {
    public static void main(String[] args) {
        String[][] clients = {
                {"Петрова Нина Сергеевна", "жен", "40"},
                {"Иванов Иван Иванович", "муж", "35"},
                {"Киселева Светлана Сергеевна", "жен", "50"},
                {"Сидоров Роман Георгиевич", "муж", "63"},
                {"Романов Михаил Олегович", "муж", "32"},
                {"Иванова Любовь Федоровна", "жен", "44"},
                {"Матроскин Олег Владимирович", "муж", "38"},
                {"Николаев Дмитрий Петрович", "муж", "51"},
                {"Федоров Петр Олегович", "муж", "42"},
                {"Николаева Наталья Сергеевна", "жен", "47"},
        };
        for (int a = 0; a < clients.length; a++) { //столбцы
            for (int b = 0; b < clients[a].length; b++) { //строки
                // i - номер прохода
                for (int i = 0; i < clients.length - 1; i++) {
                    for (int j = clients.length - 1; j > i; j--) {
                        if (Integer.parseInt(clients[j - 1][2]) > Integer.parseInt(clients[j][2])) {
                            for (int p = 0; p < clients[a].length; p++) {
                                String item = clients[j - 1][p];
                                clients[j - 1][p] = clients[j][p];
                                clients[j][p] = item;
                            }
                        }
                    }
                }
                if (clients[a][1] == "муж") {
                    System.out.print(clients[a][b] + " ");
                    if ((a != clients.length - 1)) {
                        if ((b == clients[a].length - 1))
                            System.out.println();
                    }
                }
            }
        }
    }
}


