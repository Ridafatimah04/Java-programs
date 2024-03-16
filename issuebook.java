package week;
import student.Student;
import requestbook.RequestBook;

public class issuebook {
    private requestBook rb;

    public issueBook(requestBook rb) {
        this.rb = rb;
    }

    public void issubook() {
        System.out.println("issuing the book");
        System.out.println("with request id as " + this.rb.getrequestID() + " being issued to " + this.rb.getStudent().getname());
        System.out.println("book is to be delivered to: " + this.rb.getStudent().getregisterNo());
    }
}


