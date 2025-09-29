module eu.hansolo.jdkupdaterfx {
    // Java
    requires java.net.http;
    requires java.desktop;

    // Java-FX
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;

    // 3rd Party
    requires transitive com.google.gson;
    requires transitive eu.hansolo.jdktools;
    requires transitive ch.qos.logback.classic;
    requires transitive ch.qos.logback.core;
    requires transitive org.slf4j;
    requires com.dustinredmond.fxtrayicon;
    //requires FXTrayIcon;
    requires org.apache.commons.compress;
    requires eu.hansolo.toolbox;

    exports eu.hansolo.jdkupdaterfx;
}