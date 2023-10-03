package pl.hajduk.mobileDevice;

public class Tablet  extends MobileDevice{

     boolean pencilSupport;

    public Tablet(int resolution, int ram, String cpu, String os, Enum type, boolean pencilSupport) {
        super(resolution, ram, cpu, os, type);
        this.pencilSupport = pencilSupport;
    }

    public boolean isPencilSupport() {
        return pencilSupport;
    }

    public void setPencilSupport(boolean pencilSupport) {
        this.pencilSupport = pencilSupport;
    }


    @Override
    public String showDeviceInfo() {
        return super.showDeviceInfo()+ pencilSupport+
                " }";
    }
}
