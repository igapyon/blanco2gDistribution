/*
 * このクラスは 'AbstractSampleCache' の具象クラスとして blanco Framework によって自動生成されました。
 */
package sample.cache;

import java.util.Map;

import blanco.fw.BlancoGeneratedBy;

/**
 * メソッド・キャッシュをおこなうソースコードを自動生成するサンプル。
 */
@BlancoGeneratedBy(name = "Blanco2g")
public class SampleCache extends AbstractSampleCache {
    /**
     * [@BlancoCache] Cache object for method 'methodWithHighCost'.
     */
    private final Map<String, java.lang.ref.SoftReference<CacheObjectForSampleCacheMethodWithHighCost>> blanco2gCacheMethodmethodWithHighCost = java.util.Collections.synchronizedMap(new java.util.HashMap<java.lang.String, java.lang.ref.SoftReference<CacheObjectForSampleCacheMethodWithHighCost>>(8192));

    /**
     * キャッシュをおこないたい、処理コストの高いメソッド。
     *
     * @param arg1 引数その１
     * @param arg2 引数その２
     * @return  メソッドの戻り値。ただしキャッシュにヒットした場合は前回のメソッド呼び出し時の実行結果。
     */
    public String methodWithHighCost(String arg1, String arg2) {
        java.lang.String autoValMethodResult;
        {
            // [@BlancoCache] Search cache.
            final java.lang.ref.SoftReference<CacheObjectForSampleCacheMethodWithHighCost> autoValMethodResultCacheReference = blanco2gCacheMethodmethodWithHighCost.get("" + arg1 + "\t" + arg2 + "");
            if (autoValMethodResultCacheReference != null) {
                final CacheObjectForSampleCacheMethodWithHighCost autoValCacheLookup = autoValMethodResultCacheReference.get();
                if (autoValCacheLookup != null) {
                    if (Math.abs(System.currentTimeMillis() - autoValCacheLookup.birthMillisec) <= 1000) {
                        // Hit cache.
                        return autoValCacheLookup.cachedValue;
                    }
                }
            }
        }
        autoValMethodResult = super.methodWithHighCost(arg1, arg2);
        {
            // [@BlancoCache] Remember cache.
            final CacheObjectForSampleCacheMethodWithHighCost autoValCacheObject = new CacheObjectForSampleCacheMethodWithHighCost();
            autoValCacheObject.birthMillisec = System.currentTimeMillis();
            autoValCacheObject.cachedValue = autoValMethodResult;
            blanco2gCacheMethodmethodWithHighCost.put("" + arg1 + "\t" + arg2 + "", new java.lang.ref.SoftReference<CacheObjectForSampleCacheMethodWithHighCost>(autoValCacheObject));
        }
        return autoValMethodResult;
    }
}
/**
 * Cache object for method 'methodWithHighCost'.
 */
class CacheObjectForSampleCacheMethodWithHighCost {
    /**
     * Birth millisec for cache object.
     */
    long birthMillisec;

    /**
     * Cached object value.
     */
    String cachedValue;
}
