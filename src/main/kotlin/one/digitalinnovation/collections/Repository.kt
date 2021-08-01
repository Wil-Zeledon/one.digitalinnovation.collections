package one.digitalinnovation.collections

class Repository<T> {
    private val map = mutableMapOf<String, T>()
    
    fun create(id: String, value: T) {
        map.put(id, value)
    }

    fun remove(id: String) = map.remove(id)

    fun findByid(id: String) = map.get(id)

    fun findall() = map.values
}
