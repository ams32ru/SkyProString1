public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fulName = lastName +  firstName + middleName ;
        System.out.println(" ФИО сотрудника - " + fulName);

        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fulName.toUpperCase());
        System.out.println("Задание 3");
        fulName = fulName.replace("ё", "е");
        System.out.println("данные ФИО сотрудника - " + fulName);
    }
}