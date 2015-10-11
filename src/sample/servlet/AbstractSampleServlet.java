package sample.servlet;

import java.sql.Connection;

import blanco.fw.BlancoInject;

/**
 * Java Servlet のエントリーポイントにデータベース接続の自動注入をおこなうサンプル。
 */
public abstract class AbstractSampleServlet extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * POST メソッドのエントリーポイント。
     * 
     * @param req
     * @param resp
     * @param conn
     *            このメソッド呼び出しをトランザクションとするデータベースコネクション。このメソッドの呼び出し元は、
     *            このメソッド・パラメータを省略することができるようになります。
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    protected void doPost(final javax.servlet.http.HttpServletRequest req,
            final javax.servlet.http.HttpServletResponse resp, final @BlancoInject Connection conn)
            throws javax.servlet.ServletException, java.io.IOException {
        // データベース入出力をともなうサーブレットの処理。

        // 必要に応じてデータベースのコミット処理を実施。
    }
}
