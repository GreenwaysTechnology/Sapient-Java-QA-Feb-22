function getElements() {
    //get h1 element
    let heading = document.getElementsByTagName('h1')
    console.log(heading)
    for (let i = 0; i < heading.length; i++) {
        console.dir(heading[i].innerHTML); //return 
    }
}
getElements();

//get single Element
function getSingleElement() {
    let value = document.getElementById('hello')
    console.dir(value.innerHTML);
}
getSingleElement();


function createElement() {
    //create h2 element
    var newElement = document.createElement('h2')
    //add innerHtml
    newElement.innerHTML = 'Hey i am new Element';
    //attach this element on existing tree.
    //where you are going to append - inside body
    //get the body
    document.body.appendChild(newElement)
    
}

createElement();

//var emp = new Employee()
//var document = new Document();
//var window =new Window();
//var history = new History()