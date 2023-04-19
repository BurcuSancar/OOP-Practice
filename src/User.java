public class User {
    String email;
    int password;

    User(String email, int password) {
       this.email = email;
       this.password = password;
    }

    String returnEmail(){
        return email;
    }

    int passwordReturner() {
        if (password > 1000) {
           return password;
        } else{
          return 1000;
        }
    }
}
