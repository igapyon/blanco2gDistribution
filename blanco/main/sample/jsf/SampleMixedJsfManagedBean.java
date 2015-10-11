/*
 * このクラスは 'AbstractSampleMixedJsfManagedBean' の具象クラスとして blanco Framework によって自動生成されました。
 */
package sample.jsf;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

import javax.el.ELContext;
import javax.el.ELResolver;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import blanco.fw.BlancoGeneratedBy;

/**
 * Java EE 6 の JSF の管理 Bean を自動生成するサンプル。
 */
@BlancoGeneratedBy(name = "Blanco2g")
@ManagedBean
@ViewScoped
public class SampleMixedJsfManagedBean extends AbstractSampleMixedJsfManagedBean implements Serializable {
    /**
     * シリアルバージョン UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * 画面に公開するフィールド。
     * [@BlancoGetterSetter]
     *
     * @return 取得したい値。
     */
    public String getFieldText() {
        return fieldText;
    }

    /**
     * 画面に公開するフィールド。
     * [@BlancoGetterSetter]
     *
     * @param fieldText 設定したい値。
     */
    public void setFieldText(final String fieldText) {
        this.fieldText = fieldText;
    }

    /**
     * 管理 Bean の処理のエントリポイント。
     *
     * @return  メソッドの処理結果。
     * @throws SQLException
     */
    public String sayHello() throws SQLException {
        java.lang.String autoValMethodResult;
        final FacesContext ctx = FacesContext.getCurrentInstance();
        final ELContext autoValElc = ctx.getELContext();
        final ELResolver autoValRslvr = ctx.getApplication().getELResolver();
        final OtherManagedBean otherManagedBean = (OtherManagedBean) autoValRslvr.getValue(autoValElc, null, "otherManagedBean");
        // [@BlancoInject] Begin database transaction.
        final Connection conn = blanco.db.BlancoDbConnectionUtil.getConnection();
        try {
            autoValMethodResult = super.sayHello(conn, ctx, otherManagedBean);
        } finally {
            // [@BlancoInject] End database transaction.
            blanco.db.BlancoDbConnectionUtil.releaseConnection(conn);
        }
        return autoValMethodResult;
    }
}
