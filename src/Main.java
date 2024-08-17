import service.exception.WrongLoginException;
import service.exception.WrongPasswordException;

import static service.ValidationService.validateUser;

public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        try {
            validateUser(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Вход не выполнен: " + e.getMessage());
        } finally {
            System.out.println("\uD83D\uDE08");
        }
    }
}
