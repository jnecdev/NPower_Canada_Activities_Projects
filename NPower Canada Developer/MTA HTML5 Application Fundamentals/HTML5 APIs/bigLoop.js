  /* Must be in the same path as the main content file for the webWorkerLoop to work */
  
  function bigLoop(){
         for (var i = 0; i <= 1000000000; i += 1){
            var j = i;
         }
		 /* variable should be changed to j to display 100M.  */
		 /* or else if the variable is set to i, it will display 1000000001 as its value is already 1000000001 before testing the for loop condition */
		 /* postMessage very important for a Web Worker. */
         postMessage(j);
      }
	  
bigLoop();