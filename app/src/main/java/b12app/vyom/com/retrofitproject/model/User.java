package b12app.vyom.com.retrofitproject.model;

public class User {

    /**
     * msg : success
     * id : 1217
     * firstname : aamir
     * lastname : husain
     * email : aa@gmail.com
     * mobile : 55565454
     * appapikey  : 7057bc8168b477b9420aeca3fda3c868
     */

    private String msg;
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    private String appapikey;

    public User(String msg, String id, String firstname, String lastname, String email, String mobile, String appapikey) {
        this.msg = msg;
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.appapikey = appapikey;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAppapikey() {
        return appapikey;
    }

    public void setAppapikey(String appapikey) {
        this.appapikey = appapikey;
    }
}
