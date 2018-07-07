package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.ListNodeUtils.toListNode

class InsertAtTailSpec extends Specification {

    def "inserts node at tail"() {
        expect:
        InsertAtTail.insertAtTail(head, data) == output
        where:
        head                        || data || output
        null                        || 6    || toListNode([6])
        toListNode([1, 2, 3, 4, 5]) || 6    || toListNode([1, 2, 3, 4, 5, 6])
    }
}
