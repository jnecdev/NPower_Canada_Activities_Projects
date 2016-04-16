/* 8-1 link JavaScript file */
alert('This is an example of an pop-up alert.');

function newPrice()
{
	var price = 10;
	var newPercent = 0.8;
	var newPrice = price * newPercent;
	document.getElementById("newprice").innerHTML ="NEW PRICE ONLY: $" + newPrice;
	
}

function displayPrice()
{
	var price = 10;
	var newPercent = 0.8;
	var newPrice = price * newPercent;
	var displayPrice = "OLD PRICE: $" + price + "<br> AND <br>" +"NEW PRICE: $" + newPrice;
	document.getElementById("displayprice").innerHTML = displayPrice;
}