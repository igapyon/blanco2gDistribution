package blanco.db;

import java.sql.Connection;
import java.sql.SQLException;

public class BlancoDbConnectionUtil {

    public static Connection getConnection() {
        // getConnection
        return null;
    }

    public static void releaseConnection(final Connection conn) {
        try {
            conn.rollback();
            conn.close();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
