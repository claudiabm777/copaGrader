package Exceptions;

/**
 * Created by Asus on 09/06/2015.
 */
public class CriterionException extends  Exception {

    public CriterionException(String cause) {
        super("Este criterio"+cause);
    }
}
