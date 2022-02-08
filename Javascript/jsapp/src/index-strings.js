//variable declaration
var firstName = "Subramanian"
var lastName = 'Murugan'
//+ string concatnation
console.log(" Name " + firstName + lastName)
// ,
console.log(" Name ", firstName, lastName)
//String interpolation : es 6 feature
console.log(`Name ${firstName} ${lastName}`)
//back tick `` usage
//multi line string
var title = 'Sapient'
var doc = "<html>" +
    "<head>" +
    "<title>" + title + "</title>" +
    "</head>" +
    "<body>" +
    "<h1>Hello</h1>" +
    "</body>";
console.log(doc)

var docOne = `<html>
           <head>
            <title>${title}</title>
            </head>
          <body>
            <h1>Hello</h1>
          </body>
        `;
console.log(docOne)