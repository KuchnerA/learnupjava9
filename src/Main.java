public class Main {

    public static void main(String[] args) {

        Contact contact1 = new Contact("Maxim", "88_005_553_535");
        Contact contact2 = new Contact("Alex", "88_444_444_444");

        ContactsBook contactsBook = new ContactsBook();

        contactsBook.add(contact1, contact2);
        Contact foundContact = contactsBook.getByPhone("88_005_553_535");
        System.out.println(foundContact);
        contactsBook.removeByPhone("88_444_444_333");

    }

}
