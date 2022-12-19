package collection


data class Shop(val nameShop: String, val customer: List<Customer>) {
    fun getCustomersFrom(city: City): List<Customer> { return this.customer.filter { it.city == city } }

    fun getCitiesCustomersAreFrom(): Set<City> { return this.customer.map { it.city }.toSet()}

    // Return true if all customers are from the given city
    fun checkAllCustomersAreFrom(city: City): Boolean = this.customer.all { it ->
        it.city == city
    }

    // Return true if there is at least one customer from the given city
    fun hasCustomerFrom(city: City): Boolean = this.customer.any { it ->
        it.city == city
    }

    // Return the number of customers from the given city
    fun countCustomersFrom(city: City): Int = this.customer.count { it ->
        it.city == city
    }

    // Return a customer who lives in the given city, or null if there is none
    fun findAnyCustomerFrom(city: City): Customer? = this.customer.find { it ->
        it.city == city
    }

}
