package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int deltaX = position.getX() - dest.getX();
        int deltaY = position.getY() - dest.getY();
        int size = Math.abs(deltaX);
        Cell[] steps = new Cell[size];
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(position.getX() + (deltaX < 0 ? 1 : -1) * (index + 1),
                    position.getY() + (deltaY < 0 ? 1 : -1) * (index + 1));
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(source.getX() - dest.getX()) == Math.abs(source.getY() - dest.getY());
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }

}
