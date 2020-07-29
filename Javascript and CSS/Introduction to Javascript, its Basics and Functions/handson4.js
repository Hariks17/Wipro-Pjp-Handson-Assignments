convertFirstWord=(x)=>{
    const stringArray=x.split(" ");

    const converted=stringArray.map(x=>x.charAt(0).toUpperCase()+x.slice(1))
    console.log(converted)

}
convertFirstWord("hi hello and welcome")