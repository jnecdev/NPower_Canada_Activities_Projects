/* Jonathan Nelson Castillo. Development Stream. MTA 98-375. */
/* February 11, 2016. Exercise 9-8 */
/* JavaScript File */		
			
			
			//Global Variables - Variables outside the functions
			var myElement; // Element variable -GLOBAL
			var myInterval; // Interval variable - GLOBAL
			
			//Function for moving the box from start to end.
			function moveFunction()
			{
				//makes the box at the bottom 1px.
				myElement.style.bottom = parseInt(myElement.style.bottom) + 1 + 'px'; 
				//makes the box at the right 2px.
				myElement.style.right = parseInt(myElement.style.right) + 2 + 'px';
				//the text inside the box
				myElement.innerHTML = "Click to stop!";
			}
			
			//Function when user clicks restart button, the box will return to 0,0 bottom-right position.
			function restartFunction() 
			{
				myElement.style.bottom = 0;
				myElement.style.right = 0;
			}
			//Function that when user clicks the box, it will stop.					
			function stopFunction()
			{
				window.clearInterval(myInterval);
				myElement.innerHTML = "Double Click To Start!";
			}
			
			//Function after the restartFunction that if the user double clicks to start, the box will start to move again with a specific time.
			function restartMoveFunction() 
			{
				myInterval = setInterval(moveFunction,40);
			}
			
			//Function that if the user drags the box, it will show the position of pixels from bottom-right.
			//For this scenario, the user must drag the box forward(top left) to see the position of pixels from bottom-right when dragged.
			function dragFunction(mouse)
			{
				//clientX is a mouse event.
				var xPos = mouse.clientX; //Get x value from clients mouse
				myElement.style.bottom = xPos+'px';
				myElement.style.right = xPos+'px';
				myElement.innerHTML="You are at "+xPos+"px";
				//Concatenation of strings. xPos is not in quotations because it depends on the user event.
			}
			
			//init short-term for initialize. 
			//Function that will initialize all functions specifically the event listener with the functions.
			function init()
			{
				myElement = document.getElementById('bottom');
				myElement.style.bottom = '0px';
				myElement.style.right = '0px';
				myInterval = setInterval(moveFunction,80);
				document.getElementById("restartBtn").addEventListener("click", restartFunction);
				//Function should not be in quotations or else it will not work.
				//Syntax: myElement.addEventListener ("event",function);
				myElement.addEventListener("click", stopFunction); 
				myElement.addEventListener("dblclick", restartMoveFunction);
				myElement.addEventListener("drag", dragFunction);
				myElement.addEventListener("dragend", dragFunction);
			}
			
			//Purpose is it will initialize when the window loads.
			window.onload = init;
			
			