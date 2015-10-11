/*
 * このクラスは 'AbstractSampleForm' の具象クラスとして blanco Framework によって自動生成されました。
 */
package sample.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import blanco.fw.BlancoGeneratedBy;
import blanco.validate.BlancoValidateRuntimeUtil;

/**
 * サンプル・フォーム。
 */
@BlancoGeneratedBy(name = "Blanco2g")
public class SampleForm extends AbstractSampleForm {
    /**
     * シリアルバージョン UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * リセット
     *
     * @param mapping アクション・マッピング.
     * @param request リクエスト.
     */
    public void reset(final ActionMapping mapping, final HttpServletRequest request) {
        field1 = "";
    }

    /**
     * 文字列のフィールド。
     * [@BlancoGetterSetter]
     *
     * @return 取得したい値。
     */
    public String getField1() {
        return field1;
    }

    /**
     * 文字列のフィールド。
     * [@BlancoGetterSetter]
     *
     * @param field1 設定したい値。
     */
    public void setField1(final String field1) {
        this.field1 = field1;
    }

    /**
     * 文字列のフィールド。
     * [@BlancoValidateRequired]
     * [@BlancoValidateLength]
     *
     * @return 検証結果の文字列。問題なければ null。
     */
    public String validateField1() {
        // [@BlancoValidateRequired]
        if (field1 == null || BlancoValidateRuntimeUtil.trim(field1).length() == 0) {
            return "「フィールド1」に値が入力されていません。";
        }
        // [@BlancoValidateLength]
        {
            final String value = (field1 == null ? "" : field1.toString());
            if (value.length() == 0) {
                // 長さが 1 以上のもののみ検証対象とします。
            } else if (value.length() > 5) {
                return "「フィールド1」は 5 文字以下で入力してください。";
            }
        }
        return null;
    }

    /**
     * 文字列のフィールド。
     * [@BlancoValidateMethodForStruts]
     * [@BlancoValidateLength]
     *
     * @param actionMessages Apache Struts ActionMessages
     * @return 検証結果が問題無しであれば true。検証結果に問題あれば false。
     */
    public boolean validateField1(final ActionMessages actionMessages) {
        // [@BlancoValidateRequired]
        if (field1 == null || BlancoValidateRuntimeUtil.trim(field1).length() == 0) {
            final ActionMessage msg = new ActionMessage("message.blanco.validate.required.input", "フィールド1");
            actionMessages.add("WARN", msg);
            return false;
        }
        // [@BlancoValidateLength]
        {
            final String value = (field1 == null ? "" : field1.toString());
            if (value.length() == 0) {
                // 長さが 1 以上のもののみ検証対象とします。
            } else if (value.length() > 5) {
                final ActionMessage msg = new ActionMessage("message.blanco.validate.length.max", "フィールド1", "5");
                actionMessages.add("WARN", msg);
                return false;
            }
        }
        return true;
    }

    /**
     * 整数のフィールド。
     * [@BlancoGetterSetter]
     *
     * @return 取得したい値。
     */
    public int getField2() {
        return field2;
    }

    /**
     * 整数のフィールド。
     * [@BlancoGetterSetter]
     *
     * @param field2 設定したい値。
     */
    public void setField2(final int field2) {
        this.field2 = field2;
    }
}
