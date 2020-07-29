ispalindrome=(x)=>{
    if(x===x.split("").reverse().join(""))
    console.log(`${x} is a Palindrome`)
    else
    console.log(`${x} is not a Palindrome`)
}
ispalindrome("madam")