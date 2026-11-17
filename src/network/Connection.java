package network;

public class Connection implements AutoCloseable {
    private final String address;
    private boolean closed;

    public Connection(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String nextString() throws ConnectionLostException {
        if (closed) {
            throw new ClosedConnectionException();
        }
        if (Math.random() < 0.5) {
            throw new ConnectionLostException("Потеряна связь с " + address);
        }
        return "test connection";
    }

    @Override
    public void close() {
        closed = true;
    }
}
