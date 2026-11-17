package network;

public class Main {
    public static void main() {
        //4.1.2
        ConnectionLostException empty = new ConnectionLostException();
        ConnectionLostException withMessage = new ConnectionLostException("Связь потеряна");
        ConnectionLostException withCause = new ConnectionLostException(
                new IllegalStateException("Сеть недоступна"));
        ConnectionLostException withBoth = new ConnectionLostException(
                "Связь потеряна", new IllegalStateException("Сеть недоступна"));
        System.out.println(empty.getClass().getSimpleName());
        System.out.println(withMessage.getMessage());
        System.out.println(withCause.getCause());
        System.out.println(withBoth.getMessage() + ": " + withBoth.getCause());
        //4.1.2

        //4.1.4
        Connection connection = new Connection("ermakov.edu");
        System.out.println("Подключение к " + connection.getAddress());
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(connection.nextString());
            } catch (ConnectionLostException error) {
                System.out.println(error.getMessage());
            }
        }
        connection.close();
        //4.1.4

        //4.1.3
        try {
            connection.nextString();
        } catch (ClosedConnectionException error) {
            System.out.println("Нельзя запросить данные: подключение закрыто");
        } catch (ConnectionLostException error) {
            throw new IllegalStateException("Закрытое подключение не должно терять связь", error);
        }
        //4.1.3
    }
}
