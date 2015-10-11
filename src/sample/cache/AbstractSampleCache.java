package sample.cache;

import blanco.cache.BlancoCache;
import blanco.cache.BlancoCacheKey;

/**
 * メソッド・キャッシュをおこなうソースコードを自動生成するサンプル。
 */
public abstract class AbstractSampleCache {
	/**
	 * キャッシュをおこないたい、処理コストの高いメソッド。
	 * 
	 * @param arg1
	 *            引数その１
	 * @param arg2
	 *            引数その２
	 * @return メソッドの戻り値。ただしキャッシュにヒットした場合は前回のメソッド呼び出し時の実行結果。
	 */
	@BlancoCache(maxperiod = 1000)
	public String methodWithHighCost(@BlancoCacheKey final String arg1, @BlancoCacheKey final String arg2) {
		// ここに実際の処理を記述します。
		return "戻り値: " + arg1;
	}
}
