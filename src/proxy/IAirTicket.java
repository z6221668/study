package proxy;

public interface IAirTicket {
    void buy();
}


class AirTicket implements IAirTicket{
    @Override
    public void buy() {
        System.out.println("买票");
    }

}

class XieChengAirTicket implements IAirTicket{
    private AirTicket airTicket;

    public XieChengAirTicket() {
        airTicket = new AirTicket();
    }

    @Override
    public void buy() {
        airTicket.buy();
    }
}

class Test{
    public static void main(String[] args) {
        IAirTicket iAirTicket = new XieChengAirTicket();
        iAirTicket.buy();
    }
}