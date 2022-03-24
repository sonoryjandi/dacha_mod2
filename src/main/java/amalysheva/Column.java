package amalysheva;

public class Column { //<T extends Comparable<?>>
    private final String title; // имя столбца
    private final Class<? extends Comparable<?>> classType; // тип данных
//    private T data;

    public Column(String name, Class<? extends Comparable<?>> classType) {
        this.title = name;
        this.classType = classType;
    }

    public String getTitle() {
        return title;
    }

    public Class<? extends Comparable<?>> getClassType() {
        return classType;
    }
}
