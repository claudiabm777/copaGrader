package Exceptions;

/**
 * Created by Asus on 09/06/2015.
 */
public class ClaimException extends Exception {
    public ClaimException(String cause) {
        super("Este reclamo"+cause);
    }
}
