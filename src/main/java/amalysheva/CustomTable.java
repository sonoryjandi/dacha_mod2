package amalysheva;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomTable{ // <T> extends Comparable
    private List<Column> lines; //юзеры, объекты
    private LinkedList <List<Column>> columns; // cells, свойства,
    private int size; // кол-во lines
//    private LinkedList<Column> header; // заголовки - линкедлисты
//    private List<LinkedList<Column>> header;

    public CustomTable(){
//        this.header = new List<>();
        this.lines = new ArrayList<>();
        this.size = 0;
//        this.header = new LinkedList<String>(headerNameArray);
    }

    public void addLine(Object name){
        Column newLine = new Column(name);
        this.lines.add(newLine);
        size++;
    }

    public void addColumn(int id, String name, Object data){ //column
        lines.get(id).setName(name); // header
        lines.get(id).setData(data);
    }
}

