package vn.edu.vnuk.shopping.exception.account;

public class AccountInactiveException extends Exception {

    public AccountInactiveException(long accountId){
        super("AccountInactiveException with accountId = " + accountId);
    }

    public AccountInactiveException(String email) {
        super("AccountInactiveException with email = " + email);
    }
}
