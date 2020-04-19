var attempts = 3;
function check_form() {
	var email = document.getElementById("email").value;
	var password = document.getElementById("password").value;
	if (email == "goluyash7@gmail.com" && password == 12345) {
		alert("SuccessFully Logged In");

		document.getElementById("email").value = "";
		document.getElementById("password").value = "";
		open("userhome.html");
		
		

	} else {
		if (attempts == 0) {
			alert("No Attempts Left");
		} else {
			attempts = attempts - 1;
			alert("Login Failed, " + attempts + " Login Attempts Available");
			if (attempts == 0) {
				document.getElementById("email").disabled = true;
				document.getElementById("pass").disabled = true;
				document.getElementById("userForm").disabled = true;
				document
						.writeln("<h1>You are Not Authorized to Access this Page!</h1>");
			}
		}
	}
	return false;
}

function registerFunction() {
	var mail = document.getElementById('email').value;
	var pwd = document.getElementById('password').value;
	var name = document.getElementById('name').value;
	var phone = document.getElementById('phone').value;
	if (mail != "" && pwd != "" && name != "" && phone !="") {
		alert("Registered Successfully!");
		open("login.html")
	    }
	else
		{
		  alert("details cannot be empty");
		}
	}

