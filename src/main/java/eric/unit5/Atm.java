package eric.unit5;

import java.util.*;

class Atm {
    private HashMap<Integer, User> users = new HashMap<>(25);

    @SuppressWarnings("resource")
    public User getOrCreateUser(int id) {
        var user = users.get(id);
        var scanner = new Scanner(System.in); // Ignore warning, reusing scanner
        if (user == null) {
            if (users.size() == 25) {
                System.out.println("Maximum users created. (25)");
                return null;
            }
            System.out.println("Input a new password. ");
            var password = scanner.nextLine();
            users.put(id, user = new User(password));
            return user;
        }
        System.out.println("What's the password?");
        String password = scanner.nextLine();
        if (user.checkPassword(password)) {
            return user;
        }
        System.out.println("That isn't right.");
        return null;
    }
}

class User {
    private double balance = 0;
    private String password;

    public User(String pass) {
        password = pass;
        balance = Math.random() * 100 + 1;
    }

    public boolean checkPassword(String input) {
        return password == input;
    }

    public double getBalance() { 
        return balance; 
    }
    
    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        amount += 20 - amount % 20;
        balance -= amount;
        return amount;
    }

    public void setPassword(String pass) {
        password = pass;
    }
}
