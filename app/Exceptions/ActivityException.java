package Exceptions;

/**
 * Created by Asus on 09/06/2015.
 */
public class ActivityException extends Exception {
    public ActivityException(String cause) {
        super("La actividad"+cause);
    }
}
