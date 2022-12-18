class Sort {
    fun getList(): List<Int> {

        return arrayListOf(1, 5, 2).sorted().reversed()
    }

    fun getListTwo() : List<Int>  {
        val arrayList = arrayListOf(1, 5, 2)
       return arrayListOf(1, 5, 2).sortedDescending()
    }

}
