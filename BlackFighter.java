/**
 * インタフェースの実装例（途中）。
 * ここではJobBlackFighter本体で定義してるuseWeaponMagick()しか実装していない。
 * 一方、JobBlackMageとJobFighterを継承しているため各々のメソッドについてもオーバーライドする必要がある。
 * それらの未実装メソッドが残っているため、この段階ではコンパイルで中間ファイルを生成することができない。
 */
public class BlackFighter implements JobBlackFighter {
    @Override
    public int useWeaponMagick() {
        return 10;
    }
}
