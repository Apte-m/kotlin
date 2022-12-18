data class Person(val name: String = "sd", val age: Int) {
    var foo: Boolean = false

        set(value) {
            if (value == true)
                field = true
        }

    var foo2: Boolean = false
        set(value) {
            if (value == true)
                field = true
        }


}

