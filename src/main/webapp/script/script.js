const btLogout = () => {
  localStorage.setItem('blog-login', false)
  let bLogin = document.querySelector('#bt_login_home')
  bLogin.classList.remove('d-off')
  let bLogout = document.querySelector('#bt_logout_home')
  bLogout.classList.add('d-off')
  let iComment = document.querySelectorAll('.comment')
  iComment.forEach(comment => {
    comment.classList.add('d-off');
  })
  let sNote = document.querySelectorAll('.note')
  sNote.forEach(note => {
    note.classList.remove('d-off');
  })
}

const btLogin = () => {
  let bLogin = document.querySelector('#bt_login_home')
  bLogin.classList.add('d-off')
  let bLogout = document.querySelector('#bt_logout_home')
  bLogout.classList.remove('d-off')
  let iComment = document.querySelectorAll('.comment')
  iComment.forEach(comment => {
    comment.classList.remove('d-off');
  })
  let sNote = document.querySelectorAll('.note')
  sNote.forEach(note => {
    note.classList.add('d-off');
  })
}

const validateLogin = () => {
  const isLoggedIn = localStorage.getItem('blog-login')
  isLoggedIn === "true" ? btLogin() : btLogout()
}

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

const goBackHome = () => {
  document.location.href = "index.jsp"
}


const showHideContent = (id) => {
  const element = document.querySelector(`[data-id='${id}'] .text-blog`)
  element.display === "none" ? element.display = "block" :  element.display = "none"
  console.log(element)
  let commentHome = element.getAttribute("data-text")
  element.innerText === commentHome ? element.innerText = commentHome.slice(0,15) :  element.innerText = commentHome
  const buttonElement = document.querySelector(`[data-id='${id}'] .s-h-button`)
  // if else 2 options
  buttonElement.innerText === "Hide" ? buttonElement.innerText = "Show" :  buttonElement.innerText = "Hide"
}


// arrow function
const inputValidate = () => {
  debugger;
  if(!usernameValidate()) return;
  if(!passwordValidate()) return;
  localStorage.setItem('blog-login', true)
  goBackHome();
}

validateLogin()
