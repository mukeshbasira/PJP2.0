


var basicLink= document.querySelector('#twodateSubmit');


basicLink.addEventListener("click", function functionName() {

console.log(document.querySelector('#date1').value);
  let date1 = new Date(document.querySelector('#date1').value);

  let date2 = new Date( document.querySelector('#date2').value);
  let Difference_In_Time = date2.getTime() - date1.getTime();

  // To calculate the no. of days between two dates
  let Difference_In_Days = Difference_In_Time / (1000 * 3600 * 24);
  console.log(Difference_In_Days);
  document.querySelector('#result').innerHTML = ("Result is = " + Difference_In_Days  + "Days");


});


var submitweek= document.querySelector('#submitweek');




submitweek.addEventListener("click", function functionName() {

console.log(document.querySelector('#date1week').value);
  let date1 = new Date(document.querySelector('#date1week').value);
  console.log(date1);
  let onejan = new Date(date1.getFullYear(), 0, 1);
  console.log(onejan);
  let week = Math.ceil( (((date1 - onejan) / 86400000) + onejan.getDay() + 1) / 7 );

  console.log(week);
  document.querySelector('#resultweek').innerHTML = ("Result week is = " + week  );


});





var submitadd= document.querySelector('#submitadd');




submitadd.addEventListener("click", function functionName() {

console.log(document.querySelector('#date1add').value);
  let date2 =  document.querySelector('#date2add').value;
  let date1 = new Date(document.querySelector('#date1add').value);

  let result = new Date(date1.getTime() + date2*24*60*60*1000);




  document.querySelector('#resultadd').innerHTML = ("Result is = " + result  );


});

var submitsub= document.querySelector('#submitsub');




submitsub.addEventListener("click", function functionName() {

console.log(document.querySelector('#date1sub').value);
  let date2 =  document.querySelector('#date2sub').value;
  let date1 = new Date(document.querySelector('#date1sub').value);

  let result = new Date(date1.getTime() - date2*24*60*60*1000);




  document.querySelector('#resultsub').innerHTML = ("Result is = " + result  );


});
