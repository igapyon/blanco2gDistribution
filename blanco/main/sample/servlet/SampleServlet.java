/*
 * このクラスは 'AbstractSampleServlet' の具象クラスとして blanco Framework によって自動生成されました。
 */
package sample.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blanco.fw.BlancoGeneratedBy;

/**
 * Java Servlet のエントリーポイントにデータベース接続の自動注入をおこなうサンプル。
 */
@BlancoGeneratedBy(name = "Blanco2g")
public class SampleServlet extends AbstractSampleServlet {
    /**
     * POST メソッドのエントリーポイント。
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // [@BlancoInject] Begin database transaction.
        final Connection conn = blanco.db.BlancoDbConnectionUtil.getConnection();
        try {
            super.doPost(req, resp, conn);
        } finally {
            // [@BlancoInject] End database transaction.
            blanco.db.BlancoDbConnectionUtil.releaseConnection(conn);
        }
    }
}
