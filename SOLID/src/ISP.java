/*

Clients should not be forced to depend on methods that they do not use.


public interface Worker {
    void work();
    void eat();
    void sleep();
}

public class Human implements Worker {
    @Override
    public void work() {
        // Human working logic
    }

    @Override
    public void eat() {
        // Human eating logic
    }

    @Override
    public void sleep() {
        // Human sleeping logic
    }
}

public class Robot implements Worker {
    @Override
    public void work() {
        // Robot working logic
    }

    @Override
    public void eat() {
        // Robots don't eat, but forced to implement
        throw new UnsupportedOperationException("Robots don't eat");
    }

    @Override
    public void sleep() {
        // Robots don't sleep, but forced to implement
        throw new UnsupportedOperationException("Robots don't sleep");
    }
}

=========================================
Robot is forced to implement methods it doesn't need
Client code can't reliably call all methods on any Worker
Interface is too broad, serving multiple unrelated concerns
 */





/*
public interface Workable {
    void work();
}

public interface Eatable {
    void eat();
}

public interface Sleepable {
    void sleep();
}

public class Human implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        // Human working logic
    }

    @Override
    public void eat() {
        // Human eating logic
    }

    @Override
    public void sleep() {
        // Human sleeping logic
    }
}

public class Robot implements Workable {
    @Override
    public void work() {
        // Robot working logic
    }
}

===============================
Classes only implement the interfaces they need
No unnecessary methods
Client code can depend only on the interfaces it requires
Interfaces are focused and cohesive
 */



public class ISP {
}
