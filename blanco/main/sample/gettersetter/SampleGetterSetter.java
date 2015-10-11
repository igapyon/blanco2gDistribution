/*
 * このクラスは 'AbstractSampleGetterSetter' の具象クラスとして blanco Framework によって自動生成されました。
 */
package sample.gettersetter;

import blanco.fw.BlancoGeneratedBy;

/**
 * ゲッターセッターの注入のサンプル。
 */
@BlancoGeneratedBy(name = "Blanco2g")
public class SampleGetterSetter extends AbstractSampleGetterSetter {
    /**
     * ゲッター・セッターを付与したいフィールド
     * [@BlancoGetterSetter]
     *
     * @return 取得したい値。
     */
    public String getMyField1() {
        return myField1;
    }

    /**
     * ゲッター・セッターを付与したいフィールド
     * [@BlancoGetterSetter]
     *
     * @param myField1 設定したい値。
     */
    public void setMyField1(final String myField1) {
        this.myField1 = myField1;
    }
}
