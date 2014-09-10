package com.falconraptor.timekeeper.settings;

import com.falconraptor.timekeeper.references.References;
import com.falconraptor.timekeeper.school.School;

import java.awt.*;

public class Settings {
    public static String[] schoolsList = {"ATECH"};
    public static School[] schools = new School[schoolsList.length];
    public final Color defaultForeground = References.colors.black;
    public Color foreground = defaultForeground;
    public final Color defaultBackground = References.colors.white;
    public Color background = defaultBackground;
    public final int defaultLunch = 1;
    public int lunch = defaultLunch;
    public final String defaultSchool = "ATECH";
    public String school = defaultSchool;
}
