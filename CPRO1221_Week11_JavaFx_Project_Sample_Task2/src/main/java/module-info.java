module sample.cpro1221_javafx_project_sample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;
    requires java.sql.rowset;

    // exports javax.sql.rowset;
    // exports javax.sql.rowset.serial;
    // exports javax.sql.rowset.spi;

    opens sample.cpro1221_javafx_project_sample to javafx.fxml;
    exports sample.cpro1221_javafx_project_sample;

    opens sample.cpro1221_javafx_project_sample.controller to javafx.fxml;
    exports sample.cpro1221_javafx_project_sample.controller;

    opens sample.cpro1221_javafx_project_sample.model to javafx.fxml;
    exports sample.cpro1221_javafx_project_sample.model;

    opens sample.cpro1221_javafx_project_sample.util to javafx.fxml;
    exports sample.cpro1221_javafx_project_sample.util;
}