package TableModel;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class SimpleTable extends JFrame {
    private Object[][] array = new String[][]{{"Sugar", "kg", "1.5"},
            {"Flour", "kg", "4.0"},
            {"Milk", "l", "2.2"}};

    private Object[] columnsHeader = new String[]{"Name", "Unit of measurement", "Quantity"};

    public SimpleTable(){
        super("Simple table with JTable");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTable table1 = new JTable(array, columnsHeader);

        JTable table2 = new JTable(3, 5);
        table2.setRowHeight(30);
        table2.setRowHeight(1, 20);
        table2.setIntercellSpacing(new Dimension(10, 10));
        table2.setGridColor(Color.blue);
        table2.setShowVerticalLines(false);
        Vector<Vector<String>> data = new Vector<Vector<String>>();
        Vector<String> header = new Vector<String>();
        for (int j = 0; j < array.length; j++) {
            header.add((String)columnsHeader[j]);
            Vector<String> row = new Vector<String>();
            for (int i = 0; i < array[j].length; i++) {
                row.add((String)array[j][i]);
            }
            data.add(row);
        }

        JTable table3 = new JTable(data, header);
        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table1));
        contents.add(new JScrollPane(table2));

        table3.setForeground(Color.red);
        table3.setSelectionForeground(Color.yellow);
        table3.setSelectionBackground(Color.blue);
        table3.setShowGrid(false);
        // contents.add(new JScrollPane(table3));
        contents.add(table3);
        setContentPane(contents);
        setSize(500, 400);
        setVisible(true);
    }
}