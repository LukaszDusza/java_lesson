package wzorce.adapter.twoWayAdapter;

public class TwoWayAdapter implements UKDevice, ContinentalDevice{

    UKDevice ukDevice;
    ContinentalDevice continentalDevice;

    public TwoWayAdapter(UKDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }

    @Override
    public void poweOnEuropeSocket() {
        ukDevice.powerOnUKSocket();
    }

    @Override
    public void powerOnUKSocket() {
     continentalDevice.poweOnEuropeSocket();
    }
}
