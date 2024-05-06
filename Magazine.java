class Magazine extends Book {
    private String category;

    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }

    public String category() {
        return category;
    }

    @Override
    public void borrowBook() {
        if (!isBorrowed()) {
            System.out.println("Magazine : \"" + getTitle() + "\" borrowed successfully.");
            borrowed = true;
        } else {
            System.out.println("Magazine : \"" + getTitle() + "\" already borrowed");
        }
    }

    @Override
    public void returnBook() {
        if (isBorrowed()) {
            System.out.println("Magazine \"" + getTitle() + "\" returned successfully.");
            borrowed = false;
        } else {
            System.out.println("Magazine \"" + getTitle() + "\" is not borrowed.");
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
        System.out.println("Category : " + category);
        System.out.println();
    }
}
