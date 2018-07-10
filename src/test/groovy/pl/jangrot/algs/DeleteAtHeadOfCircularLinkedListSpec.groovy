package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.ListNodeUtils.toListNode

class DeleteAtHeadOfCircularLinkedListSpec extends Specification {

    def "deletes at head"() {
        expect:
        DeleteAtHeadOfCircularLinkedList.deleteAtHead(input) == output
        where:
        input                          || output
        null                           || null
        toListNode([1], true)          || null
        toListNode([1, 2, 3, 4], true) || toListNode([2, 3, 4], true)
    }
}
