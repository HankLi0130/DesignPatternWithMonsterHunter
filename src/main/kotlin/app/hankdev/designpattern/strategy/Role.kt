package app.hankdev.designpattern.strategy

// 角色
class Role(private val silkbind: Silkbind) {
    fun silkbindAttack() {
        silkbind.attack()
    }
}