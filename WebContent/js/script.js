/**
 * 
 */
let xhr =new XMLHttpRequest();

window.onload =function ()
{
    document.getElementById("btnSalary").addEventListener("click", calculateSalary)
}
function calculateSalary()
    {
	xhr.onload = funcionCallBack;
	xhr.open("GET", "CalculateSalaryServlet")
	xhr.send(null);
    }

function funcionCallBack()
{
	document.getElementById("salaryCalculated").innerHTML = xhr.responseText;
	alert("testo")
}

