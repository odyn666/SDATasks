package pl.hajduk.mobileDevice;

abstract class MobileDevice {
    private int resolution;
    private int ram;
    private String cpu;
    private String os;
    private String type;

    public MobileDevice(int resolution, int ram, String cpu, String os, String type) {
        this.resolution = resolution;
        this.ram = ram;
        this.cpu = cpu;
        this.os = os;
        this.type = type;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String showDeviceInfo() {
        return "MobileDevice{" +
                "resolution=" + resolution +
                ", ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", os='" + os + '\'' +
                ", type='" + type + '\'';
    }
}

