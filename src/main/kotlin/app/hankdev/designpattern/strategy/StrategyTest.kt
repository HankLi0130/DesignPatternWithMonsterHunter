package app.hankdev.designpattern.strategy

fun main() {
    // 鐵絲蟲技
    // val silkbind: Silkbind = GreatSwordSilkbind()    // 大劍鐵絲蟲技
    // val silkbind: Silkbind = LongSwordSilkbind()     // 太刀鐵絲蟲技
    val silkbind: Silkbind = BowSilkbind()              // 弓鐵絲蟲技

    // 各個角色裝備鐵絲蟲技
    val role = Role(silkbind)
    role.silkbindAttack()
}