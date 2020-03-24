public class User {

    private static  String userClass;

    public static void setUserClass(String userClass) {
        User.userClass = userClass;
    }

    public static String getUserClass() {
        return userClass;
    }
}
