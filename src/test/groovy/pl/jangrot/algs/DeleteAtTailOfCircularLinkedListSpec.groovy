package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.ListNodeUtils.toListNode

class DeleteAtTailOfCircularLinkedListSpec extends Specification {

    def "deletes at tail"() {
        expect:
        DeleteAtTailOfCircularLinkedList.deleteAtTail(input) == output
        where:
        input                          || output
        null                           || null
        toListNode([1], true)          || null
        toListNode([1, 2, 3, 4], true) || toListNode([1, 2, 3], true)
    }
}
