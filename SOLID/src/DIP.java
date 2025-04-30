/*
- High-level modules should not depend on low-level modules. Both should depend on the abstraction.

- Abstractions should not depend on details. Details should depend on abstractions.

public class OrderService {
    private MySQLDatabase database;

    public OrderService() {
        database = new MySQLDatabase();
    }

    public void placeOrder(Order order) {
        database.connect();
        database.save(order);
        database.disconnect();
    }
}

public class Postgres {
 public void connect() {
        // MySQL-specific connection code
    }

    public void save(Order order) {
        // MySQL-specific save operation
    }

    public void disconnect() {
        // MySQL-specific disconnect operation
    }
}

public class MySQLDatabase {
    public void x()
    public void connect() {
        // MySQL-specific connection code
    }

    public void save(Order order) {
        // MySQL-specific save operation
    }

    public void disconnect() {
        // MySQL-specific disconnect operation
    }
}


======================================
OrderService directly depends on MySQLDatabase
Can't easily switch to a different database implementation


========================================
public interface Database {
    void connect();
    void save(Order order);
    void disconnect();
}

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        // MySQL-specific connection code
    }

    @Override
    public void save(Order order) {
        // MySQL-specific save operation
    }

    @Override
    public void disconnect() {
        // MySQL-specific disconnect operation
    }
}

public class PostgreSQLDatabase implements Database {
    @Override
    public void connect() {
        // PostgreSQL-specific connection code
    }

    @Override
    public void save(Order order) {
        // PostgreSQL-specific save operation
    }

    @Override
    public void disconnect() {
        // PostgreSQL-specific disconnect operation
    }
}

public class OrderService {
    private Database database;

    public OrderService(Database database) {
        this.database = database;
    }

    public void placeOrder(Order order) {
        database.connect();
        database.save(order);
        database.disconnect();
    }
}


===========================
OrderService depends on an abstraction (Database interface)
Can easily swap database implementations
Can provide a mock database for testing
Reduced coupling between business logic and data access
 */



public class DIP {
}
