package service;
import service.exception.WrongLoginException;
import service.exception.WrongPasswordException;

public class ValidationService {
    public static void validateUser(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        // Проверка логина и пароля
        if (login == null || login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания, и быть не длиннее 20 символов.");
        }
        else if (password == null || password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, и быть не длиннее 20 символов.");
        }
        // Проверка совпадения паролей
        else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        } else {
        System.out.println("Вы вошли.");
        }
    }
}
