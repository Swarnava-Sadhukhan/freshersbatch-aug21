const uid=document.getElementById("userId");
const pass=document.getElementById("pwd");
const log=document.getElementById("log");
const database = firebase.database();
const rootRef = database.ref('users');
document.getElementById("hid").style.visibility="hidden";
log.addEventListener("click",login);
function login(){
		var id=uid.value;
		var pwd=pass.value;
		var ref = firebase.database().ref("users");
		ref.once('value',function(snapshot) {
		snapshot.forEach(function(childSnapshot){
        var key = childSnapshot.key;
		if(key === id)
		{
			if(childSnapshot.child("passwrd").val()=== pwd)
			{
				alert("Login Success!");
				window.location.assign("./newpage.html");
			}
			else
			{
				document.getElementById("hid").style.visibility="visible";
				document.getElementById("hid").style.color="red";
				pass.focus();
			}
		}
		else
		{
			alert("Username Doesn't Exists!");
		}
    })   
});
};
function reset(){
    uid.reset();
    pass.reset();
}
//query based call for the data
rootRef.orderByKey().on('value',snpashot =>{
    console.log(snpashot.val());
    
});