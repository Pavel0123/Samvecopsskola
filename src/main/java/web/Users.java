package web;

import org.graalvm.compiler.lir.LIRInstruction;

public class Users {
    private String username;
    private String password;
    public Users(String username, String password){
        this.username = username;
        this.password = password;
    };

    public String renameUser(String newUsername) {
        return username = newUsername;
    }
}

    public String getUsername() {
        return  username;
    }




