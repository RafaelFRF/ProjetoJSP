const usernameValidate = () => {

  var username = document.querySelector('#username')
  
  if(username.value == ""){
    username.focus()
    alert("Fill the username correctly!")
    return false
  } else if(!username.value.includes("@" && ".com")){
    username.focus()
    alert("Fill the username correctly!")
    return false
  }
  return true
}

const passwordValidate = () => {
  var password = document.querySelector('#password')
  if(password.value == ""){
    password.focus()
    alert("Fill the password correctly!")
    return false
  } 
  else if(password.value.length < 6){
    password.focus()
    alert("Fill the password correctly!")
    return false
  }
  return true
}

// arrow function

const inputValidate = () => {
  if(!usernameValidate()) return;
  if(!passwordValidate()) return;
}

const trimP = (id) => {
  const element = document.querySelector(`[data-id='${id}'] .text-blog`)
  element.display === "none" ? element.display = "block" :  element.display = "none"
  console.log(element)
  let commentHome = element.getAttribute("data-text")
  element.innerText === commentHome ? element.innerText = commentHome.slice(0,15) :  element.innerText = commentHome
  const buttonElement = document.querySelector(`[data-id='${id}'] .s-h-button`)
  // if else 2 opções
  buttonElement.innerText === "Hide" ? buttonElement.innerText = "Show" :  buttonElement.innerText = "Hide"
}
