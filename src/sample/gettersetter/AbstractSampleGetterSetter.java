package sample.gettersetter;

import blanco.gettersetter.BlancoGetterSetter;

/**
 * ゲッターセッターの注入のサンプル。
 */
public abstract class AbstractSampleGetterSetter {
    /**
     * ゲッター・セッターを付与したいフィールド
     */
    @BlancoGetterSetter
    protected String myField1;
}
