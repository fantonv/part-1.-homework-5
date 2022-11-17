public class Main {
    public static void main(String[] args) {
        //видеоурок

        String phone = "960415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        //task 1
        String firstName = "Ivanov";
        String secondName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + secondName + ' ' + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        //task 2
        fullName = fullName.toUpperCase();
        System.out.println(fullName);

        //task 3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace('ё', 'е');
        System.out.println(fullName1);
    }
}