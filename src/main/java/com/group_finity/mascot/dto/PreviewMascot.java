package com.group_finity.mascot.dto;

import java.io.File;

/**
 * Extended DTO class to hold information for a mascot.
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public class PreviewMascot extends BasicMascot {
    
    private File image;

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "PreviewMascot{" +
                "image=" + image +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PreviewMascot mascot = (PreviewMascot) o;

        return image != null ? image.equals(mascot.image) : mascot.image == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}
