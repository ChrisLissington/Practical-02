package To_Do_List;

public interface IAuthenticationService {
    User signUp(String username, String password);
    User logIn(String username, String password);
}
