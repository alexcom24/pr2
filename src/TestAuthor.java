import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1=new Author("Mike Ash","mike@mail.ru", 'M');
        System.out.println(a1);
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        System.out.println(a1.getName());
    }
}
