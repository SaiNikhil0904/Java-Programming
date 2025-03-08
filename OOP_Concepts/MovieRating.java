import java.util.Scanner;

class MovieRating {
    String title;
    int year;
    double rating;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Movie name: ");
        title = sc.nextLine();
        System.out.print("Enter the year of release: ");
        year = sc.nextInt();
        System.out.print("Enter Movie Rating (0.0 to 5.0): ");
        rating = sc.nextDouble();
        sc.close();
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        if (rating >= 4.6 && rating <= 5.0) {
            System.out.println(title + " Movie was Super Hit");
        } else if (rating >= 3.5 && rating < 4.6) {
            System.out.println(title + " Movie was Hit");
        } else if (rating >= 2.1 && rating < 3.5) {
            System.out.println(title + " Movie was Semi-Hit");
        } else if (rating >= 0.0 && rating < 2.1) {
            System.out.println(title + " Movie was Flop");
        } else {
            System.out.println("Enter a valid rating");
        }
    }

    public static void main(String args[]) {
        MovieRating movie = new MovieRating();
        movie.accept();
        movie.display();
    }
}