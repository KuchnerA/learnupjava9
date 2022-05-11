import java.util.ArrayList;

public class ContactsBook {

    ArrayList<Contact> list = new ArrayList<>();

    public void add(Contact contact1, Contact contact2) {
        list.add(contact1);
        list.add(contact2);
    }

    public Contact getByPhone(String phone) {

        for (Contact contact : list) {
            if (phone.equals(contact.getPhone())) {
                return contact;
            }
        }
        return null;
    }

    public void removeByPhone(String phone) {
        int i = -1;
        for (Contact contact : list) {
            i++;
            if (phone.equals(contact.getPhone())) {
                list.remove(i);
                return;
            }
        }
        throw new PhoneException(phone);
    }
}
