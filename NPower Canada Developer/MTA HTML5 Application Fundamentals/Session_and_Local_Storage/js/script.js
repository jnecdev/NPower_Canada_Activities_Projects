/* when user types in data in first name and last name text box and clicked login - this function will get the first and last name and will store it in local storage and session storage respectively. */

/* setItem meaning firstName in html will be set to fName and lastName will be set to lName. */

/* getItem is getting the information or id from html to render in the functions.*/

/* removeItem meaning removing certain data into the storages(session and local storage).*/
function login()
		{
			var fName;
			var lName;
			fName = document.getElementById("txtFName").value;
			lName = document.getElementById("txtLName").value;
			localStorage.setItem("firstName", fName);
			document.getElementById("rememberMe").innerHTML = "Local Storage Set to "+localStorage.getItem("firstName");
			sessionStorage.setItem("lastName", lName);
			document.getElementById("mySession").innerHTML = sessionStorage.getItem("lastName")+" is Logged in!";
			alert(sessionStorage.getItem("lastName")+" successfully logged in!");
		
		}
	
	
		/* when user clicked the button, the function would do is that it will remove the last name in the session storage and will display the last name is logged out. */
		 function logout()
		{
		
			sessionStorage.removeItem("lastName");
			document.getElementById("mySession").innerHTML = "Successfully Logged Out!";
			alert("User successfully logged out");
		
		
		}
		
		/* when user clicked the button, the function would do is that it will clear the local storage or will clear login data in the client's device. */
		function clearLocal()
		{
			localStorage.removeItem("firstName");
			document.getElementById("rememberMe").innerHTML = "Local Storage Cleared!";
			alert("User Successfully Cleared Local Storage!"); 
		}
		
		/* init stands for initializing */
		
		function init(){
		//Check to see if Local Storage is set
		/* if first name is null then it will display that the information is not stored in the client's device  */
		if (localStorage.getItem("firstName") == null){	
		document.getElementById("rememberMe").innerHTML = "I Don't Remember you from Local Storage";
		}
		/* hence if firstname is not null then it will display that the information is stored in the client's device. */
		else
		{document.getElementById("rememberMe").innerHTML = "Welcome Back "+localStorage.getItem("firstName");}

		//Check to see if Session Storage is set
		/* if first name is null then it will display that the information doesn't have a session  */
		if (sessionStorage.getItem("lastName") == null){	
		document.getElementById("mySession").innerHTML = "Session Not Set";
		}
		/* if first name is null then it will display that the information is already stored in a session  */
		else
		{document.getElementById("mySession").innerHTML = sessionStorage.getItem("lastName")+" is Logged in!";}
		}
		/* will initialize when window opens or loads. */
		window.onload = init;
		
		
	