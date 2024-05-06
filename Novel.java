
class Novel extends Book {
    private String genre;
    

    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    public String genre() {
        return genre;
    }

    @Override
    public void borrowBook() {
        if (!borrowed) {
            System.out.println("Novel : \"" + getTitle() + "\" borrowed successfully.");
            borrowed = true;
        } else {
            System.out.println("Novel : \"" + getTitle() + "\" already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        if (borrowed) {
            System.out.println("Novel : \"" + getTitle() + "\" returned successfully.");
            borrowed = false;
        } else {
            System.out.println("Novel : \"" + getTitle() + "\" is not borrowed.");
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
        System.out.println("Genre : " + genre);
        System.out.println();
    }
}
