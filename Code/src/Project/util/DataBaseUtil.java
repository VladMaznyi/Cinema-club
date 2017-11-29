package Project.util;

public class DataBaseUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/exemple";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String CLASS_NAME = "com.mysql.jdbc.Driver";

    public static String getURL() {
        return URL;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static String getClassName() {
        return CLASS_NAME;
    }
}
