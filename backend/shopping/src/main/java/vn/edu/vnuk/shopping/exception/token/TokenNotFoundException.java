package vn.edu.vnuk.shopping.exception.token;

public class TokenNotFoundException extends Exception {

    public TokenNotFoundException(String accessToken){
        super("TokenNotFoundException with accessToken = " + accessToken);
    }
}
