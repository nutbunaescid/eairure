// Example class definition with html method
public class Pager {
    public String html(int pageNumber) {
        // Generate HTML based on pageNumber
        return "<div>Page " + pageNumber + "</div>";
    }

    public static void main(String[] args) {
        Pager pager13 = new Pager();
        System.out.println(pager13.html(13));
    }
}
