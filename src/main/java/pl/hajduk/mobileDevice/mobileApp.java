package pl.hajduk.mobileDevice;

public class mobileApp {
    public static void main(String[] args) {
        MobileDevice tablet= new Tablet(720,8,"snapdragon","android",DeviceType.TABLET,true);
        MobileDevice phone= new MobilePhone(1080,32,"intel","windows",DeviceType.PHONE,true);
        System.out.println(phone.showDeviceInfo());
        System.out.println(tablet.showDeviceInfo());
    }
}
