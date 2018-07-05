package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.ListNodeUtils.toListNode

class InsertAtHeadTestSpec extends Specification {

    def "insert node at head"() {
        expect:
        InsertAtHead.insertAtHead(head, data) == output
        where:
        head               || data || output
        toListNode([2, 1]) || 3    || toListNode([3, 2, 1])
        null               || 3    || toListNode([3])
    }
}
