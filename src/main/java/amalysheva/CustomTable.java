package amalysheva;

import java.util.ArrayList;
import java.util.List;

public class CustomTable { // <T extends Comparable<?>>
    private final List<Line<? extends Comparable<?>>> lines; //юзеры, объекты
    private final List<Column> columns; // cells, свойства
    private static final int DEFAULT_HEIGHT = 10;
    private static final int DEFAULT_WIDTH = 10;

    public CustomTable(int width, int height) {
        this.columns = new ArrayList<>(width);
        this.lines = new ArrayList<>(height);
        for (int i = 0; i < height; i++) {
            lines.add(new Line<>(width));
        }
    }

    public CustomTable() {
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public void addLine() { // добавляет новый элемент типа Line, в котором становится столко columns, сколько указывает size
        lines.add(new Line<>(columns.size()));
    }

    public void addColumn(Column newColumn) {
        columns.add(newColumn);
        lines.forEach(line -> line.addCell(null));
    }

    public void setCellValue(int lineIndex, int columnIndex, Comparable<? extends Comparable<?>> data){
        if (!getColumnClass(columnIndex).equals(data.getClass())){
            throw new IllegalArgumentException("Wrong column type");
        }
        Line<? extends Comparable<?>> line = lines.get(lineIndex);
        line.setColumnValue(columnIndex, data);
    }

    public void removeCellValue(int lineIndex, int columnIndex){
        Line<? extends Comparable<?>> line = lines.get(lineIndex);
        line.removeColumnValue(columnIndex);
    }

    public int getWidth(){
        return columns.size();
    }

    public int getHeight(){
        return lines.size();
    }

    public Class<? extends Comparable<?>> getColumnClass(int index){
        Column column = columns.get(index);
        return column.getClassType();
    }
}
