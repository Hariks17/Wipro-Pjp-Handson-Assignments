function check() {
    var passwd = document.form.password.value;
    var passwdRegEx = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
    if (!passwd.match(passwdRegEx)) {
        alert(
            "Please enter a password between 6 to 20 chars, with atleast one lowercase letter, one uppercase letter and one number!"
        );
        passwd.focus();
        return false;
    }
}
