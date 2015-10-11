/*
 * このクラスは 'AbstractSampleLogic' の具象クラスとして blanco Framework によって自動生成されました。
 */
package sample.struts;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionMapping;

import blanco.fw.BlancoGeneratedBy;

/**
 * サンプル・ロジック。
 */
@BlancoGeneratedBy(name = "Blanco2g")
public class SampleLogic extends AbstractSampleLogic {
    /**
     * ビジネスロジック
     *
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public String execute(ActionMapping mapping, SampleForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        java.lang.String autoValMethodResult;
        // [@BlancoInject] Begin database transaction.
        final Connection conn = blanco.db.BlancoDbConnectionUtil.getConnection();
        try {
            autoValMethodResult = super.execute(mapping, form, request, response, conn);
        } finally {
            // [@BlancoInject] End database transaction.
            blanco.db.BlancoDbConnectionUtil.releaseConnection(conn);
        }
        return autoValMethodResult;
    }
}
