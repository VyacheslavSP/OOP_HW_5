public class MobilePhone extends NumberPhone { // классам мибильный и стационарный телефон не прописано поле человек
                                               // специально. в текущей реализации этого нет,однако планируются
                                               // корпоративные(не личные) телефоны

    public MobilePhone() {
        this.internationalСode = "+7"; /// для примера всем мобильникам присвается код России +7 при создании.
                                       /// естественно можно изменить через set
    }

    public MobilePhone(Integer MediumCode, Integer PhoneBody) {
        this.internationalСode = "+7";
        this.MediumCode = MediumCode;
        this.PhoneBody = PhoneBody;
    }

}
