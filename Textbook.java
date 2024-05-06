class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    public String subject() {
        return subject;
    }

    @Override
    public void borrowBook() {
        if (!isBorrowed()) {
            System.out.println("Teextbook : \"" + getTitle() + "\" borrowed successfully.");
            borrowed = true;
        } else {
            System.out.println("Textbook : \"" + getTitle() + "\" already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (isBorrowed()) {
            System.out.println("Textbook : \"" + getTitle() + "\" returned successfully.");
            borrowed = false;
        } else {
            System.out.println("Textbook : \"" + getTitle() + "\" is not borrowed.");
        }
    }

    @Override
    public void borrowedBook() {

    }

    @Override
    public void displayInfo(){
        System.out.println("Title : " + getTitle());
        System.out.println("Author : " + getAuthor());
        System.out.println("Year : " + getYear());
        System.out.println("Borrowed : " + borrowed);
        System.out.println("Subject : " + subject);
        System.out.println();
    }
}

    


