package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import static org.assertj.core.api.Assertions.*;

class BishopBlackTest {

    @Test
    void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        assertThat(Cell.A3).isEqualTo(bishopBlack.position());
    }

    @Test
    void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        bishopBlack.copy(Cell.A1).position();
    }

    @Test
    void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(new Cell[] {Cell.D2, Cell.E3,
                Cell.F4, Cell.G5}).isEqualTo(bishopBlack.way(Cell.G5));
    }
}