public class StationaryPhone extends NumberPhone {

    public StationaryPhone() {
        this.internationalСode = "8"; /// для примера всем городским присвается код России +7 при создании. }
    }

    public StationaryPhone(Integer MediumCode, Integer PhoneBody) {
        this.internationalСode = "8";
        this.MediumCode = MediumCode;
        this.PhoneBody = PhoneBody;
    }
}
