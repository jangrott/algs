package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.ListNodeUtils.toListNode

class DeleteAtTailSpec extends Specification {

    def "deletes node at tail"() {
        expect:
        DeleteAtTail.deleteAtTail(input) == output
        where:
        input                       || output
        null                        || null
        toListNode([1])             || null
        toListNode([1, 2, 3, 4, 5]) || toListNode([1, 2, 3, 4])
    }
}
