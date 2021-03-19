package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BinarySearchTest {


    @BeforeEach
    void setUp() throws Exception {}

//    @Test
//    void test() {
//        fail("Not yet implemented");
//    }

    @Test
    public void shouldSearchElementInOneElementSequences() {
        int key = 7;
        int[] seq = {7};
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertEquals(true, searchResult.isFound());
        assertEquals(0, searchResult.getPosition());
        assertEquals(seq[searchResult.getPosition()], key);
    }

    @Test
    public void shouldNotSearchElementInOneElementSequences() {
        int key = 7;
        int[] seq = {9};
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertEquals(false, searchResult.isFound());
        assertEquals(-1, searchResult.getPosition());
    }

}
