//package amalysheva;
//
//import java.util.ArrayList;
//
//public class Table<C, L> {
//    private ArrayList<Column<C>> columns; //массив строк как в psvm
//    private ArrayList<Line<L>> lines;
//    private int width;
//    private int high;
//    private final int DEFAULT_HIGH = 10;
//    private final int DEFAULT_WIDTH = 10;
//
//    public Table() {
//        this.width = DEFAULT_WIDTH;
//        this.high = DEFAULT_HIGH;
//        columns = new ArrayList<>(width);
//        lines = new ArrayList<>(high);
//    }
//
//    public Table(int high, int width) {
//        this.width = width;
//        this.high = high;
//        columns = new ArrayList<>(width);
//        lines = new ArrayList<>(high);
//    }
//
//    //region add/del
//
//    // endregion
//
//    protected static class Column<T> { //данные, поля
//        String dataName;
//        Cell<T>[] data;
//
//        public Column(String dataName, T data) {
//            this.dataName = dataName;
////            this.data = data;
//        }
//    }
//
//    protected static class Cell<T> {
//        T data;
//    }
//
//    private class Line<L> { // пользователи
////        Column<T>[] setOfStolbez;
////
////        public Line(int size) {
////            this.setOfStolbez = new Column[size];
////        }
//    }
//}