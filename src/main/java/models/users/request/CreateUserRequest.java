package models.users.request;

public class CreateUserRequest {

        private String email;
        private String username;
        private String password;
        private Name name;
        private String phone;
       private String id;

    public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }

        public Name getName() { return name; }
        public void setName(Name name) { this.name = name; }

        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }
    }


