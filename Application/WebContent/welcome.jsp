<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.container {
  position: relative;
  text-align: center;
  color: white;
}

.bottom-left {
  position: absolute;
  bottom: 8px;
  left: 16px;
}

.top-left {
  position: absolute;
  top: 8px;
  left: 16px;
}

.top-right {
  position: absolute;
  top: 8px;
  right: 16px;
}

.bottom-right {
  position: absolute;
  bottom: 8px;
  right: 16px;
}

.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  margin-top: 260px;
  transform: translate(-50%, -50%);
}

body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* The Modal (background) */

/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
 
/* The Close Button (x) */
.close:hover,
.close:focus {
  color: #f44336;
  cursor: pointer;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
<script>
var modal = document.getElementById('id01');
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}
function passwordchecking()
{
     var p=document.getElementById('pass');
     if(p.value.length>=6)
     {
       document.getElementById('passl').innerHTML="";
     }
     else
     {
       var str3="password must contain atleast 6 charecter";
       document.getElementById('passl').innerHTML=str3;
     }
}
function confirmpassword()
{
     var t=document.getElementById('cpass');
     var pa=document.getElementById('pass');
     tval=t.value;
     paval=pa.value;
                      console.log(tval);
                      console.log(paval);
     if(tval==paval)
     {
                               console.log("Password confirmed");
       document.getElementById('cpassl').innerHTML="";
     }
     else
     {
       var str4="password mismatch";
            console.log("password mismatch");
       document.getElementById('cpassl').innerHTML=str4;
     }
  }
  //open


</script>

<title>Insert title here</title>

</head>
<body background="file:///C:/Welcomeproject/WebContent/image/lake.jpg">
<div class="container">
  
 <!--<div class="bottom-left">Bottom Left</div>
  <div class="top-left">Top Left</div>
  <div class="top-right">Top Right</div>
  <div class="bottom-right">Bottom Right</div>-->
  <div class="centered">WELCOMES YOU TO NEW IDEAS
  
  
  <h2>GET YOUR MEMBERSHIP</h2>

<button onclick="location.href='register.jsp'"style="width:auto;">Sign Up</button>
<button onclick="location.href='login.jsp'" style="width:auto;">Login
</button>
<div id="content" style="background-color:white;width:230px;height:190px">

</div>





  
  
  
  </div>
</div>

</body>
</html>