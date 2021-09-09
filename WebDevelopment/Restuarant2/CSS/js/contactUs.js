function clearErrors() {    
    for (var loopCounter = 0; 
        loopCounter < document.forms["fakepage"].elements.length; 
        loopCounter++) {
        if (document.forms["fakepage"].elements[loopCounter]
           .parentElement.className.indexOf("has-") != -1) {
            
            document.forms["fakepage"].elements[loopCounter]
               .parentElement.className = "form-group";
        }
    }    
} 

function resetForm() {
    clearErrors();
    document.forms["fakepage"]["fullname"].value = "";
    document.forms["fakepage"]["email"].value = "";
	document.forms["fakepage"]["pwd"].value = "";
	document.forms["fakepage"]["addInput"].value = "";
    document.getElementById("submitButton").innerText = "Submit";
    document.forms["fakepage"]["fullname"].focus();
}

function validateItems() {
    clearErrors();
    var fullname = document.forms["fakepage"]["fullname"].value;
    var email = document.forms["fakepage"]["email"].value;
    var pwd = document.forms["fakepage"]["pwd"].value;
   if (fullname == "" || !isNaN(fullname)) {
        alert("Name must be filled with valid characters.");
        document.forms["fakepage"]["fullname"]
           .parentElement.className = "form-group has-error";
        document.forms["fakepage"]["fullname"].focus();
        return false;
    }
   
   if (email == "") {
       alert("email must be filled in with valid characters..");
       document.forms["fakepage"]["email"]
          .parentElement.className = "form-group has-error"
       document.forms["fakepage"]["email"].focus();
       return false;
   }
   
   /*if (pwd == "") {
       alert("Password must be filled in with valid characters..");
       document.forms["fakepage"]["pwd"]
          .parentElement.className = "form-group has-error"
       document.forms["fakepage"]["pwd"].focus();
       return false;
   }*/
   else{
   alert("All fields are validated and good");
   return false;  
   }
  // We are returning false so that the form doesn't submit 
   // and so that we can see the results
 
       

}