package amalysheva;

import java.util.ArrayList;
import java.util.List;

// набор столбцов
public class Line<T extends Comparable<T>> {
    private List<Comparable<?>> cells;

    public Line(int size) {
        this.cells = new ArrayList<>(size);
    }

    public void addCell(T data) { // таблица растёт вширь, это и есть столбец/ячейка
        cells.add(data);
    }

    // region set/get
    public List<Comparable<?>> getCells() {
        return cells;
    }

    public void setCells(List<Comparable<?>> cells) {
        this.cells = cells;
    }
    // endregion

    public void setColumnValue(int columnIndex, Comparable<?> data) {
        cells.set(columnIndex, data);
    }

    public void removeColumnValue(int columnIndex) {
        cells.set(columnIndex, null);
    }

    public Comparable<?> getColumnValue(int columnIndex){
        return cells.get(columnIndex);
    }
}
