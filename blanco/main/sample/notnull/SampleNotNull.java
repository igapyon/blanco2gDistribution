/*
 * このクラスは 'AbstractSampleNotNull' の具象クラスとして blanco Framework によって自動生成されました。
 */
package sample.notnull;

import blanco.fw.BlancoGeneratedBy;

/**
 * メソッドのパラメータに非 NULL チェックをおこなうソースコードを自動生成するサンプル。
 */
@BlancoGeneratedBy(name = "Blanco2g")
public class SampleNotNull extends AbstractSampleNotNull {
    /**
     * メソッドのパラメータに非 NULL チェックをおこなうソースコードを自動生成するサンプル。
     *
     * @param arg1 非 NULL 制約を付与したいパラメータ。
     * @param arg2 通常のパラメータ。
     * @return
     */
    public String methodWithParamCheck(String arg1, String arg2) {
        java.lang.String autoValMethodResult;
        if (arg1 == null) {
            throw new IllegalArgumentException("不正引数例外: SampleNotNull#methodWithParamCheck(String arg1, String arg2) のパラメータ 'arg1' に null を与えることはできません。");
        }
        autoValMethodResult = super.methodWithParamCheck(arg1, arg2);
        return autoValMethodResult;
    }
}
