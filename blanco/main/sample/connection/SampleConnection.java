/*
 * このクラスは 'AbstractSampleConnection' の具象クラスとして blanco Framework によって自動生成されました。
 */
package sample.connection;

import java.sql.Connection;
import java.sql.SQLException;

import blanco.fw.BlancoGeneratedBy;

/**
 * データベース接続をメソッド・パラメータに注入するソースコードを自動生成するサンプル。
 */
@BlancoGeneratedBy(name = "Blanco2g")
public class SampleConnection extends AbstractSampleConnection {
    /**
     * データベース接続を利用したデータベース処理。
     * このメソッド呼び出しの前にデータベース接続が確立され、そしてメソッドが呼び出されます。
     *
     * @param strArg0
     * @throws SQLException
     */
    public void someDatabaseProcess(String strArg0) throws SQLException {
        // [@BlancoInject] Begin database transaction.
        final Connection conn = blanco.db.BlancoDbConnectionUtil.getConnection();
        try {
            super.someDatabaseProcess(conn, strArg0);
        } finally {
            // [@BlancoInject] End database transaction.
            blanco.db.BlancoDbConnectionUtil.releaseConnection(conn);
        }
    }
}
