package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.ListNodeUtils.toListNode

class DeleteAtMiddleSpec extends Specification {

    def "deletes at middle"() {
        expect:
        DeleteAtMiddle.deleteAtMiddle(input, position) == output
        where:
        input                    || position || output
        toListNode([1, 2, 3, 4]) || 3        || toListNode([1, 2, 4])
    }
}
