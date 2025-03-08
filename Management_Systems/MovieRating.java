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
        System.out.print("Enter Movie Rating (0.0 - 5.0): ");
        rating = sc.nextDouble();
    }

    void display() {
        System.out.println("\nMovie Details:");
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        if (rating >= 4.6 && rating <= 5.0) {
            System.out.println(title + " was a Super Hit 🎬🔥");
        } else if (rating >= 3.5 && rating < 4.6) {
            System.out.println(title + " was a Hit 🎬💥");
        } else if (rating >= 2.1 && rating < 3.5) {
            System.out.println(title + " was a Semi-Hit 🎬🙂");
        } else if (rating >= 0.0 && rating < 2.1) {
            System.out.println(title + " was a Flop 🎬💔");
        } else {
            System.out.println("Invalid rating! Please enter a rating between 0.0 and 5.0.");
        }
    }

    public static void main(String args[]) {
        MovieRating movie = new MovieRating();
        movie.accept();
        movie.display();
    }
}