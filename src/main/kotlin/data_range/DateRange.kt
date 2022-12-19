package data_range

import MyDate

class DateRange (override val start: MyDate, override val endInclusive: MyDate) : ClosedRange <MyDate>{
    override operator fun contains(date: MyDate): Boolean {
        return   date > start && date < endInclusive
    }
    operator fun MyDate.rangeTo(other: MyDate) =  DateRange(this, other)


}
fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}


fun checkInRangeTwo(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}