package Entidades;

import org.jxmapviewer.viewer.DefaultWaypoint;


import java.awt.*;
import java.awt.image.BufferedImage;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;

public class CustomWaypoint extends DefaultWaypoint implements Waypoint {
    private BufferedImage customIcon;

    public CustomWaypoint(double latitude, double longitude, BufferedImage customIcon) {
        super(new GeoPosition(latitude, longitude));
        this.customIcon = customIcon;
           }

     public void paintWaypoint(Graphics2D g, JXMapViewer map, CustomWaypoint wp) {
        System.out.println("pepe");
        int width = customIcon.getWidth();
        int height = customIcon.getHeight();

        int x = (int) map.getTileFactory().geoToPixel(wp.getPosition(), map.getZoom()).getX() - width / 2;
        int y = (int) map.getTileFactory().geoToPixel(wp.getPosition(), map.getZoom()).getY() - height;

        g.drawImage(customIcon, x, y, width, height, null);
    }
}