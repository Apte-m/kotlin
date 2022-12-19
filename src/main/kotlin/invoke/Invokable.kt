package invoke

class Invokable {
    var numberOfInvocations: Int = 0
        private set
    operator fun invoke(): Invokable {
       this.numberOfInvocations.plus(1)
//        this.numberOfInvocations =numberOfInvocations +1
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()