package sample.struts;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionMapping;

import blanco.fw.BlancoInject;
import blanco.struts.BlancoStrutsForward;
import blanco.struts.BlancoStrutsLogic;

/**
 * サンプル・ロジック。
 */
@BlancoStrutsLogic(path = "/run", scope="session")
public abstract class AbstractSampleLogic {
    /**
     * 正常系の次画面。
     */
    @BlancoStrutsForward(path = "/next.jsp")
    private static final String FORWARD_SUCCESS = "success";

    /**
     * 異常系画面。
     */
    @BlancoStrutsForward(path = "/error.jsp")
    private static final String FORWARD_ERROR = "error";

    /**
     * ビジネスロジック
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @param conn
     *            メソッド・パラメータによるデータベース接続インジェクション。
     *            このメソッドの呼び出し直前にデータベース・トランザクションが開始され
     *            、このメソッドの終了直後にロールバックとトランザクション終了が実施されます。
     * @return
     * @throws Exception
     */
    public String execute(final ActionMapping mapping, final SampleForm form, final HttpServletRequest request,
            final HttpServletResponse response, @BlancoInject final Connection conn) throws Exception {
        if (true) {
            return FORWARD_SUCCESS;
        } else {
            return FORWARD_ERROR;
        }
    }
}
