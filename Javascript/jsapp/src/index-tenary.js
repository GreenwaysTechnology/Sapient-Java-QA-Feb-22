//if condition
var i = 10;
var j = 20;

//logical and comparsional operators always gives boolean result. -  either true or false.

if (i === j) {
    console.log('i and j are equal')
} else {
    console.log('i and j are not equal')
}

//tenary operator
i === j ? console.log('i and j are equal') : console.log('i and j are not equal')

var result = i === j ? "i and j are equal" : "i and j are not equal"
console.log(result);


//if ..else if
var time = 3
if (time < 10) {
    greeting = "Good morning";
} else if (time < 20) {
    greeting = "Good day";
} else {
    greeting = "Good evening";
}
console.log(greeting)

var today = 3
var day = "";
switch (today) {
    case 0:
        day = "Sunday";
        break;
    case 1:
        day = "Monday";
        break;
    case 2:
        day = "Tuesday";
        break;
    case 3:
        day = "Wednesday";
        break;
    case 4:
        day = "Thursday";
        break;
    case 5:
        day = "Friday";
        break;
    case 6:
        day = "Saturday";
}
console.log(`Today is ${day}`)