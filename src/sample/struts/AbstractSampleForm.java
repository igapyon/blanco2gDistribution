package sample.struts;

import org.apache.struts.action.ActionForm;

import blanco.gettersetter.BlancoGetterSetter;
import blanco.name.BlancoLogicalName;
import blanco.struts.BlancoStrutsForm;
import blanco.struts.BlancoStrutsReset;
import blanco.validate.BlancoValidateLength;
import blanco.validate.BlancoValidateMethodForStruts;
import blanco.validate.BlancoValidateRequired;

/**
 * サンプル・フォーム。
 */
@BlancoStrutsForm
public abstract class AbstractSampleForm extends ActionForm {
    private static final long serialVersionUID = 1L;

    /**
     * 文字列のフィールド。
     */
    @BlancoGetterSetter
    @BlancoStrutsReset
    @BlancoLogicalName(name = "フィールド1")
    @BlancoValidateMethodForStruts
    @BlancoValidateRequired
    @BlancoValidateLength(max = 5)
    protected String field1 = "";

    /**
     * 整数のフィールド。
     */
    @BlancoGetterSetter
    protected int field2 = -1;
}
