package pl.hajduk.mobileDevice;

public class MobilePhone extends MobileDevice {

    boolean lteSupport;

    public MobilePhone(int resolution, int ram, String cpu, String os, String type, boolean lteSupport) {
        super(resolution, ram, cpu, os, type);
        this.lteSupport = lteSupport;
    }

    public boolean isLteSupport() {
        return lteSupport;
    }

    public void setLteSupport(boolean lteSupport) {
        this.lteSupport = lteSupport;
    }

    @Override
    public String showDeviceInfo() {
        return super.showDeviceInfo()+ lteSupport+
                " }";
    }
}
