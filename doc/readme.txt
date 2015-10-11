= Blanco2gDistribution
 * Blanco2gDistribution は実行可能状態に調整された Blanco2g 一式を提供します。

= Blanco2g
== 概要
 * Blanco2g はソースコードを入力してソースコードを自動生成して出力する Java アプリケーション開発用フレームワークです。
 * Blanco2g はオープンソース・ライセンスのもので提供されています。
 * Java ソースコード上のアノテーション記述をきっかけに、さまざまなソースコードを自動生成することができ、ソフトウェアの開発生産性と保守性を向上することができます。

== 名称の由来
 * Blanco2g という名称は、blanco Framework の第 2 世代にあたるフレームワークであることを示しています。

== 位置づけ
 * 第 1 世代の blanco Framework (Blanco1g) は、Excel ブックを入力してソースコードを生成するタイプのソースコード自動生成フレームワークです。主にウォーターフォール開発モデルに適しています。
 * 第 2 世代の blanco Framework (Blanco2g) は、ソースコードを入力してソースコードを生成するタイプのソースコード自動生成フレームワークです。主にアジャイル開発モデルに向いています。
 * Blanco1g と Blanco2g は、おのおの独立して利用することもできますし、組み合わせて利用することもできます。そして、組み合わせての利用が最も効果が高いものと考えられます。

== おおまかな流れ
 * 基本的なソースコード自動生成のながれを説明するために、「@BlancoNotNull」と「@BlancoTrace」という 2 つの Blanco2g アノテーションを利用した極めてシンプルなサンプルを示します。
 * この例では、AbstractSampleNotNull.java という Java ソースコードを入力して、SampleNotNull.java という Java ソースコードを出力するサンプルです。★Blanco2g は、基本的に AbstractXXXXXXXX.java というファイル名のクラスから XXXXXXXX.java を自動生成します。

==== 入力ソースコード: AbstractSampleNotNull.java
{{{ code java
package sample;

import blanco.notnull.BlancoNotNull;
import blanco.trace.BlancoTrace;

/**
 * 非 NULL のサンプル。
 */
public abstract class AbstractSampleNotNull {
    /**
     * パラメータあり、戻り値なし。
     * 
     * @param abc
     *            パラメータ 1.
     */
    public void a11(@BlancoNotNull final String abc) {
    }

    public String a21(@BlancoNotNull final String abc, @BlancoNotNull final String def) {
        return "あああ:" + abc + ", " + def;
    }

    /**
     * トレースと非 NULL との組み合わせ。
     * 
     * @param abc
     * @param def
     * @return
     */
    @BlancoTrace
    public String a91(@BlancoNotNull final String abc, @BlancoNotNull final String def) {
        return "あああ:" + abc + ", " + def;
    }
}
}}}



==== 出力ソースコード: SampleNotNull.java (★Blanco2g によって自動生成されたソースコード)
{{{ code java
package sample;

/**
 * 非 NULL のサンプル。
 */
public class SampleNotNull extends AbstractSampleNotNull {
    /**
     * パラメータあり、戻り値なし。
     *
     * @param abc パラメータ 1.
     */
    public void a11(String abc) {
        if (abc == null) {
            throw new IllegalArgumentException("不正引数例外: SampleNotNull#a11(String abc) のパラメータ 'abc' に null を与えることはできません。");
        }
        super.a11(abc);
    }

    /**
     *
     * @param abc
     * @param def
     * @return
     */
    public String a21(String abc, String def) {
        java.lang.String autoValMethodResult;
        if (abc == null) {
            throw new IllegalArgumentException("不正引数例外: SampleNotNull#a21(String abc, String def) のパラメータ 'abc' に null を与えることはできません。");
        }
        if (def == null) {
            throw new IllegalArgumentException("不正引数例外: SampleNotNull#a21(String abc, String def) のパラメータ 'def' に null を与えることはできません。");
        }
        autoValMethodResult = super.a21(abc, def);
        return autoValMethodResult;
    }

    /**
     * トレースと非 NULL との組み合わせ。
     *
     * @param abc
     * @param def
     * @return
     */
    public String a91(String abc, String def) {
        java.lang.String autoValMethodResult;
        long autoValStartTimeMillisec = System.currentTimeMillis();
        System.out.println("trace: AbstractSampleNotNull#a91(" + abc + ", " + def + ") begin.");
        if (abc == null) {
            throw new IllegalArgumentException("不正引数例外: SampleNotNull#a91(String abc, String def) のパラメータ 'abc' に null を与えることはできません。");
        }
        if (def == null) {
            throw new IllegalArgumentException("不正引数例外: SampleNotNull#a91(String abc, String def) のパラメータ 'def' に null を与えることはできません。");
        }
        autoValMethodResult = super.a91(abc, def);
        System.out.println("trace: AbstractSampleNotNull#a91(" + abc + ", " + def + ") end. " + "[" + autoValMethodResult + "] " + (System.currentTimeMillis() - autoValStartTimeMillisec) + "ms");
        return autoValMethodResult;
    }
}
}}}

== おおまかな流れ (その 2)
 * 上述したサンプルは簡単すぎます。
 * 実際のところ Blanco2g アノテーションで利用可能なアノテーションには、もっと高機能なものがいくつもあり、またそれらを組み合わせて利用することができるのです。
 * Blanco2g で最も効果が高いのは @BlancoInject アノテーションです。

== 特徴
 * 自動生成したソースコードの実行時には、Spring のような特殊なランタイムは必要ありません。
 * 基本的に Java ソースコードで完結して作業できます。また XML ファイルのたぐいを閲覧したり編集したりする必要はありません。
 * 少ないコンピュータ・リソースで動作するフレームワークであるため、クラウドコンピューティング環境や組み込み環境での動作にも適合しやすいです。

== ソースコード
 * 現在開発中の最新ソースコードは次のリンクからダウンロード (SVN によるチェックアウト) をおこなうことができます。:  http://svn.sourceforge.jp/svnroot/blancofw/blanco2g/trunk/
 * もし Eclipse 3.6 以降が手元にあれば、上記のリンクから SVN チェックアウトをおこなったプロジェクトから自動生成を実際に動作させることができます。

== ライセンス
 * Blanco2g は原則として GNU LGPL と EPL のいずれか一方、あるいは両方のデュアル・ライセンスというライセンスを採用しています。
 * ごく一部のソースコードについて、GNU LGPL, EPL, Apache ライセンスのトリプル・ライセンスを採用しているものがあります。
 * もし詳しく知りたい場合には、おのおののソースコードのファイルヘッダーを参照することによりライセンスを確認することができます。
 * なお、Blanco2g が自動生成するソースコードについては、Blanco2g のライセンスとは関わりなく、その入力となったソースコードのライセンスをそのまま引き継ぐこととなります。

== 同梱物
 * Blanco2g は、動作のために EPL のもとに公開されているライブラリを必要とします。
 * Blanco2g が生成したソースコードは 基本的にそれ単独で動作するようになっています。
