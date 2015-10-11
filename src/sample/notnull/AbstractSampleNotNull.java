package sample.notnull;

import blanco.notnull.BlancoNotNull;

/**
 * メソッドのパラメータに非 NULL チェックをおこなうソースコードを自動生成するサンプル。
 */
public abstract class AbstractSampleNotNull {
	/**
	 * メソッドのパラメータに非 NULL チェックをおこなうソースコードを自動生成するサンプル。
	 * 
	 * @param arg1
	 *            非 NULL 制約を付与したいパラメータ。
	 * @param arg2
	 *            通常のパラメータ。
	 * @return
	 */
	public String methodWithParamCheck(@BlancoNotNull final String arg1,
			final String arg2) {
		return "戻り値: " + arg1;
	}
}
