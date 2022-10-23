public class Main {
    public static void main(String[] args) {
        fio();
        rapl();
    }

    public static void fio() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("ФИО Сотрудника = " + fullName);
        String Upper = fullName.toUpperCase();
        System.out.println("ФИО Сотрудника = " + Upper);
    }

    public static void rapl() {
        String Fio = "Иванов Семён Иванович";
        String FioNew;
        int index = Fio.indexOf('ё');
        if (index == -1) {
            System.out.println("Символ \"ё\" не найден.");
        } else {
            System.out.println("Символ \"ё\" найден, его индекс: " + index);
            FioNew = Fio.replace('ё', 'е');
            System.out.println("Данные ФИО сотрудника = " + FioNew);
        }
    }
}