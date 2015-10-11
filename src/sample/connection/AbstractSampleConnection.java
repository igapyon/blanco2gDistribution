package sample.connection;

import java.sql.Connection;
import java.sql.SQLException;

import blanco.fw.BlancoInject;

/**
 * データベース接続をメソッド・パラメータに注入するソースコードを自動生成するサンプル。
 */
public abstract class AbstractSampleConnection {
    /**
     * データベース接続を利用したデータベース処理。
     * 
     * このメソッド呼び出しの前にデータベース接続が確立され、そしてメソッドが呼び出されます。
     * 
     * @param conn
     *            このメソッド呼び出しをトランザクションとするデータベースコネクション。このメソッドの呼び出し元は、
     *            このメソッド・パラメータを省略することができるようになります。
     * @param strArg0
     * @throws SQLException
     */
    public void someDatabaseProcess(@BlancoInject final Connection conn, final String strArg0) throws SQLException {
        // ここでデータベース処理を行います。

        // 処理の最後に、必要におうじてコミットを行います。
    }
}
