/**
 * インターフェースの例。
 * 一番下の「JobBlackFighter」のように、インタフェースは多重継承が可能。
 * 通常のclassやabstract classのように、実装を含むと「どれが正しい実装なのか」を判断できないため、
 * Javaではclassについては単一継承しか許されていない。インタフェースの場合、実装を含まないため、
 * 迷う余地がない。そのために多重継承が許されている。
 */
interface Creacure {
    void run();
    void attack(Creacure opponent);
}

interface Human extends Creacure {
    void useItem();
}

interface JobBlackMage extends Human {
    int useBlackMagick();
}

interface JobFighter extends Human {
    int useWeapon();
}

interface JobBlackFighter extends JobBlackMage, JobFighter {
    int useWeaponMagick();
}
