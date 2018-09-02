package top.thttnt.potatomysqlorm.api

import top.thttnt.potatomysqlorm.PotatoMysqlORM
import java.util.*

class EntityManager(private val parent: PotatoMysqlORM) {

    private val entities = ArrayList<Any>()

    fun addEntity(entity: Class<*>) {
        this.entities.add(entity)
    }


}