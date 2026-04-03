package common;

public class UserService {

    public String getUserRole(String username) {
        if (username.equals("admin")) {
            return "ADMIN";
        } else if (username.equals("guest")) {
            return "GUEST";
        }
        return "USER";
    }

    public boolean isActiveUser(String username) {
        return true;
    }

    public String getUserDepartment(String username) {
        return "GENERAL";
    }
}