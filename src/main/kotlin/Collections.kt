import collection.City
import collection.Customer
import collection.Order
import collection.Shop

fun main (args: Array<String>) {
        val london = City("London")
        val paris = City("Paris")
        val firstOrder = Order(123)
        val secondOrder = Order(789)
        val customerLarisa = Customer("Larisa", london, listOf(firstOrder))
        val customerAlbert = Customer("Albert", paris, listOf(secondOrder))
        val customerOlga = Customer("Olga", paris, listOf(firstOrder))
        val shop = Shop("testShopName", listOf(customerLarisa, customerAlbert, customerOlga))

  
//        println(shop.getCitiesCustomersAreFrom())
        println(shop.getCustomersFrom(paris))
    }









