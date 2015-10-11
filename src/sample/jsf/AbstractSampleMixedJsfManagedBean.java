package sample.jsf;

import java.sql.Connection;
import java.sql.SQLException;

import javax.faces.context.FacesContext;

import blanco.fw.BlancoInject;
import blanco.gettersetter.BlancoGetterSetter;
import blanco.jsf.BlancoJsfManagedBean;

/**
 * Java EE 6 の JSF の管理 Bean を自動生成するサンプル。
 */
@BlancoJsfManagedBean
public abstract class AbstractSampleMixedJsfManagedBean {
    /**
     * 画面に公開するフィールド。
     */
    @BlancoGetterSetter
    protected String fieldText;

    /**
     * 管理 Bean の処理のエントリポイント。
     * 
     * @param conn
     *            このメソッド呼び出しをトランザクションとするデータベースコネクション。このメソッドの呼び出し元である XHTML 上からは、
     *            このメソッド・パラメータを省略することができるようになります。
     * @param ctx
     *            JSF コンテキスト・オブジェクト。このメソッドの呼び出し元である XHTML
     *            上からは、このメソッド・パラメータを省略することができるようになります。
     * @param otherManagedBean
     *            この Bean から参照をおこないたい他の管理 Bean。このメソッドの呼び出し元である XHTML
     *            上からは、このメソッド・パラメータを省略することができるようになります。
     * @return メソッドの処理結果。
     * @throws SQLException
     */
    public String sayHello(@BlancoInject Connection conn, @BlancoInject final FacesContext ctx,
            @BlancoInject final OtherManagedBean otherManagedBean) throws SQLException {
        // ここで何かしらの処理を行います。

        conn.commit();

        return "こんにちは。";
    }
}
