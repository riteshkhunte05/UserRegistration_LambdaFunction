package user_registration;

@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}
