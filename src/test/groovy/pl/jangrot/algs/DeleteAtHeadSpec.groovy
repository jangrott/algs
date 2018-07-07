package pl.jangrot.algs

import spock.lang.Specification

import static pl.jangrot.algs.ListNodeUtils.toListNode

class DeleteAtHeadSpec extends Specification {

    def "deletes node at head"() {
        expect:
        DeleteAtHead.deleteAtHead(input) == output
        where:
        input                       || output
        null                        || null
        toListNode([1])             || null
        toListNode([1, 2, 3, 4, 5]) || toListNode([2, 3, 4, 5])
    }
}