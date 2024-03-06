package To_Do_List;

import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService{
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService(User user){
        users = new ArrayList<User>();
        users.add(user);
    }
    @Override
    public User signUp(String username, String password) {
        return null;
    }

    @Override
    public User logIn(String username, String password) {
        return null;
    }

}
