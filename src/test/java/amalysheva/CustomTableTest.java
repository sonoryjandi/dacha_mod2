package amalysheva;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CustomTableTest {
    private static final CustomTable table = new CustomTable(0, 0);

    @Test
    void addLine() {
        table.addLine();
        assertThat(table.getHeight()).isEqualTo(1);
    }

    @Test
    void addColumn() {
        table.addLine();
        table.addColumn(new Column("Age", Integer.class));
    }

    @Test
    void setCellValue() {
        table.addLine();
        table.addColumn(new Column("Age", Integer.class));
        table.setCellValue(1,1,22);
        table.addColumn(new Column("Name", Integer.class));
    }

    @Test
    void removeCellValue() {
    }

    @Test
    void getWidth() {
    }

    @Test
    void getHeight() {
    }
}