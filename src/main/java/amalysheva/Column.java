package amalysheva;

public class Column { // столбец
    private String name;
    private Object data;

    public Column(String name) {
        this.name = name;
    }

    public Column(Object data) {
        this.data = data;
    }

    public Column(String name, Object data) {
        this.name = name;
        this.data = data;
    }

    public Column() {

    }

    // region set/get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    // endregion
}