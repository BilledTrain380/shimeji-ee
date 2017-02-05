package com.group_finity.mascot.dto;

/**
 * DTO class to hold basic mascot information.
 * 
 * @author nmaerchy
 * @version 0.0.1
 */
public class BasicMascot {
    
    private String name;
    private MascotConfiguration config;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MascotConfiguration getConfig() {
        return config;
    }

    public void setConfig(MascotConfiguration config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "BasicMascot{" +
                "name='" + name + '\'' +
                ", config=" + config +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasicMascot that = (BasicMascot) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return config != null ? config.equals(that.config) : that.config == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (config != null ? config.hashCode() : 0);
        return result;
    }
}
