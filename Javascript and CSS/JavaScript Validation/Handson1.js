const check=()=>{
    var name=document.form.name.value;
    var password=document.form.password.value;
    var validnumber='/^\d+$/';
    if(!name.match.validnumber)
    {
    alert("Only a number")
    name.focus()
    }
    if(password.length<4)
    {
    alert('Length of password must be greater than 4')
    password.focus()
    }
}