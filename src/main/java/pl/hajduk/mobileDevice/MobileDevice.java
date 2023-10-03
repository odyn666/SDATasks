package pl.hajduk.mobileDevice;

abstract class MobileDevice {
    private int resolution;
    private int ram;
    private String cpu;
    private String os;
    private Enum type;

    public MobileDevice(int resolution, int ram, String cpu, String os, Enum type) {
        this.resolution = resolution;
        this.ram = ram;
        this.cpu = cpu;
        this.os = os;
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

