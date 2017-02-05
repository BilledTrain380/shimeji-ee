package com.group_finity.mascot.dto;

import java.io.File;

/**
 * DTO class to hold the configuration file of a mascot.
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public class MascotConfiguration {
    
    private File actionFile;
    private File bahaviorFile;

    public File getActionFile() {
        return actionFile;
    }

    public void setActionFile(File actionFile) {
        this.actionFile = actionFile;
    }

    public File getBahaviorFile() {
        return bahaviorFile;
    }

    public void setBahaviorFile(File bahaviorFile) {
        this.bahaviorFile = bahaviorFile;
    }

    @Override
    public String toString() {
        return "MascotConfiguration{" +
                "actionFile=" + actionFile +
                ", bahaviorFile=" + bahaviorFile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MascotConfiguration that = (MascotConfiguration) o;

        if (actionFile != null ? !actionFile.equals(that.actionFile) : that.actionFile != null) return false;
        return bahaviorFile != null ? bahaviorFile.equals(that.bahaviorFile) : that.bahaviorFile == null;
    }

    @Override
    public int hashCode() {
        int result = actionFile != null ? actionFile.hashCode() : 0;
        result = 31 * result + (bahaviorFile != null ? bahaviorFile.hashCode() : 0);
        return result;
    }
}
