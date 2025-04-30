/*
A class should have a single responsibility
 */

//public class User {
//    private String name;
//    private String email;
//
//    // SRP properties and methods
//    public void saveUser() {
//        // Database connection code
//        // SQL to save user
//        // Connection closing code
//    }
//
//    public void sendWelcomeEmail() {
//        // Email server connection
//        // Email composition
//        // Email sending logic
//    }
//
//    public boolean validateUser() {
//        // Complex validation logic
//        return false;
//    }
//}




/*The SRP class handles multiple responsibilities: data storage, email sending, validation
Changes to database connectivity require modifying the SRP class
Changes to email requirements require modifying the SRP class
Testing is difficult as all concerns are mixed together
 */

/*
public class User {
    private String name;
    private String email;

    // Getters, setters, domain logic only
}

public class UserRepository {
    public void save(SRP user) {
        // Database operations only
    }
}

public class EmailService {
    public void sendWelcomeEmail(SRP user) {
        // Email operations only
    }
}

public class UserValidator {
    public boolean isValid(SRP user) {
        // Validation logic only
    }
}

=========================
Each class has a single responsibility
Changes to database code don't affect email functionality
Classes can be tested in isolation
Code is more reusable across different contexts
 */


public class SRP {}