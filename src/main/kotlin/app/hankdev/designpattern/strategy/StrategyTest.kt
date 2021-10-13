package app.hankdev.designpattern.strategy

fun main() {
    val silkbind: Silkbind = GreatSwordSilkbind()
    val role = Role(silkbind)
    role.silkbindAttack()
}