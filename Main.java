/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Person Test = new Person("тестовый человек");
        Person newTest = new Person("2 тестовый человек");
        MobilePhone testMobilePhone = new MobilePhone(925, 100508);
        StationaryPhone tPhone = new StationaryPhone(495, 6682791);
        PhoneBookItem row1 = new PhoneBookItem(tPhone, Test);
        PhoneBookItem row2 = new PhoneBookItem(testMobilePhone, Test);
        PhoneBookItem row3 = new PhoneBookItem(testMobilePhone, newTest);
        PhoneBook<PhoneBookItem> NewBook = new PhoneBook<>("NewBook");
        PhoneBook<PhoneBookItem> EptyBook = new PhoneBook<>("EmptyBook");
        NewBook.appendRow(row1);
        NewBook.appendRow(row2);
        NewBook.appendRow(row3);
        NewBook.SaveCSV(true, true); // формат все данные с разделителем
        // NewBook.SaveCSV(false, true); // формат все данные без разделителем
        NewBook.SaveCSV(false, false); // формат короткой записи
        NewBook.deleteRow(row1.getID_item());
        // EptyBook.appendRow(row1);
        EptyBook.showBook();
        System.out.println("=================");
        EptyBook.ImportFullInfomation("FullFormatWthitouthSplit.csv");
        EptyBook.showBook();
        System.out.println("=================");
        NewBook.showBook();
    }
}