package ru.job4j.chess.firuges.black;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        MatcherAssert.assertThat(bishopBlack.position(), is(Cell.A3));
    }

    @Test
    void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        bishopBlack.copy(Cell.A1).position();
    }

    @Test
    void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        MatcherAssert.assertThat(bishopBlack.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3,
                Cell.F4, Cell.G5}));
    }
}